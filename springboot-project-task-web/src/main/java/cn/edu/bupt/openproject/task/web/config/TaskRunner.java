package cn.edu.bupt.openproject.task.web.config;

import cn.edu.bupt.openproject.task.domain.pojo.QuartzEntity;
import cn.edu.bupt.openproject.task.service.IJobService;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * <p>Title: TaskRunner</p>
 * <p>Description: 初始化一个测试Demo任务</p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-08 10:24</p>
 * @author ChengTengfei
 * @version 1.0
 */
@Component
public class TaskRunner implements ApplicationRunner {

    private final static Logger LOGGER = LoggerFactory.getLogger(TaskRunner.class);

    @Autowired
    private IJobService jobService;

    @Autowired
    private Scheduler scheduler;

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public void run(ApplicationArguments var) throws Exception{
        Long count = jobService.listQuartzEntity(null);
        if(count == 0){
            LOGGER.info("初始化测试任务");
            QuartzEntity quartz = new QuartzEntity();
            quartz.setJobName("test01");
            quartz.setJobGroup("test");
            quartz.setDescription("测试任务");
            quartz.setJobClassName("cn.edu.bupt.openproject.task.web.job.ChickenJob");
            quartz.setCronExpression("0/20 * * * * ?");
            Class cls = Class.forName(quartz.getJobClassName()) ;
            cls.newInstance();
            // 任务类
            JobDetail job = JobBuilder.newJob(cls)
                    .withIdentity(quartz.getJobName(), quartz.getJobGroup())
                    .withDescription(quartz.getDescription())
                    .build();
            job.getJobDataMap().put("itstyle", "科帮网欢迎你");
            job.getJobDataMap().put("blog", "https://blog.52itstyle.com");
            job.getJobDataMap().put("data", new String[]{"张三","李四"});
            // 触发时间点
            CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(quartz.getCronExpression());
            // 触发器
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("trigger"+quartz.getJobName(), quartz.getJobGroup())
                    .startNow()
                    .withSchedule(cronScheduleBuilder)
                    .build();
            // 调度
            scheduler.scheduleJob(job, trigger);
        }
    }

}
