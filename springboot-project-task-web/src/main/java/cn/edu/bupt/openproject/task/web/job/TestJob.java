package cn.edu.bupt.openproject.task.web.job;
/**
 * <p>Title: TestJob</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-08 10:23</p>
 * @author ChengTengfei
 * @version 1.0
 */

import cn.edu.bupt.openproject.task.service.IJobService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * 实现序列化接口、防止重启应用出现quartz Couldn't retrieve job because a required class was not found 的问题
 */
public class TestJob implements Job,Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    private IJobService jobService;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println(jobService);//注入jobService 执行相关业务操作
        System.out.println("任务执行成功");
    }

}