package com.hanks.instance.pattern.controller;

import com.hanks.instance.pattern.service.ContorlFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@Validated
@RequestMapping("/controlFlow")
public class ControlFlowController {
    @Autowired
    private ContorlFlow contorlFlow;

    @GetMapping("/controlFlowWithOutPattern")
    public String inquiryWithOutPattern(@NotNull(message = "请选择水果") String fruitName,
                                        @NotNull(message = "请登录") String level) {
        String price = contorlFlow.inquiryWithOutPattern(fruitName, level);
        return price;
    }

    @GetMapping("/controlFlowWithPattern")
    public String inquiryWithPattern(@NotNull(message = "请选择水果") String fruitName,
                                     @NotNull(message = "请登录") String level) {
        String price = contorlFlow.inquiryWithPattern(fruitName, level);
        return price;
    }
}
