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
public class Sexe {
    Connection c=Connect.connexion();
    Statement stm;
    ResultSet rs;
    TypeClasse tc= new TypeClasse();
    public double cntAllSexeBone(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Bone%'");
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
    public double cntAllSexeBrain(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Brain%'");
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
    public double cntAllSexeCervix(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Cervix%'");
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
    public double cntAllSexeColon(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Colon%'");
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
    public double cntAllSexeEndocrine(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Endocrine%'");
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
    public double cntAllSexeEye(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Eye%'");
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
    public double cntAllSexeFemale(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Female%'");
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
    public double cntAllSexeHodgkin(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Hodgkin%'");
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
    public double cntAllSexeKidney(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Kidney%'");
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
    public double cntAllSexeLiver(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Liver%'");
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
    public double cntAllSexeLung(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Lung%'");
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
    public double cntAllSexeLymphoid(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Lymphoid%'");
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
    public double cntAllSexeMelanoma(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Melanoma%'");
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
    public double cntAllSexeMouth(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Mouth%'");
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
    public double cntAllSexeNasopharynx(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Nasopharynx%'");
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
    public double cntAllSexeOral(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Oral%'");
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
    public double cntAllSexeOvary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Ovary%'");
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
    public double cntAllSexeSalivary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Salivary%'");
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
    public double cntAllSexeSoft(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Soft%'");
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
    public double cntAllSexeUrinary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where sexe like '%Feminin%' and class like '%Urinary%'");
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
    
    //Calcul des probabilités pour la classe Sexe
    public double pSexeBone(){
        return cntAllSexeBone()/tc.cntNbreTCBone();
    } 
    public double pSexeBrain(){
        return cntAllSexeBrain()/tc.cntNbreTCBrain();
    } 
    public double pSexeCervix(){
        return cntAllSexeCervix()/tc.cntNbreTCCervix();
    } 
    public double pSexeColon(){
        return cntAllSexeColon()/tc.cntNbreTCColon();
    } 
    public double pSexeEndocrine(){
        return cntAllSexeEndocrine()/tc.cntNbreTCEndocrine();
    } 
    public double pSexeEye(){
        return cntAllSexeEye()/tc.cntNbreTCEye();
    } 
    public double pSexeFemale(){
        return cntAllSexeFemale()/tc.cntNbreTCFemale();
    } 
    public double pSexeHodgkin(){
        return cntAllSexeHodgkin()/tc.cntNbreTCHodgkin();
    } 
    public double pSexeKidney(){
        return cntAllSexeKidney()/tc.cntNbreTCKidney();
    } 
    public double pSexeLiver(){
        return cntAllSexeLiver()/tc.cntNbreTCLiver();
    } 
    public double pSexeLung(){
        return cntAllSexeLung()/tc.cntNbreTCLung();
    } 
    public double pSexeLymphoid(){
        return cntAllSexeLymphoid()/tc.cntNbreTCLymphoid();
    } 
    public double pSexeMelanoma(){
        return cntAllSexeMelanoma()/tc.cntNbreTCMelanoma();
    } 
    public double pSexeMouth(){
        return cntAllSexeMouth()/tc.cntNbreTCMouth();
    } 
    public double pSexeNasopharynx(){
        return cntAllSexeNasopharynx()/tc.cntNbreTCNasopharynx();
    } 
    public double pSexeOral(){
        return cntAllSexeOral()/tc.cntNbreTCOral();
    } 
    public double pSexeOvary(){
        return cntAllSexeOvary()/tc.cntNbreTCOvary();
    } 
    public double pSexeSalivary(){
        return cntAllSexeSalivary()/tc.cntNbreTCSalivary();
    } 
    public double pSexeSoft(){
        return cntAllSexeSoft()/tc.cntNbreTCSoft();
    } 
    public double pSexeUrinary(){
        return cntAllSexeUrinary()/tc.cntNbreTCUrinary();
    } 
    
}
