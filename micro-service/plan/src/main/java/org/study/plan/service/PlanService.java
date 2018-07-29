package org.study.plan.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author dongws
 * @Date 2018/7/29.
 * @Description
 */
@Service
@FeignClient(name = "robot-service")
public interface PlanService {
    @RequestMapping("/say")
    String say(@RequestParam("name") String name);
}
