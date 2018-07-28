package org.study.plan.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author dongws
 * @Date 2018/7/28.
 * @Description
 */
@RestController
@RequestMapping("/plan")
public class PlanController {
    @RequestMapping("")
    public String index(){
        return "this is my plan";
    }
}
