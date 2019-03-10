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
public class TypeClasse {
    Connection c=Connect.connexion();
    Statement stm;
    ResultSet rs;
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
    public double cntBone(){
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
    public double cntBrain(){
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
    public double cntCervix(){
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
    public double cntColon(){
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
    public double cntEndocrine(){
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
    public double cntEye(){
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
    public double cntFemale(){
        double i=0;
        try {
           stm=c.createStatement(); 
           rs=stm.executeQuery("select count(*) as t from risk where class like '%Femelle%'");
           while (rs.next()){
               i=rs.getInt("t");
           }
           return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return i;
        }
    }
    public double cntHodgkin(){
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
    public double cntKidney(){
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
    public double cntLiver(){
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
    public double cntLung(){
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
    public double cntLymphoid(){
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
    public double cntMelanoma(){
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
    public double cntMouth(){
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
    public double cntNasopharynx(){
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
    public double cntOral(){
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
    public double cntOvary(){
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
    public double cntSalivary(){
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
    public double cntSoft(){
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
    public double cntUrinary(){
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
    public double pBone(){
        TypeClasse ty=new TypeClasse();
        return ty.cntBone()/ty.cntAll();
    }
    public double pBrain(){
        TypeClasse ty=new TypeClasse();
        return ty.cntBrain()/ty.cntAll();
    }
    public double pCervix(){
        TypeClasse ty=new TypeClasse();
        return ty.cntCervix()/ty.cntAll();
    }
    public double pColon(){
        TypeClasse ty=new TypeClasse();
        return ty.cntColon()/ty.cntAll();
    }
    public double pEndocrine(){
        TypeClasse ty=new TypeClasse();
        return ty.cntEndocrine()/ty.cntAll();
    }
    public double pEye(){
        TypeClasse ty=new TypeClasse();
        return ty.cntEye()/ty.cntAll();
    }
    public double pFemale(){
        TypeClasse ty=new TypeClasse();
        return ty.cntFemale()/ty.cntAll();
    }
    public double pHodgkin(){
        TypeClasse ty=new TypeClasse();
        return ty.cntHodgkin()/ty.cntAll();
    }
    public double pKidney(){
        TypeClasse ty=new TypeClasse();
        return ty.cntKidney()/ty.cntAll();
    }
    public double pLiver(){
        TypeClasse ty=new TypeClasse();
        return ty.cntLiver()/ty.cntAll();
    }
    public double pLung(){
        TypeClasse ty=new TypeClasse();
        return ty.cntLung()/ty.cntAll();
    }
    public double pLymphoid(){
        TypeClasse ty=new TypeClasse();
        return ty.cntLymphoid()/ty.cntAll();
    }
    public double pMelanoma(){
        TypeClasse ty=new TypeClasse();
        return ty.cntMelanoma()/ty.cntAll();
    }
    public double pMouth(){
        TypeClasse ty=new TypeClasse();
        return ty.cntMouth()/ty.cntAll();
    }
    public double pNasopharynx(){
        TypeClasse ty=new TypeClasse();
        return ty.cntNasopharynx()/ty.cntAll();
    }
    public double pOral(){
        TypeClasse ty=new TypeClasse();
        return ty.cntOral()/ty.cntAll();
    }
    public double pOvary(){
        TypeClasse ty=new TypeClasse();
        return ty.cntOvary()/ty.cntAll();
    }
    public double pSalivary(){
        TypeClasse ty=new TypeClasse();
        return ty.cntSalivary()/ty.cntAll();
    }
    public double pSoft(){
        TypeClasse ty=new TypeClasse();
        return ty.cntSoft()/ty.cntAll();
    }
    public double pUrinary(){
        TypeClasse ty=new TypeClasse();
        return ty.cntUrinary()/ty.cntAll();
    }

    /*
    public static void main(String[] args) {
        TypeClasse ty=new TypeClasse();
        System.out.println(ty.pUrinary());
    }
    */
}
