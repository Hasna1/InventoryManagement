/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.entity.dao.impl;

import com.leapfrog.inventorymanagementsystem.entity.Customer;
import com.leapfrog.inventorymanagementsystem.entity.Product;
import com.leapfrog.inventorymanagementsystem.entity.dao.CustomerDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hasna
 */
@Repository("customerDao")
public class CustomerDAOImpl implements CustomerDAO{
    
   @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Customer customer) throws SQLException, ClassNotFoundException {
        String sql="INSERT INTO customer(first_name,last_name,address,email,contact_number,product_id)" + "VALUES(?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[]{
                customer.getFirstName(),
                customer.getLastName(),
                customer.getAddress(),
                customer.getEmail(),
                customer.getContactNumber(),
                customer.getProduct().getId()
                
        
        
        });
        
        
        }

    @Override
    public List<Customer> customerList() throws SQLException, ClassNotFoundException {
         String sql = "SELECT * FROM customer ";

        return jdbcTemplate.query(sql, new RowMapper<Customer>() {

            @Override
            public Customer mapRow(ResultSet rs, int i) throws SQLException {
                Customer c = new Customer();
                c.setId(rs.getInt("customer_id"));
                c.setFirstName(rs.getString("firstName"));
                c.setLastName(rs.getString("lastName"));
                c.setAddress(rs.getString("address"));
                c.setEmail(rs.getString("email"));
                c.setContactNumber(rs.getString("contactNumber"));

                c.setAddedDate(rs.getDate("added_date"));
                c.setModifiedDate(rs.getDate("modified_date"));

                return c;
            }
        });
    }

    @Override
    public int update(Customer c) throws SQLException, ClassNotFoundException {
         String sql = "UPDATE  product SET firstName=?,lastName=?,address=?,email=?,contactNumber=? WHERE customer_id=?";
        return jdbcTemplate.update(sql, new Object[]{
            c.getFirstName(),
            c.getLastName(),
            c.getAddress(),
            c.getEmail(),
            c.getContactNumber(),
            c.getProduct().getId()
        });
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getById(int id) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

//    @Override
//    public int delete(int id) throws SQLException, ClassNotFoundException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    //@Override
//    public Product getById(int id) throws SQLException, ClassNotFoundException {
//        String sql = "SELECT *FROM customer WHERE customer_id=?";
//        
//        
//           return () jdbcTemplate.query(sql, new RowMapper<Customer>() {
//
//            @Override
//            public Customer mapRow(ResultSet rs, int i) throws SQLException {
//                Customer c = new Customer();
//                c.setId(rs.getInt("customer_id"));
//                c.setFirstName(rs.getString("firstName"));
//                c.setLastName(rs.getString("lastName"));
//                c.setAddress(rs.getString("address"));
//                c.setEmail(rs.getString("email"));
//                c.setContactNumber(rs.getString("contactNumber"));
//
//                c.setAddedDate(rs.getDate("added_date"));
//                c.setModifiedDate(rs.getDate("modified_date"));
//
//                return c;
//            }
//        });
//    }}
//    
//
