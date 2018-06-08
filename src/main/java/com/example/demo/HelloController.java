package com.example.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by i-feng on 2018/5/24.
 */

@Api(value = "Hello")
@RestController
//@RequestMapping("/api")
public class HelloController {


    @ApiOperation(value = "hello world", notes = "first swagger API")
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request) {

        String trim = "".trim();
        String trim1 = request.getParameter("dd");
        String ss = trim1.trim();

        return "Hello World";
    }

    @ApiOperation(value = "hello world", notes = "hi swagger API")
    @RequestMapping("/hi")
    public String hi(HttpServletRequest request) {

        String trim = "".trim();
        String trim1 = request.getParameter("dd");
        String ss = trim1.trim();

        return "hi World";
    }

}
