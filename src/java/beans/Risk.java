/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.text.DecimalFormat;
import predict.ClasseAge;
import predict.Sexe;
import predict.StatutFumeur;
import predict.StatutMarital;
import predict.StatutSocial;
import predict.TypeClasse;

/**
 *
 * @author user
 */
public class Risk {
    private String sexe;
    private String classeage;
    private String statutmarital;
    private String statutfumeur;
    private String statutsocial;

    public String getSexe() {
        return sexe;
    }

    public String getClasseage() {
        return classeage;
    }

    public String getStatutmarital() {
        return statutmarital;
    }

    public String getStatutfumeur() {
        return statutfumeur;
    }

    public String getStatutsocial() {
        return statutsocial;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setClasseage(String classeage) {
        this.classeage = classeage;
    }

    public void setStatutmarital(String statutmarital) {
        this.statutmarital = statutmarital;
    }

    public void setStatutfumeur(String statutfumeur) {
        this.statutfumeur = statutfumeur;
    }

    public void setStatutsocial(String statutsocial) {
        this.statutsocial = statutsocial;
    }
    
    ClasseAge ca=new ClasseAge();
    Sexe s=new Sexe();
    StatutFumeur sf=new StatutFumeur();
    StatutMarital sm=new StatutMarital();
    StatutSocial ss=new StatutSocial();
    TypeClasse tc=new TypeClasse();
    private double pbone;

    public double getPbone() {
        return pbone;
    }

    public void setPbone(double pbone) {
        this.pbone = pbone;
    }
    
    DecimalFormat df=new DecimalFormat();  
    //00_04 Feminin Fumeur Celibataire Moins_Necessiteux
    public double probaBone(){
        return s.pSexeBone()*sf.pFumBone()*sm.pSMBone()*ss.pSSBone()*tc.pBone();
    }
    
    
}
