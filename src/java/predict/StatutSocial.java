/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predict;

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
    TypeClasse tc= new TypeClasse();
    //Moins necessiteux
    public double cntAllSSBone(){
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
    public double cntAllSSBrain(){
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
    public double cntAllSSCervix(){
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
    public double cntAllSSColon(){
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
    public double cntAllSSEndocrine(){
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
    public double cntAllSSEye(){
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
    public double cntAllSSFemale(){
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
    public double cntAllSSHodgkin(){
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
    public double cntAllSSKidney(){
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
    public double cntAllSSLiver(){
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
    public double cntAlSSlLung(){
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
    public double cntAllSSLymphoid(){
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
    public double cntAllSSMouth(){
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
    public double cntAllSSNasopharynx(){
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
    public double cntAllSSOral(){
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
    public double cntAllSSOvary(){
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
    public double cntAllSSSalivary(){
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
    public double cntAllSSSoft(){
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
    
    
    //Calcul des probabilités Moins Necessiteux
    public double pSSBone(){
        return cntAllSSBone()/tc.cntNbreTCBone();
    }
    public double pSSBrain(){
        return cntAllSSBrain()/tc.cntNbreTCBrain();
    }
    public double pSSCervix(){
        return cntAllSSCervix()/tc.cntNbreTCCervix();
    }
    public double pSSColon(){
        return cntAllSSColon()/tc.cntNbreTCColon();
    }
    public double pSSEndocrine(){
        return cntAllSSEndocrine()/tc.cntNbreTCEndocrine();
    }
    public double pSSEye(){
        return cntAllSSEye()/tc.cntNbreTCEye();
    }
    public double pSSFemale(){
        return cntAllSSFemale()/tc.cntNbreTCFemale();
    }
    public double pSSHodgkin(){
        return cntAllSSHodgkin()/tc.cntNbreTCHodgkin();
    }
    public double pSSKidney(){
        return cntAllSSKidney()/tc.cntNbreTCKidney();
    }
    public double pSSLiver(){
        return cntAllSSLiver()/tc.cntNbreTCLiver();
    }
    public double pSSlLung(){
        return cntAlSSlLung()/tc.cntNbreTCLung();
    }
    public double pSSLymphoid(){
        return cntAllSSLymphoid()/tc.cntNbreTCLymphoid();
    }
    public double pSSMouth(){
        return cntAllSSMouth()/tc.cntNbreTCMouth();
    }
    public double pSSNasopharynx(){
        return cntAllSSNasopharynx()/tc.cntNbreTCNasopharynx();
    }
    public double pSSOral(){
        return cntAllSSOral()/tc.cntNbreTCOral();
    }
    public double pSSOvary(){
        return cntAllSSOvary()/tc.cntNbreTCOvary();
    }
    public double pSSSalivary(){
        return cntAllSSSalivary()/tc.cntNbreTCSalivary();
    }
    public double pSSSoft(){
        return cntAllSSSoft()/tc.cntNbreTCSoft();
    }
    
   
    
    //Plus necessiteux
    public double cntAllSSPlusNBone(){
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
    public double cntAllSSPlusNBrain(){
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
    public double cntAllSSPlusNEndocrine(){
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
    public double cntAllSSPlusNEye(){
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
    public double cntAllSSPlusNFemale(){
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
    public double cntAllSSPlusNHodgkin(){
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
    public double cntAllSSPlusNKidney(){
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
    public double cntAllSSPlusNLiver(){
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
    public double cntAllSSPlusNLung(){
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
    public double cntAllSSPlusNLymphoid(){
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
    public double cntAllSSPlusNMelanoma(){
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
    public double cntAllSSPlusNOral(){
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
    public double cntAllSSPlusNSalivary(){
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
    public double cntAllSSPlusNSoft(){
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
    public double cntAllSSPlusNUrinary(){
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
    
    
    //Calcul des probabilités plus nécessiteux
    public double pSSPlusNBone(){
        return cntAllSSPlusNBone()/tc.cntNbreTCBone();
    }
    public double pSSPlusNBrain(){
        return cntAllSSPlusNBrain()/tc.cntNbreTCBrain();
    }
    public double pSSPlusNEndocrine(){
        return cntAllSSPlusNEndocrine()/tc.cntNbreTCEndocrine();
    }
    public double pSSPlusNEye(){
        return cntAllSSPlusNEye()/tc.cntNbreTCEye();
    }
    public double pSSPlusNFemale(){
        return cntAllSSPlusNFemale()/tc.cntNbreTCFemale();
    }
    public double pSSPlusNHodgkin(){
        return cntAllSSPlusNHodgkin()/tc.cntNbreTCHodgkin();
    }
    public double pSSPlusNKidney(){
        return cntAllSSPlusNKidney()/tc.cntNbreTCKidney();
    }
    public double pSSPlusNLiver(){
        return cntAllSSPlusNLiver()/tc.cntNbreTCLiver();
    }
    public double pSSPlusNLung(){
        return cntAllSSPlusNLung()/tc.cntNbreTCLung();
    }
    public double pSSPlusNLymphoid(){
        return cntAllSSPlusNLymphoid()/tc.cntNbreTCLymphoid();
    }
    public double pSSPlusNMelanoma(){
        return cntAllSSPlusNMelanoma()/tc.cntNbreTCMelanoma();
    }
    public double pSSPlusNOral(){
        return cntAllSSPlusNOral()/tc.cntNbreTCOral();
    }
    public double pSSPlusNSalivary(){
        return cntAllSSPlusNSalivary()/tc.cntNbreTCSalivary();
    }
    public double pSSPlusNSoft(){
        return cntAllSSPlusNSoft()/tc.cntNbreTCSoft();
    }
    public double pSSPlusNUrinary(){
        return cntAllSSPlusNUrinary()/tc.cntNbreTCUrinary();
    }

    
    
    //Inconnu
    public double cntAllSSIncBone(){
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
    public double cntAllSSIncBrain(){
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
    public double cntAllSSIncEndocrine(){
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
    public double cntAllSSIncEye(){
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
    public double cntAllSSIncFemale(){
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
    public double cntAllSSIncHodgkin(){
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
    public double cntAllSSIncKidney(){
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
    public double cntAllSSIncLiver(){
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
    public double cntAllSSIncLymphoid(){
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
    public double cntAllSSIncNasopharynx(){
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
    public double cntAllSSIncOral(){
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
    public double cntAllSSIncOvary(){
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
    public double cntAllSSIncSalivary(){
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
    public double cntAllSSIncSoft(){
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
    
    //Calcul des probabilités inconnues
    public double pSSIncBone(){
        return cntAllSSIncBone()/tc.cntNbreTCBone();
    }
    public double pSSIncBrain(){
        return cntAllSSIncBrain()/tc.cntNbreTCBrain();
    }
    public double pSSIncEndocrine(){
        return cntAllSSIncEndocrine()/tc.cntNbreTCEndocrine();
    }
    public double pSSIncEye(){
        return cntAllSSIncEye()/tc.cntNbreTCEye();
    }
    public double pSSIncFemale(){
        return cntAllSSIncFemale()/tc.cntNbreTCFemale();
    }
    public double pSSIncHodgkin(){
        return cntAllSSIncHodgkin()/tc.cntNbreTCHodgkin();
    }
    public double pSSIncKidney(){
        return cntAllSSIncKidney()/tc.cntNbreTCKidney();
    }
    public double pSSIncLiver(){
        return cntAllSSIncLiver()/tc.cntNbreTCLiver();
    }
    public double pSSIncLymphoid(){
        return cntAllSSIncLymphoid()/tc.cntNbreTCLymphoid();
    }
    public double pSSIncNasopharynx(){
        return cntAllSSIncNasopharynx()/tc.cntNbreTCNasopharynx();
    }
    public double pSSIncOral(){
        return cntAllSSIncOral()/tc.cntNbreTCOral();
    }
    public double pSSIncOvary(){
        return cntAllSSIncOvary()/tc.cntNbreTCOvary();
    }
    public double pSSIncSalivary(){
        return cntAllSSIncSalivary()/tc.cntNbreTCSalivary();
    }
    public double pSSIncSoft(){
        return cntAllSSIncSoft()/tc.cntNbreTCSoft();
    }
    
    
}
