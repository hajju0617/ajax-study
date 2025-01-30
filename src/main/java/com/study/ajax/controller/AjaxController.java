package com.study.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
    @GetMapping("/ex01")
    public String ex01() {
        System.out.println("AjaxController.ex01");
        return "index";
    }

    @PostMapping("/ex02")
    @ResponseBody
    public String ex02() {
        System.out.println("AjaxController.ex02");
        return "index";
    }

    @GetMapping("/ex03")
    @ResponseBody
    public String ex03(@RequestParam("param1") String param1
            , @RequestParam("param2") String param2) {
        System.out.println("param1 = " + param1);
        System.out.println("param2 = " + param2);
        return "ex03 메서드 정상적으로 호출 완료.";
    }

    @PostMapping("/ex04")
    @ResponseBody
    public String ex04(@RequestParam("param1") String param1
                     , @RequestParam("param2") String param2) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
        return "ex04 메서드 정상적으로 호출 완료.";
    }
}
