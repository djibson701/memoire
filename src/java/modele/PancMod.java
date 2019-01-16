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
public class PancMod {
    //Sexe Panc
    private int countValuesSexeMPanc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "sexe='M'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countValuesSexeFPanc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "sexe='F'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    
    //Statut Fumeur
    private int countValuesStatutFumeurNPanc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "statutFumeur='N'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countValuesStatutFumeurXPanc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "statutFumeur='X'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countValuesStatutFumeurZPanc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "statutFumeur='Z'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countValuesStatutFumeurCPanc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "statutFumeur='C'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
  
    //Lieu de residence
    private int countValuesLieuResidenceDNNEPanc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "lieuResidence='DNNE'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countValuesLieuResidenceSOUTHPanc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "lieuResidence='SOUTH'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countValuesLieuResidenceWESTPanc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "lieuResidence='WEST'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countValuesLieuResidenceDNMLPanc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "lieuResidence='DNML'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    
    //StatutMarital Panc
    private int countValuesStatutMaritalWPanc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "statutMarital='W'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countValuesStatutMaritalEPanc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "statutMarital='E'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countValuesStatutMaritalSPanc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "statutMarital='S'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countValuesStatutMaritalDPanc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "statutMarital='D'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countValuesStatutMaritalZPanc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "statutMarital='Z'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    private int countValuesStatutMaritalMPanc(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(c.typeCancer) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "statutMarital='M'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }
    
    //Classe d'age
    private int countValuesClasseAge_00_04_20_24(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(*) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + " classeDage between '00_04' and '20_24'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
    }   
    private int countValuesClasseAge_20_24_40_44(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(*) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + " classeDage between '20_24' and '40_44'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
     }
    private int countValuesClasseAge_40_44_60_64(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(*) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + " classeDage between '40_44' and '60_64'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
     }
    private int countValuesClasseAge_60_64_80_84(){
         Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(*) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + "statutMarital='W'");
            result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return result;
        }
     }
    private int countValuesClasseAge_85plus(){
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        int result=0;
        try {
            session.beginTransaction();
            Query query=session.createQuery("select count(*) "
                    + "from cancerpredict c where c.typeCancer='Pancreas' and "
                    + " classeDage='85+'");
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
