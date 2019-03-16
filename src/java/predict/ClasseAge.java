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
public class ClasseAge {
    Connection c=Connect.connexion();
    Statement stm;
    ResultSet rs;
    TypeClasse tc= new TypeClasse();
    
    //Classe 00_04
    public double cntAllTCla0004Brain(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%00_04%' and class like '%Brain%'");
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
    public double cntAllTCla0004Endocrine(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%00_04%' and class like '%Endocrine%'");
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
    public double cntAllTCla0004Eye(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%00_04%' and class like '%Eye%'");
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
    public double cntAllTCla0004Female(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%00_04%' and class like '%Female%'");
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
    public double cntAllTCla0004Hodgkin(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%00_04%' and class like '%Hodgkin%'");
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
    public double cntAllTCla0004Kidney(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%00_04%' and class like '%Kidney%'");
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
    public double cntAllTCla0004Liver(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%00_04%' and class like '%Liver%'");
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
    public double cntAllTCla0004Lung(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%00_04%' and class like '%Lung%'");
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
    public double cntAllTCla0004Lymphoid(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%00_04%' and class like '%Lymphoid%'");
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
    public double cntAllTCla0004Mouth(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%00_04%' and class like '%Mouth%'");
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
    public double cntAllTCla0004Nasopharynx(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%00_04%' and class like '%Nasopharynx%'");
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
    public double cntAllTCla0004Ovary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%00_04%' and class like '%Ovary%'");
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
    public double cntAllTCla0004Soft(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%00_04%' and class like '%Soft%'");
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
    public double cntAllTCla0004Urinary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%00_04%' and class like '%Urinary%'");
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
    
    //Calcul des probabilités pour 00_04
    public double pTCla0004Brain(){
        return cntAllTCla0004Brain()/tc.cntNbreTCBrain();
    }
    public double pTCla0004Endocrine(){
        return cntAllTCla0004Endocrine()/tc.cntNbreTCEndocrine();
    }
    public double pTCla0004Eye(){
        return cntAllTCla0004Eye()/tc.cntNbreTCEye();
    }
    public double pTCla0004Female(){
        return cntAllTCla0004Female()/tc.cntNbreTCFemale();
    }
    public double pTCla0004Hodgkin(){
        return cntAllTCla0004Hodgkin()/tc.cntNbreTCHodgkin();
    }
    public double pTCla0004Kidney(){
        return cntAllTCla0004Kidney()/tc.cntNbreTCBrain();
    }
    public double pTCla0004Liver(){
        return cntAllTCla0004Liver()/tc.cntNbreTCLiver();
    }
    public double pTCla0004Lung(){
        return cntAllTCla0004Lung()/tc.cntNbreTCLung();
    }
    public double pTCla0004Lymphoid(){
        return cntAllTCla0004Lymphoid()/tc.cntNbreTCLymphoid();
    }
    public double pTCla0004Mouth(){
        return cntAllTCla0004Mouth()/tc.cntNbreTCMouth();
    }
    public double pTCla0004Nasopharynx(){
        return cntAllTCla0004Nasopharynx()/tc.cntNbreTCNasopharynx();
    }
    public double pTCla0004Ovary(){
        return cntAllTCla0004Ovary()/tc.cntNbreTCOvary();
    }
    public double pTCla0004Soft(){
        return cntAllTCla0004Soft()/tc.cntNbreTCSoft();
    }
    public double pTCla0004Urinary(){
        return cntAllTCla0004Urinary()/tc.cntNbreTCUrinary();
    }  

    
    
    //Classe 05_09
    public double cntAllTCla0509Bone(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%05_09%' and class like '%Bone%'");
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
    public double cntAllTCla0509Brain(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%05_09%' and class like '%Brain%'");
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
    public double cntAllTCla0509Endocrine(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%05_09%' and class like '%Endocrine%'");
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
    public double cntAllTCla0509Eye(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%05_09%' and class like '%Eye%'");
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
    public double cntAllTCla0509Female(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%05_09%' and class like '%Female%'");
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
    public double cntAllTCla0509Hodgkin(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%05_09%' and class like '%Hodgkin%'");
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
    public double cntAllTCla0509Kidney(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%05_09%' and class like '%Kidney%'");
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
    public double cntAllTCla0509Liver(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%05_09%' and class like '%Liver%'");
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
    public double cntAllTCla0509Lymphoid(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%05_09%' and class like '%Lymphoid%'");
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
    public double cntAllTCla0509Melanoma(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%05_09%' and class like '%Melanoma%'");
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
    public double cntAllTCla0509Oral(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%05_09%' and class like '%Oral%'");
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
    public double cntAllTCla0509Ovary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%05_09%' and class like '%Ovary%'");
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
    public double cntAllTCla0509Salivary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%05_09%' and class like '%Salivary%'");
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
    public double cntAllTCla0509Soft(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%05_09%' and class like '%Soft%'");
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
    
    
    //Calcul des probabilités classe 05_09
    public double pTCla0509Bone(){
        return cntAllTCla0509Bone()/tc.cntNbreTCBone();
    } 
    public double pTCla0509Brain(){
        return cntAllTCla0509Brain()/tc.cntNbreTCBrain();
    } 
    public double pTCla0509Endocrine(){
        return cntAllTCla0509Endocrine()/tc.cntNbreTCEndocrine();
    } 
    public double pTCla0509Eye(){
        return cntAllTCla0509Eye()/tc.cntNbreTCEye();
    } 
    public double pTCla0509Female(){
        return cntAllTCla0509Female()/tc.cntNbreTCFemale();
    } 
    public double pTCla0509Hodgkin(){
        return cntAllTCla0509Hodgkin()/tc.cntNbreTCHodgkin();
    } 
    public double pTCla0509Kidney(){
        return cntAllTCla0509Kidney()/tc.cntNbreTCKidney();
    } 
    public double pTCla0509Liver(){
        return cntAllTCla0509Liver()/tc.cntNbreTCLiver();
    } 
    public double pTCla0509Lymphoid(){
        return cntAllTCla0509Lymphoid()/tc.cntNbreTCLymphoid();
    } 
    public double pTCla0509Melanoma(){
        return cntAllTCla0509Melanoma()/tc.cntNbreTCMelanoma();
    } 
    public double pTCla0509Oral(){
        return cntAllTCla0509Oral()/tc.cntNbreTCOral();
    } 
    public double pTCla0509Ovary(){
        return cntAllTCla0509Ovary()/tc.cntNbreTCOvary();
    } 
    public double pTCla0509Salivary(){
        return cntAllTCla0509Salivary()/tc.cntNbreTCSalivary();
    } 
    public double pTCla0509Soft(){
        return cntAllTCla0509Soft()/tc.cntNbreTCSoft();
    } 
    
    
    
    
    //classe d'age 10_14
    public double cntAllTCla1014Bone(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%10_14%' and class like '%Bone%'");
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
    public double cntAllTCla1014Brain(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%10_14%' and class like '%Brain%'");
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
    public double cntAllTCla1014Cervix(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%10_14%' and class like '%Cervix%'");
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
    public double cntAllTCla1014Colon(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%10_14%' and class like '%Colon%'");
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
    public double cntAllTCla1014Female(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%10_14%' and class like '%Female%'");
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
    public double cntAllTCla1014Hodgkin(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%10_14%' and class like '%Hodgkin%'");
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
    public double cntAllTCla1014Nasopharynx(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%10_14%' and class like '%Nasopharynx%'");
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
    public double cntAllTCla1014Oral(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%10_14%' and class like '%Oral%'");
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
    public double cntAllTCla1014Ovary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%10_14%' and class like '%Ovary%'");
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
    public double cntAllTCla1014Salivary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%10_14%' and class like '%Salivary%'");
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
    public double cntAllTCla1014Soft(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where classeage like '%10_14%' and class like '%Soft%'");
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
    
    
    //Calcul des probabilités classe 10_14
    public double pTCla1014Bone(){
        return cntAllTCla1014Bone()/tc.cntNbreTCBone();
    } 
    public double pTCla1014Brain(){
        return cntAllTCla1014Brain()/tc.cntNbreTCBrain();
    } 
    public double pTCla1014Cervix(){
        return cntAllTCla1014Cervix()/tc.cntNbreTCCervix();
    } 
    public double pTCla1014Colon(){
        return cntAllTCla1014Colon()/tc.cntNbreTCColon();
    } 
    public double pTCla1014Female(){
        return cntAllTCla1014Female()/tc.cntNbreTCFemale();
    } 
    public double pTCla1014Hodgkin(){
        return cntAllTCla1014Hodgkin()/tc.cntNbreTCHodgkin();
    } 
    public double pTCla1014Nasopharynx(){
        return cntAllTCla1014Nasopharynx()/tc.cntNbreTCNasopharynx();
    } 
    public double pTCla1014Oral(){
        return cntAllTCla1014Oral()/tc.cntNbreTCOral();
    } 
    public double pTCla1014Ovary(){
        return cntAllTCla1014Ovary()/tc.cntNbreTCOvary();
    } 
    public double pTCla1014Salivary(){
        return cntAllTCla1014Salivary()/tc.cntNbreTCSalivary();
    } 
    public double pTCla1014Soft(){
        return cntAllTCla1014Soft()/tc.cntNbreTCSoft();
    } 
}
