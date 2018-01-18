package org.o7planning.tiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
@RequestMapping(value = {"/","home"},method = RequestMethod.GET)
    public String homePage(Model model){
    return "homePage";
}
@RequestMapping(value = {"contactus"},method = RequestMethod.GET)
    public String contactusPage(Model model){
    model.addAttribute("adress","Metlaoui");
    model.addAttribute("phone","24733120");
    model.addAttribute("email","marwenjaffel@gmail.com");
    return "contactusPage";
}
}
