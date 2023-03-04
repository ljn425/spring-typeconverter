package hello.typeconverter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request) {
        String data = request.getParameter("data");
        Integer value = Integer.valueOf(data);
        System.out.println("value = " + value);
        return "ok";
    }

    @GetMapping("/hello-v2")
    public String helloV2(@RequestParam int data) {
        System.out.println("data = " + data);
        return "ok";
    }
}
