package com.basic.boot.web.controller.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    /**
     * Logger.
     */
    private static Logger final logger = LoggerFactory.getLogger(HelloController.class);

    /**
     * indexPage.
     * @return viewtest
     */
    @RequestMapping("/hello")
    public String indexPage() {
        return "viewtest";
    }
}
