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
public class StatutFumeur {
    Connection c=Connect.connexion();
    Statement stm;
    ResultSet rs;
    TypeClasse tc= new TypeClasse();
    //Fumeur
    public double cntAllFumBone(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Fumeur%' and class like '%Bone%'");
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
    public double cntAllFumBrain(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Fumeur%' and class like '%Brain%'");
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
    public double cntAllFumEndocrine(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Fumeur%' and class like '%Endocrine%'");
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
    public double cntAllFumEye(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Fumeur%' and class like '%Eye%'");
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
    public double cntAllFumKidney(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Fumeur%' and class like '%Kidney%'");
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
    public double cntAllFumLiver(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Fumeur%' and class like '%Liver%'");
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
    public double cntAllFumLung(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Fumeur%' and class like '%Lung%'");
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
    public double cntAllFumMouth(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Fumeur%' and class like '%Mouth%'");
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
    public double cntAllFumOral(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Fumeur%' and class like '%Oral%'");
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
    public double cntAllFumOvary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Fumeur%' and class like '%Ovary%'");
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
    public double cntAllFumSoft(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Fumeur%' and class like '%Soft%'");
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

    //Calcul des probabilités pour fumeur
    public double pFumBone(){
        return cntAllFumBone()/tc.cntNbreTCBone();
    } 
    public double pFumBrain(){
        return cntAllFumBrain()/tc.cntNbreTCBrain();
    } 
    public double pFumEndocrine(){
        return cntAllFumEndocrine()/tc.cntNbreTCEndocrine();
    } 
    public double pFumEye(){
        return cntAllFumEye()/tc.cntNbreTCEye();
    } 
    public double pFumKidney(){
        return cntAllFumKidney()/tc.cntNbreTCKidney();
    } 
    public double pFumLiver(){
        return cntAllFumLiver()/tc.cntNbreTCLiver();
    } 
    public double pFumLung(){
        return cntAllFumLung()/tc.cntNbreTCLung();
    } 
    public double pFumMouth(){
        return cntAllFumMouth()/tc.cntNbreTCMouth();
    } 
    public double pFumOral(){
        return cntAllFumOral()/tc.cntNbreTCOral();
    } 
    public double pFumOvary(){
        return cntAllFumOvary()/tc.cntNbreTCOvary();
    } 
    public double pFumSoft(){
        return cntAllFumSoft()/tc.cntNbreTCSoft();
    } 
    
    
    //Ex fumeur
    public double cntAllExFumBrain(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Ex Fumeur%' and class like '%Brain%'");
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
    public double cntAllExFumOvary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Ex Fumeur%' and class like '%Ovary%'");
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
    
    //Calcul des probabilités Ex Fumeur
    public double pExFumBrain(){
        return cntAllExFumBrain()/tc.cntNbreTCBrain();
    } 
    public double pExFumOvary(){
        return cntAllExFumOvary()/tc.cntNbreTCOvary();
    } 
    
    //Jamais
    public double cntAllJamBrain(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Brain%'");
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
    public double cntAllJamCervix(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Cervix%'");
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
    public double cntAllJamColon(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Colon%'");
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
    public double cntAllJamEndocrine(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Endocrine%'");
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
    public double cntAllJamEye(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Eye%'");
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
    public double cntAllJamFemale(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Female%'");
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
    public double cntAllJamHodgkin(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Hodgkin%'");
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
    public double cntAllJamKidney(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Kidney%'");
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
    public double cntAllJamLiver(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Liver%'");
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
    public double cntAllJamLung(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Lung%'");
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
    public double cntAllJamLymphoid(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Lymphoid%'");
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
    public double cntAllJamMelanoma(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Melanoma%'");
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
    public double cntAllJamNasopharynx(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Nasopharynx%'");
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
    public double cntAllJamOral(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Oral%'");
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
    public double cntAllJamOvary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Ovary%'");
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
    public double cntAllJamSalivary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Salivary%'");
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
    public double cntAllJamSoft(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Soft%'");
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
    public double cntAllJamUrinary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where statutfumeur like '%Jamais%' and class like '%Urinary%'");
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
    
    //Calcul des probabilités Jamais Fumeur
    public double pJamBrain(){
        return cntAllJamBrain()/tc.cntNbreTCBrain();
    } 
    public double pJamCervix(){
        return cntAllJamCervix()/tc.cntNbreTCCervix();
    } 
    public double pJamColon(){
        return cntAllJamColon()/tc.cntNbreTCColon();
    } 
    public double pJamEndocrine(){
        return cntAllJamEndocrine()/tc.cntNbreTCEndocrine();
    } 
    public double pJamEye(){
        return cntAllJamEye()/tc.cntNbreTCEye();
    } 
    public double pJamFemale(){
        return cntAllJamFemale()/tc.cntNbreTCFemale();
    } 
    public double pJamHodgkin(){
        return cntAllJamHodgkin()/tc.cntNbreTCHodgkin();
    } 
    public double pJamKidney(){
        return cntAllJamKidney()/tc.cntNbreTCKidney();
    } 
    public double pJamLiver(){
        return cntAllJamLiver()/tc.cntNbreTCLiver();
    } 
    public double pJamLung(){
        return cntAllJamLung()/tc.cntNbreTCLung();
    } 
    public double pJamLymphoid(){
        return cntAllJamLymphoid()/tc.cntNbreTCLymphoid();
    } 
    public double pJamMelanoma(){
        return cntAllJamMelanoma()/tc.cntNbreTCMelanoma();
    } 
    public double pJamNasopharynx(){
        return cntAllJamNasopharynx()/tc.cntNbreTCNasopharynx();
    } 
    public double pJamOral(){
        return cntAllJamOral()/tc.cntNbreTCOral();
    } 
    public double pJamOvary(){
        return cntAllJamOvary()/tc.cntNbreTCOvary();
    }    
    public double pJamSalivary(){
        return cntAllJamSalivary()/tc.cntNbreTCSalivary();
    } 
    public double pJamSoft(){
        return cntAllJamSoft()/tc.cntNbreTCSoft();
    } 
    public double pJamUrinary(){
        return cntAllJamUrinary()/tc.cntNbreTCUrinary();
    } 

}
