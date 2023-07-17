package org.example.sbx.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.TIMEOUT;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author : sbx
 * @Classname : FlowLimitController
 * @Description : TODO
 * @Date : 2023/7/13 17:20
 */
@RestController
@Slf4j
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "------testB";
    }

    @GetMapping("/testC")
    public String testC() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            log.error(e.getMessage(), e);
        }
        log.info("testC测试慢比例调用");
        return "------testC";
    }

    @GetMapping("/testE")
    public String testExNum() {
        log.info("testE 测试异常比例");
        int age = 10 / 0;
        return "------testE 测试异常比例";
    }
}
