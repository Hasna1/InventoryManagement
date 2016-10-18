/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.controller.product;

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
@RequestMapping(value="/displayproduct")
public class DisplayController {
    
    @Autowired
    ProductDAO productDao;
    
    @RequestMapping(method=RequestMethod.GET)
        public String doGet(ModelMap map){
            try{
            
            map.addAttribute("product", productDao.getALL());
            
            }
            catch( SQLException | ClassNotFoundException ex){
            
            }
            
            return "product/display";
        
        }
    
    
}
