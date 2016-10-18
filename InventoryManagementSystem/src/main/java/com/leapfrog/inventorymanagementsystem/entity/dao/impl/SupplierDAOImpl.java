/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.entity.dao.impl;

import com.leapfrog.inventorymanagementsystem.entity.dao.SupplierDAO;
import java.sql.SQLException;
import java.util.List;
import com.leapfrog.inventorymanagementsystem.entity.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hasna
 */
@Repository("supplierDao")
public class SupplierDAOImpl implements SupplierDAO {

   
    @Autowired
    JdbcTemplate jdbcTemplate;
 
  
    @Override
    public int insert(Supplier supplier) throws SQLException, ClassNotFoundException {
        String sql="INSERT INTO supplier(first_name,last_name,email,address,contact_number,product_id)" + "VALUES(?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[]{
                supplier.getFirstName(),
                supplier.getLastName(),
                supplier.getEmail(),
                supplier.getAddress(),
                supplier.getContactNumber(),
                supplier.getProduct().getId()
              });
    }

    @Override
    public List<Supplier> getAll() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
