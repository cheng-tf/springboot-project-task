package cn.edu.bupt.openproject.task.web.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <p>Title: MyAdapter</p>
 * <p>Description: 配置首页 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-08 10:20</p>
 * @author ChengTengfei
 * @version 1.0
 */
@Configuration
public class MyAdapter implements WebMvcConfigurer {
    @Override
    public void addViewControllers( ViewControllerRegistry registry ) {
        registry.addViewController( "/" ).setViewName( "forward:/login.shtml" );
        registry.setOrder( Ordered.HIGHEST_PRECEDENCE );
    }
}
