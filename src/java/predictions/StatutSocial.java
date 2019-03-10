/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class StatutSocial {
    Connection c=Connect.connexion();
    Statement stm;
    ResultSet rs;
    //Moins necessiteux
    public double cntAllBone(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM `risk` where statutsocial like '%Moins%' and class like '%Bone%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllBrain(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Brain%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllCervix(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Cervix%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllColon(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Colon%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllEndocrine(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Endocrine%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllEye(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Eye%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllFemale(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Female%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllHodgkin(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Hodgkin%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllKidney(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Kidney%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllLiver(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Liver%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllLung(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Lung%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllLymphoid(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Lymphoid%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllMouth(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Mouth%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllNasopharynx(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Nasopharynx%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllOral(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Oral%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllOvary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Ovary%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllSalivary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Salivary%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllSoft(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Moins%' and class like '%Soft%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    
    
    
    
    //Plus necessiteux
    public double cntAllPlusNBone(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Plus%' and class like '%Bone%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllPlusNBrain(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Plus%' and class like '%Brain%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllPlusNEndocrine(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Plus%' and class like '%Endocrine%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllPlusNEye(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Plus%' and class like '%Eye%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllPlusNFemale(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Plus%' and class like '%Female%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllPlusNHodgkin(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Plus%' and class like '%Hodgkin%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllPlusNKidney(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Plus%' and class like '%Kidney%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllPlusNLiver(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Plus%' and class like '%Liver%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllPlusNLung(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Plus%' and class like '%Lung%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllPlusNLymphoid(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Plus%' and class like '%Lymphoid%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllPlusNMelanoma(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Plus%' and class like '%Melanoma%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllPlusNOral(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Plus%' and class like '%Oral%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllPlusNSalivary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Plus%' and class like '%Salivary%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllPlusNSoft(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Plus%' and class like '%Soft%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllPlusNUrinary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Plus%' and class like '%Urinary%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    
    
    
    //Inconnu
    public double cntAllIncBone(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Inconnu%' and class like '%Bone%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllIncBrain(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Inconnu%' and class like '%Brain%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllIncEndocrine(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Inconnu%' and class like '%Endocrine%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllIncEye(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Inconnu%' and class like '%Eye%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllIncFemale(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Inconnu%' and class like '%Female%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllIncHodgkin(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Inconnu%' and class like '%Hodgkin%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllIncKidney(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Inconnu%' and class like '%Kidney%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllIncLiver(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Inconnu%' and class like '%Liver%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllIncLymphoid(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Inconnu%' and class like '%Lymphoid%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllIncNasopharynx(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Inconnu%' and class like '%Nasopharynx%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllIncOral(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Inconnu%' and class like '%Oral%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllIncOvary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Inconnu%' and class like '%Ovary%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllIncSalivary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Inconnu%' and class like '%Salivary%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public double cntAllIncSoft(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("SELECT count(*) as t FROM risk where statutsocial like '%Inconnu%' and class like '%Soft%'");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    public static void main(String[] args) {
        StatutSocial s=new StatutSocial();
        System.out.println(s.cntAllIncSoft());
    }
}
