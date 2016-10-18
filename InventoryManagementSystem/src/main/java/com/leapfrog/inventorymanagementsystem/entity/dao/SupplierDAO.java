/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.entity.dao;

import java.sql.SQLException;
import java.util.List;
import com.leapfrog.inventorymanagementsystem.entity.Supplier;
/**
 *
 * @author hasna
 */
public interface SupplierDAO {
    
   int insert(Supplier supplier) throws SQLException, ClassNotFoundException;
   List<Supplier> getAll() throws SQLException, ClassNotFoundException;
    
    
}
