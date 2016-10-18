/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.controller.product;

import com.leapfrog.inventorymanagementsystem.entity.Product;
import com.leapfrog.inventorymanagementsystem.entity.dao.ProductDAO;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author hasna
 */
@Controller
@RequestMapping(value="/product")
public class ProductController {
    
    
    @Autowired
    ProductDAO productDao;
    @RequestMapping(method=RequestMethod.GET)
    public String doGet(){
        
        return "product/insert";
      }
    
    @RequestMapping(method=RequestMethod.POST)
    
        public  String doPost(Product p){
             
            try{
               
              // p.setStatus(status==1);
               
                if(productDao.insert(p)>0){
                    
                    return "redirect:/displayproduct?sucess";
                    
                }
            
            }
            catch(SQLException | ClassNotFoundException ex){
            
            }
            return "redirect:/?error";
        }
    
}
