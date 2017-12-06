package com.haha.health.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gaige on 2017/12/4.
 */
@Controller
@RequestMapping("health")
public class BaseController {
    public Logger logger = LoggerFactory.getLogger(this.getClass());
}
