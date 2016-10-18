///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.leapfrog.inventorymanagementsystem.controller.customer;
//
//import com.leapfrog.inventorymanagementsystem.entity.Customer;
//import com.leapfrog.inventorymanagementsystem.entity.Product;
//import com.leapfrog.inventorymanagementsystem.entity.dao.CustomerDAO;
//import com.leapfrog.inventorymanagementsystem.entity.dao.ProductDAO;
//import java.sql.SQLException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import static org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.controller;
//
///**
// *
// * @author hasna
// */
//@Controller
//@RequestMapping(value = "/updatecustomer")
//public class UpdateController {
//    
//
//
//    @Autowired
//    ProductDAO productDao;
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public String doGet(@PathVariable("id") int id, ModelMap map) {
//        try {
//            Customer c = CustomerDAO.getById(id);
//            if (c != null) {
//                map.addAttribute("customer", c);
//                return "product/update";
//            }
//        } catch (SQLException | ClassNotFoundException ex) {
//
//        }
//        return "redirect:/?error";
//    }
//
//    @RequestMapping(value = "/{id}",method = RequestMethod.POST)
//    public String doPost(Customer c) {
//        try {
//            if (productDao.update(c) > 0) {
//                return "redirect:/displayproduct?success";
//            } else {
//                return "redirect:/?error";
//            }
//        } catch (SQLException | ClassNotFoundException ex) {
//
//        }
//        return "redirect:/?error";
//    }
//
//}
//
