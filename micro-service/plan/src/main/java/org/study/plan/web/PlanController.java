package org.study.plan.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.study.plan.service.PlanService;

/**
 * @Author dongws
 * @Date 2018/7/28.
 * @Description
 */
@RestController
@RequestMapping("/plan")
@Slf4j
public class PlanController {

    @Autowired
    PlanService planService;

    @RequestMapping("")
    public String index(){
        log.info(planService.say("hello"));
        return "this is my plan";
    }
}
