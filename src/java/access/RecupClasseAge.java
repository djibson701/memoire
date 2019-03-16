/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import predict.Connect;

/**
 *
 * @author user
 */
public class RecupClasseAge {
    Connection c=Connect.connexion();
    Statement stm;
    ResultSet rs;
}
