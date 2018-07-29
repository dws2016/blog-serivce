package org.study.robot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author dongws
 * @Date 2018/7/29.
 * @Description
 */
@RestController
@RequestMapping("/")
public class IndexController {
    @RequestMapping("")
    public String index(){
        return "I am robot ";
    }
    @RequestMapping("say")
    public String say(String name)
    {
        return "method say:"+name;
    }

}
