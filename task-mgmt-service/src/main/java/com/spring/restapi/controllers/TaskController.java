/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.models.Task;
import com.spring.restapi.repositories.TaskRepository;

/**
 *
 * @author didin
 */
@RestController
public class TaskController {
    
    @Autowired
    TaskRepository taskRepository;
    
    @RequestMapping(method=RequestMethod.GET, value="/tasks")
    public Iterable<Task> product() {
        return taskRepository.findAll();
    } 
    
    @RequestMapping(method=RequestMethod.POST, value="/tasks")
    public String save(@RequestBody Task product) {
        taskRepository.save(product);

        return product.getId();
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/tasks/{id}")
    public Task show(@PathVariable String id) {
        return taskRepository.findOne(id);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/tasks/{id}")
    public Task update(@PathVariable String id, @RequestBody Task product) {
    	Task prod = taskRepository.findOne(id);
//        if(product.getActivityType() != null)
//            prod.setActivityType(product.getActivityType());
//        if(product.getProdDesc() != null)
//            prod.setProdDesc(product.getProdDesc());
//        if(product.getProdPrice() != null)
//            prod.setProdPrice(product.getProdPrice());
//        if(product.getProdImage() != null)
//            prod.setProdImage(product.getProdImage());
        taskRepository.save(product);
        return prod;
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/tasks/{id}")
    public String delete(@PathVariable String id) {
    	Task product = taskRepository.findOne(id);
        taskRepository.delete(product);

        return "product deleted";
    }
}