package org.study.plan.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dongws
 * @date 2018/7/29
 * @description
 */
@Service
@FeignClient(name = "robot-service")
public interface PlanService {
    @RequestMapping("/say")
    String say(@RequestParam("name") String name);
}
