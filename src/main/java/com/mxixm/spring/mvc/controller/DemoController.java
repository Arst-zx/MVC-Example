package com.mxixm.spring.mvc.controller;

import com.mxixm.spring.mvc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 声明为Spring MVC的控制器，并作为Bean注册到Spring容器中
 * @author 章鑫
 */
@Controller
public class DemoController {

    /**
     * 声明式依赖DemoService
     */
    @Autowired
    private DemoService demoService;

    /**
     * 声明根路径请求使用该方法处理逻辑
     * @param model
     * @return
     */
    @RequestMapping("/")
    /**
     * 方法引入Model属性，以便供视图使用MVC中的模型
     */
    public String index(Model model) {
        String name = demoService.getName(1);

        /**
         * 为数据模型添加属性name，供视图使用
         */
        model.addAttribute("name", name);

        /**
         * 返回index视图
         */
        return "index";
    }

}
