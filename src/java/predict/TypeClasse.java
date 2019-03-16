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
public class TypeClasse {
    Connection c=Connect.connexion();
    Statement stm;
    ResultSet rs;
    //Nombre de total de classes
    public double cntAll(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as total from risk");
           //i=rs.getInt("c");
           while (rs.next()){
               i=rs.getInt("total");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
        
    }
    
    //Nombre de chaque classe
    public double cntNbreTCBone(){
        int i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Bone%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCBrain(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Brain%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCCervix(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Cervix%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCColon(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Colon%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCEndocrine(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Endocrine%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCEye(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Eye%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCFemale(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Female%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCHodgkin(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Hodgkin%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCKidney(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Kidney%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCLiver(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Liver%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCLung(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Lung%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCLymphoid(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Lymphoid%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCMelanoma(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Melanoma%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCMouth(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Mouth%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCNasopharynx(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Nasopharynx%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCOral(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Oral%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCOvary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Ovary%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCSalivary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Salivary%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCSoft(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Soft%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntNbreTCUrinary(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Urinary%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    
    
    //Probabilité de chaque classe
    public double pBone(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCBone()/ty.cntAll();
    }
    public double pBrain(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCBrain()/ty.cntAll();
    }
    public double pCervix(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCCervix()/ty.cntAll();
    }
    public double pColon(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCColon()/ty.cntAll();
    }
    public double pEndocrine(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCEndocrine()/ty.cntAll();
    }
    public double pEye(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCEye()/ty.cntAll();
    }
    public double pFemale(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCFemale()/ty.cntAll();
    }
    public double pHodgkin(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCHodgkin()/ty.cntAll();
    }
    public double pKidney(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCKidney()/ty.cntAll();
    }
    public double pLiver(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCLiver()/ty.cntAll();
    }
    public double pLung(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCLung()/ty.cntAll();
    }
    public double pLymphoid(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCLymphoid()/ty.cntAll();
    }
    public double pMelanoma(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCMelanoma()/ty.cntAll();
    }
    public double pMouth(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCMouth()/ty.cntAll();
    }
    public double pNasopharynx(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCNasopharynx()/ty.cntAll();
    }
    public double pOral(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCOral()/ty.cntAll();
    }
    public double pOvary(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCOvary()/ty.cntAll();
    }
    public double pSalivary(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCSalivary()/ty.cntAll();
    }
    public double pSoft(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCSoft()/ty.cntAll();
    }
    public double pUrinary(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNbreTCUrinary()/ty.cntAll();
    }
    
}
