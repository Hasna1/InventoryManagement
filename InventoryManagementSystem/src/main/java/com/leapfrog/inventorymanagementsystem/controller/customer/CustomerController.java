/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.controller.customer;

import com.leapfrog.inventorymanagementsystem.entity.Customer;
import com.leapfrog.inventorymanagementsystem.entity.dao.CustomerDAO;
import com.leapfrog.inventorymanagementsystem.entity.dao.ProductDAO;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author hasna
 */
@Controller
@RequestMapping(value="/customer")
public class CustomerController {
    
    @Autowired
    ProductDAO productDao;
    @Autowired
    CustomerDAO customerDao;
    
    @RequestMapping(method=RequestMethod.GET)
    public String doGet(ModelMap map){
        try{
            map.addAttribute("products", productDao.getALL());
            
        
        }
       catch(SQLException|ClassNotFoundException ex){
       
       
       }
        return "customer/insert";
        
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public String doPost(Customer c){
        
        try{
            if(customerDao.insert(c)>0){
                return "redirect:/?success";
            
            }
        }
        catch( SQLException |  ClassNotFoundException ex){
        }
   
        return "redirect:/?error";
    }
}
