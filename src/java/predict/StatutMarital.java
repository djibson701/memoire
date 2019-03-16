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
public class StatutMarital {
    Connection c=Connect.connexion();
    Statement stm;
    ResultSet rs;
    TypeClasse tc= new TypeClasse();
    public double cntAllSMBone(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Bone%'");
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
    public double cntAllSMBrain(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Brain%'");
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
    public double cntAllSMCervix(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Cervix%'");
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
    public double cntAllSMColon(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Colon%'");
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
    public double cntAllSMEndocrine(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Endocrine%'");
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
    public double cntAllSMEye(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Eye%'");
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
    public double cntAllSMFemale(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Female%'");
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
    public double cntAllSMHodgkin(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Hodgkin%'");
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
    public double cntAllSMKidney(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Kidney%'");
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
    public double cntAllSMLiver(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Liver%'");
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
    public double cntAllSMLung(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Lung%'");
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
    public double cntAllSMLymphoid(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Lymphoid%'");
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
    public double cntAllSMMelanoma(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Melanoma%'");
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
    public double cntAllSMMouth(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Mouth%'");
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
    public double cntAllSMNasopharynx(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Nasopharynx%'");
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
    public double cntAllSMOral(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Oral%'");
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
    public double cntAllSMOvary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Ovary%'");
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
    public double cntAllSMSalivary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Salivary%'");
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
    public double cntAllSMSoft(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Soft%'");
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
    public double cntAllSMUrinary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutmarital like '%Celibataire%' and class like '%Urinary%'");
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
    
    //Calcul des probabilités
    public double pSMBone(){
        return cntAllSMBone()/tc.cntNbreTCBone();
    } 
    public double pSMBrain(){
        return cntAllSMBrain()/tc.cntNbreTCBrain();
    } 
    public double pSMCervix(){
        return cntAllSMCervix()/tc.cntNbreTCCervix();
    } 
    public double pSMColon(){
        return cntAllSMColon()/tc.cntNbreTCColon();
    } 
    public double pSMEndocrine(){
        return cntAllSMEndocrine()/tc.cntNbreTCEndocrine();
    } 
    public double pSMEye(){
        return cntAllSMEye()/tc.cntNbreTCEye();
    } 
    public double pSMFemale(){
        return cntAllSMFemale()/tc.cntNbreTCFemale();
    } 
    public double pSMHodgkin(){
        return cntAllSMHodgkin()/tc.cntNbreTCHodgkin();
    } 
    public double pSMKidney(){
        return cntAllSMKidney()/tc.cntNbreTCKidney();
    } 
    public double pSMLiver(){
        return cntAllSMLiver()/tc.cntNbreTCLiver();
    } 
    public double pSMLung(){
        return cntAllSMLung()/tc.cntNbreTCLung();
    } 
    public double pSMLymphoid(){
        return cntAllSMLymphoid()/tc.cntNbreTCLymphoid();
    } 
    public double pSMMelanoma(){
        return cntAllSMMelanoma()/tc.cntNbreTCMelanoma();
    } 
    public double pSMMouth(){
        return cntAllSMMouth()/tc.cntNbreTCMouth();
    } 
    public double pSMNasopharynx(){
        return cntAllSMNasopharynx()/tc.cntNbreTCNasopharynx();
    } 
    public double pSMOral(){
        return cntAllSMOral()/tc.cntNbreTCOral();
    } 
    public double pSMOvary(){
        return cntAllSMOvary()/tc.cntNbreTCOvary();
    } 
    public double pSMSalivary(){
        return cntAllSMSalivary()/tc.cntNbreTCSalivary();
    } 
    public double pSMSoft(){
        return cntAllSMSoft()/tc.cntNbreTCSoft();
    } 
    public double pSMUrinary(){
        return cntAllSMUrinary()/tc.cntNbreTCUrinary();
    }
}

