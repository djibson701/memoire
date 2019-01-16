/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;


import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class CancerpredictMod {
    //Calcul des valeurs
    private int countAllValues(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) from cancerpredict c");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countAllPancreas(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) from cancerpredict c where c.typeCancer='Pancreas'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countAllBreast(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) from cancerpredict c where c.typeCancer='Breast'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countAllColon(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) from cancerpredict c where c.typeCancer='Colon'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countAllBrain(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) from cancerpredict c where c.typeCancer='Brain'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countAllBladder(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) from cancerpredict c where c.typeCancer='Bladder'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countAllOther(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) from cancerpredict c where c.typeCancer='Other'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countAllLung(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) from cancerpredict c where c.typeCancer='Lung'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countAllAnus(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) from cancerpredict c where c.typeCancer='Anus'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    public String getClasseInfo(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return null;
    }
    
    //Calcul des probabilités
    private double calculPdePancreas(){
        return countAllPancreas()/countAllValues();
    }
    private double calculPdeBreast(){
        return countAllBreast()/countAllValues();
    }
    private double calculPdeColon(){
        return countAllColon()/countAllValues();
    }
    private double calculPdeBrain(){
        return countAllBrain()/countAllValues();
    }
    private double calculPdeBladder(){
        return countAllBladder()/countAllValues();
    }
    private double calculPdeOther(){
        return countAllOther()/countAllValues();
    }
    private double calculPdeLung(){
        return countAllLung()/countAllValues();
    }
    private double calculPdeAnus(){
        return countAllAnus()/countAllValues();
    }
    
    //Pancreas
    private int countValuesStatutSoc1Panc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "statutSocial='1'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countValuesStatutSoc2Panc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "statutSocial='2'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countValuesStatutSoc3Panc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "statutSocial='3'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countValuesStatutSoc4Panc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "statutSocial='4'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countValuesStatutSoc5Panc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "statutSocial='5'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    

  

}
