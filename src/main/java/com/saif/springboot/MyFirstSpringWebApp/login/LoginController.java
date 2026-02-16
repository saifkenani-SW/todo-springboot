package com.saif.springboot.MyFirstSpringWebApp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class LoginController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping({"login"})
    public String goToLoginPage(@RequestParam String name, ModelMap model) {
        logger.debug("Request param is {} ", name);
        logger.info("I want this printed in info level ");
        logger.warn("I want this printed in warn level");

        model.put("name", name);
        System.out.println(name + "Not Recommended");
        return "login";
    }
}
