package org.example.sbx.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : sbx
 * @Classname : PaymentController
 * @Description : TODO
 * @Date : 2023/7/7 10:36
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    private String getPayment(@PathVariable Integer id) {
        return "nacos registry, serverPort: " + serverPort + "\t id" + id;
    }
}
