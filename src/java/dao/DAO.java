/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author user
 */
public interface DAO<T> {
    public void creer(T t);
    public T rechercher(T t);
    public void supprimer(T t);
    public void modifier(Long i);
    public List<T> rechercherTout();
}
