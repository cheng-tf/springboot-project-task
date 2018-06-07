package cn.edu.bupt.openproject.task.web;

import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 * 创建者 科帮网
 * 创建时间	2018年3月28日
 * API接口测试：http://localhost:8080/task/swagger-ui.html
 */
@SpringBootApplication
@ComponentScan(basePackages = "cn.edu.bupt.openproject.task.*")
public class Application {
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) throws InterruptedException, SchedulerException {
		SpringApplication.run(Application.class, args);
		logger.info("项目启动 ");
	}
}