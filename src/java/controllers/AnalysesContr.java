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



/**
 *
 * @author user
 */
@Controller
public class AnalysesContr {
    @RequestMapping(value = "analyse", method = RequestMethod.GET)
    public String analyse(Model model){
        return "analyse";
    }
}
