package org.study.plan.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author dongws
 * @Date 2018/7/28.
 * @Description
 */
@RestController
@RequestMapping("/")
public class IndexController {
    @RequestMapping("")
    public String index(){
        return "wellcome";
    }
}
