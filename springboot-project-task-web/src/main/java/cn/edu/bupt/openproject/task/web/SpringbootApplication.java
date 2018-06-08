package cn.edu.bupt.openproject.task.web;

import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>Title: SpringbootApplication</p>
 * <p>Description: 启动类 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-08 10:31</p>
 * @author ChengTengfei
 * @version 1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = "cn.edu.bupt.openproject.task.*")
public class SpringbootApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);

    public static void main(String[] args) throws InterruptedException, SchedulerException {
        SpringApplication.run(SpringbootApplication.class, args);
        logger.info("项目启动 ");
    }
}
