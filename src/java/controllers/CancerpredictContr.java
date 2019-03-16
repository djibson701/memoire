/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import beans.Risk;
import java.text.DecimalFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author user
 */
@Controller
public class CancerpredictContr {
    @RequestMapping(value = "predict", method = RequestMethod.GET)
    //public String predict(@ModelAttribute(value = "Risk") Risk r,Model model){
    public String predict(Model model){
        //Risk risk=new Risk();
        //DecimalFormat df =new DecimalFormat("0.####");
        //double d=risk.probaBone();
        //model.addAttribute("pb",df.format(d));
        return "predict";
    }
   
 
}
