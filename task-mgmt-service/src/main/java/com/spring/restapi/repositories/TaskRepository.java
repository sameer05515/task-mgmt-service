/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.restapi.repositories;

import com.spring.restapi.models.Task;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author didin
 */
public interface TaskRepository extends CrudRepository<Task, String>,MongoRepository<Task, String> {
    @Override
    Task findOne(String id);

    @Override
    void delete(Task deleted);
}
