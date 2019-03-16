/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predict;

/**
 *
 * @author user
 */
public class Proba {
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
    
    //00_04 Feminin Fumeur Celibataire Moins_Necessiteux
    public double probaBone(){
        return s.pSexeBone()*sf.pFumBone()*sm.pSMBone()*ss.pSSBone()*tc.pBone();
    }
    
}
