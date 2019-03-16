/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author user
 */
@Controller
public class ResultatsContr {
    @RequestMapping(value = "resultats", method = RequestMethod.GET)
    //public String bone(@RequestParam("sexe")String s,Model model){
    public String bone(
            @RequestParam("classeage")String classeage,
            @RequestParam("situation")String situation,
            @RequestParam("lieu")String lieu,
            @RequestParam("country")String country,
            @RequestParam("fumeur")String fumeur,
            Model model){
        String cla=classeage;
        String sit=situation;
        String li=lieu;
        String count=country;
        String fum=fumeur;
        model.addAttribute("cla", cla);
        model.addAttribute("sit", sit);
        model.addAttribute("li", li);
        model.addAttribute("count", count);
        model.addAttribute("fum", fum);
        //String ss=s;
        //model.addAttribute("sss", ss);
        //Risk risk=new Risk();
        //model.addAttribute("pb",risk);
        return "resultats";
    }
}
