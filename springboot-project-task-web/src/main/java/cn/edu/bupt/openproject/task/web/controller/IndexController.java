package cn.edu.bupt.openproject.task.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Title: IndexController</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-08 10:18</p>
 * @author ChengTengfei
 * @version 1.0
 */
@Controller
public class IndexController {

    /**
     * 页面跳转
     */
    @RequestMapping("{url}.shtml")
    public String page(@PathVariable("url") String url) {
        return  url;
    }

    /**
     * 页面跳转(二级目录)
     */
    @RequestMapping("{module}/{url}.shtml")
    public String page(@PathVariable("module") String module,
                        @PathVariable("url") String url) {
        return module + "/" + url;
    }

}
