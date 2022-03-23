package cn.lf.jenkinstest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test1")
    public String test1(String name){
        System.out.println("11111111111111111");
        StringBuffer sb = new StringBuffer();
        sb.append("Go,Go,Go!");
        sb.append(name);
        return sb.toString();
    }
}
