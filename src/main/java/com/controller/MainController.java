package com.controller;

import com.utils.ModuleAndView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class MainController {
    private String module = "base";
    private ModuleAndView views = new ModuleAndView(module);
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping("/basic")
    public ModelAndView basicView() {
        logger.info("hello world");
        views.setTemplate("hello.ftl");

        return views.render();
    }
}
