/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import modele.CancerpredictMod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author user
 */
@Controller
public class CancerpredictContr {
    @RequestMapping(value = "predict", method = RequestMethod.GET)
    public String predict(Model model){
        return "predict";
    }
    @RequestMapping(value = "researchall", method = RequestMethod.GET)
    public String getAllCancers(Model model){
        CancerpredictMod cpm=new CancerpredictMod();
        model.addAttribute("listCancer",cpm.rechercherTout());
        return "predict";
    }
}
