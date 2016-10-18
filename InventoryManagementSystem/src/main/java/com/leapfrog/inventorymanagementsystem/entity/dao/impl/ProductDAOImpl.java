/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.entity.dao.impl;

import com.leapfrog.inventorymanagementsystem.entity.Product;
import com.leapfrog.inventorymanagementsystem.entity.dao.ProductDAO;
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
@Repository(value = "productDao")
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Product p) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO product(product_name,category,quantity,cost_price,selling_price,status)" + "VALUES(?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[]{
            p.getProductName(),
            p.getCategory(),
            p.getQuantity(),
            p.getCostPrice(),
            p.getSellingPrice(),
            p.isStatus()

        });
    }

    @Override
    public List<Product> getALL() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM product ";

        return jdbcTemplate.query(sql, new RowMapper<Product>() {

            @Override
            public Product mapRow(ResultSet rs, int i) throws SQLException {
                Product p = new Product();
                p.setId(rs.getInt("product_id"));
                p.setProductName(rs.getString("product_name"));
                p.setCategory(rs.getString("category"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCostPrice(rs.getString("cost_price"));
                p.setSellingPrice(rs.getString("selling_price"));

                p.setAddedDate(rs.getDate("added_date"));
                p.setModifiedDate(rs.getDate("modified_date"));
                p.setStatus(rs.getBoolean("status"));

                return p;
            }
        });
    }

    @Override
    public int update(Product p) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE  product SET product_name=?,category=?,quantity=?,cost_price=?,selling_price=?,status=? WHERE product_id=?";
        return jdbcTemplate.update(sql, new Object[]{
            
            p.getProductName(),
            p.getCategory(),
            p.getQuantity(),
            p.getCostPrice(),
            p.getSellingPrice(),
            p.isStatus(),
            p.getId()

        });
    }

    @Override
     public int delete(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE from product WHERE product_id=?";
        return jdbcTemplate.update(sql, new Object[]{id});
    }

    @Override
    public Product getById(int id) throws SQLException, ClassNotFoundException {
        String sql = "SELECT *FROM product WHERE product_id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Product>() {

            @Override
            public Product mapRow(ResultSet rs, int i) throws SQLException {
                Product p = new Product();
                p.setId(rs.getInt("product_id"));
                p.setProductName(rs.getString("product_name"));
                p.setCategory(rs.getString("category"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCostPrice(rs.getString("cost_price"));
                p.setSellingPrice(rs.getString("selling_price"));
                p.setAddedDate(rs.getDate("added_date"));
                p.setModifiedDate(rs.getDate("modified_date"));
                p.setStatus(rs.getBoolean("status"));
                return p;
            }

        });
    }

}
