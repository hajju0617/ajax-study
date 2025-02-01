package com.study.ajax.controller;

import com.study.ajax.dto.AjaxDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/ex05")
    @ResponseBody
    public AjaxDto ex05(@ModelAttribute AjaxDto ajaxDto) {
        System.out.println("ajaxDto = " + ajaxDto);
        System.out.println("ajaxDto.getParam1() = " + ajaxDto.getParam1());
        System.out.println("ajaxDto.getParam2() = " + ajaxDto.getParam2());
        return ajaxDto;
    }

    @PostMapping("/ex06")
    @ResponseBody
    public AjaxDto ex06(@ModelAttribute AjaxDto ajaxDto) {
        System.out.println("ajaxDto = " + ajaxDto);
        System.out.println("ajaxDto.getParam1() = " + ajaxDto.getParam1());
        System.out.println("ajaxDto.getParam2() = " + ajaxDto.getParam2());
        return ajaxDto;
    }

    @PostMapping("/ex07")
    @ResponseBody
    public AjaxDto ex07(@RequestBody AjaxDto ajaxDto) {
        System.out.println("ajaxDto = " + ajaxDto);
        System.out.println("ajaxDto.getParam1() = " + ajaxDto.getParam1());
        System.out.println("ajaxDto.getParam2() = " + ajaxDto.getParam2());
        return ajaxDto;
    }

    private List<AjaxDto> DTOList() {
        List<AjaxDto> dtoList = new ArrayList<>();
        dtoList.add(new AjaxDto("data1", "data11"));
        dtoList.add(new AjaxDto("data2", "data22"));
        return dtoList;
    }

    @PostMapping("/ex08")
    @ResponseBody
    public List<AjaxDto> ex08(@RequestBody AjaxDto ajaxDto) {
        System.out.println("ajaxDto = " + ajaxDto);
        System.out.println("ajaxDto.getParam1() = " + ajaxDto.getParam1());
        System.out.println("ajaxDto.getParam2() = " + ajaxDto.getParam2());
        List<AjaxDto> dtoList = DTOList();
        dtoList.add(ajaxDto);
        return dtoList;
    }

    @PostMapping("/ex09")
    public ResponseEntity<AjaxDto> ex09(@RequestBody AjaxDto ajaxDto) {
        System.out.println("ajaxDto = " + ajaxDto);
        System.out.println("ajaxDto.getParam1() = " + ajaxDto.getParam1());
        System.out.println("ajaxDto.getParam2() = " + ajaxDto.getParam2());
        return ResponseEntity.status(HttpStatus.OK).body(ajaxDto);
//        return new ResponseEntity<>(ajaxDto, HttpStatus.OK);      // 이 방식도 가능.
    }

    @PostMapping("/ex10")
    public ResponseEntity<List<AjaxDto>> ex10(@RequestBody AjaxDto ajaxDto) {
        System.out.println("ajaxDto = " + ajaxDto);
        System.out.println("ajaxDto.getParam1() = " + ajaxDto.getParam1());
        System.out.println("ajaxDto.getParam2() = " + ajaxDto.getParam2());
        List<AjaxDto> dtoList = DTOList();
        dtoList.add(ajaxDto);
        return ResponseEntity.status(HttpStatus.OK).body(dtoList);
//        return new ResponseEntity<>(dtoList, HttpStatus.OK);      // 이 방식도 가능.
    }
}
