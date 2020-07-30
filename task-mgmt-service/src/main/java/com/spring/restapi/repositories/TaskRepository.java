/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.spring.restapi.models.Task;

/**
 *
 * @author didin
 */
public interface TaskRepository extends CrudRepository<Task, String>,JpaRepository<Task, String> {
    @Override
    Task findOne(String id);

    @Override
    void delete(Task deleted);
}
