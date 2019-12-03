package com.novaimpact.drvlg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController2 {

    @GetMapping("/greeting2")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting2";
    }

    @PostMapping("/greeting2")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }
}