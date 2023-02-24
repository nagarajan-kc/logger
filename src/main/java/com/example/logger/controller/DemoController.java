package com.example.logger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
Logger logger=LoggerFactory.getLogger(DemoController.class);
    @GetMapping("/demo")
    public String demo(){
         logger.info("Info demo");
        logger.error("demoERROR on the file  ");
        logger.debug("hi hello");
        logger.trace("trace method of logger");
        return "DEMO PROJECT OF THE LOGGER";
    }
}
