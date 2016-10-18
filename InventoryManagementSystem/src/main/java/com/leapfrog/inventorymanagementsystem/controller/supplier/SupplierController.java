/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.controller.supplier;

import com.leapfrog.inventorymanagementsystem.entity.Supplier;
import com.leapfrog.inventorymanagementsystem.entity.dao.ProductDAO;
import com.leapfrog.inventorymanagementsystem.entity.dao.SupplierDAO;
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
@RequestMapping(value="/supplier")
public class SupplierController {
    
    @Autowired
    ProductDAO productDao;
    
    @Autowired
    SupplierDAO supplierDao;
    
    @RequestMapping(method=RequestMethod.GET)
   public String doGet(ModelMap map)
    {
        try{
        map.addAttribute("products", productDao.getALL());
        }catch(SQLException|ClassNotFoundException ex)
        {
        
        }
        return "supplier/insert";
        }


       @RequestMapping(method=RequestMethod.POST)
       public String doPost(Supplier s){
           try{
               if(supplierDao.insert(s)>0){
               
               return"redirect:/?success";
               }
           
           
           }catch(SQLException|ClassNotFoundException ex){
           
           }
            return"redirect:/?error";
       }
}
    
