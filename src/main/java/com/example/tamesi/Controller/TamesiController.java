package com.example.tamesi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.tamesi.Form.TamesiForm;

@Controller
@RequestMapping("/tamesi")
public class TamesiController {
    
    @ModelAttribute
    public TamesiForm setUpTamesiForm() {
        return new TamesiForm();
    }

    @RequestMapping("")
    public String infoForm() {
        return "a";
    }

    @RequestMapping("/receiveInfo")
    public String receiveInfo(TamesiForm form, Model model) {
        model.addAttribute("form", form);
        return "index";
    }
}
