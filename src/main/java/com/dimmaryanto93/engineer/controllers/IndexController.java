package com.dimmaryanto93.engineer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dimmaryanto93 on 06/03/17.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("login")
    public String halamanUtama(Model model) {
        model.addAttribute("pesan", "Halo World!");
        return "/login";
    }
}
