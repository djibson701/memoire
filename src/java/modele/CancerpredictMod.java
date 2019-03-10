/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import beans.Cancerpredict;
import dao.DAO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class CancerpredictMod implements DAO<Cancerpredict>{

    @Override
    public void creer(Cancerpredict t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cancerpredict rechercher(Cancerpredict t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimer(Cancerpredict t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modifier(Long i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cancerpredict> rechercherTout() {
        List<Cancerpredict> list=new ArrayList<Cancerpredict>();
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            list = session.createCriteria(Cancerpredict.class).list();
            session.getTransaction().commit();
        } catch (Exception e) {
            //e.printStackTrace();
            System.err.println("ERREUR LIEE A HIBERNATE");
            session.getTransaction().rollback();
        }
        return list;
    }
}
