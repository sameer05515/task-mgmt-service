/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.restapi.controllers;

//import org.omg.CORBA.portable.ResponseHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.p.db.backup.word.meaning.exception.InvalidInputSuppliedException;
import com.spring.restapi.models.Task;
import com.spring.restapi.repositories.TaskRepository;
import com.spring.restapi.response.ResponseHandler;

/**
 *
 * @author didin
 */
@RestController
public class TaskController {

	@Autowired
	TaskRepository taskRepository;

	private static final Logger log = LoggerFactory.getLogger(TaskController.class);

	@RequestMapping(method = RequestMethod.GET, value = "/tasks")
	public ResponseEntity<Object> product() {
		
		
		ResponseEntity<Object> response = null;
		try {
			log.info("Inside com.spring.restapi.controllers.TaskController.get(String) method ...");

			System.out.println("Fetching all Tasks ");

			Iterable<Task> retObj = taskRepository.findAll();

			response = ResponseHandler.generateResponse(HttpStatus.OK, false, "Success", retObj);

		} catch (Exception e) {
			/*
			 * if (e instanceof InvalidInputSuppliedException) { response =
			 * ResponseHandler.generateResponse(HttpStatus.BAD_REQUEST, true,
			 * ((InvalidInputSuppliedException) e).getCustomMessage(),
			 * "File Created : null"); }
			 */ /* else { */
			response = ResponseHandler.generateResponse(HttpStatus.INTERNAL_SERVER_ERROR, true, e.getMessage(),
					"Exception in getting Task object");
			/* } */
			e.printStackTrace();
		}
		return response;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/tasks")
	public ResponseEntity<Object> save(@RequestBody Task product) {

		ResponseEntity<Object> response = null;
		try {
			log.info("Inside com.p.db.backup.word.meaning.controller.ReportController.save(Word) method ...");

			System.out.println("Task : " + product);

			taskRepository.save(product);

			Task retObj = taskRepository.findById(product.getId()).get();

			response = ResponseHandler.generateResponse(HttpStatus.OK, false, "Success", retObj);

		} catch (Exception e) {
			/*
			 * if (e instanceof InvalidInputSuppliedException) { response =
			 * ResponseHandler.generateResponse(HttpStatus.BAD_REQUEST, true,
			 * ((InvalidInputSuppliedException) e).getCustomMessage(),
			 * "File Created : null"); }
			 */ /* else { */
			response = ResponseHandler.generateResponse(HttpStatus.INTERNAL_SERVER_ERROR, true, e.getMessage(),
					"Exception in saving task object");
			/* } */
			e.printStackTrace();
		}
		return response;

	}

	@RequestMapping(method = RequestMethod.GET, value = "/tasks/{id}")
	public ResponseEntity<Object> get(@PathVariable String id) {

		ResponseEntity<Object> response = null;
		try {
			log.info("Inside com.spring.restapi.controllers.TaskController.get(String) method ...");

			System.out.println("Task id : " + id);

			Task retObj = taskRepository.findById(id).get();

			response = ResponseHandler.generateResponse(HttpStatus.OK, false, "Success", retObj);

		} catch (Exception e) {
			/*
			 * if (e instanceof InvalidInputSuppliedException) { response =
			 * ResponseHandler.generateResponse(HttpStatus.BAD_REQUEST, true,
			 * ((InvalidInputSuppliedException) e).getCustomMessage(),
			 * "File Created : null"); }
			 */ /* else { */
			response = ResponseHandler.generateResponse(HttpStatus.INTERNAL_SERVER_ERROR, true, e.getMessage(),
					"Exception in getting Task object");
			/* } */
			e.printStackTrace();
		}
		return response;

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/tasks/{id}")
	public ResponseEntity<Object> update(@PathVariable String id, @RequestBody Task product) {

		ResponseEntity<Object> response = null;
		try {
			log.info("Inside com.spring.restapi.controllers.TaskController.update(String, Task) method ...");

			System.out.println("Task id : " + id);
			System.out.println("Word to be updated" + product);

			taskRepository.save(product);
			Task retObj = taskRepository.findById(id).get();

			response = ResponseHandler.generateResponse(HttpStatus.OK, false, "Success", retObj);

		} catch (Exception e) {
			/*
			 * if (e instanceof InvalidInputSuppliedException) { response =
			 * ResponseHandler.generateResponse(HttpStatus.BAD_REQUEST, true,
			 * ((InvalidInputSuppliedException) e).getCustomMessage(),
			 * "File Created : null"); }
			 */ /* else { */
			response = ResponseHandler.generateResponse(HttpStatus.INTERNAL_SERVER_ERROR, true, e.getMessage(),
					"Exception during update Task object");
			/* } */
			e.printStackTrace();
		}
		return response;
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/tasks/{id}")
	public ResponseEntity<Object> delete(@PathVariable String id) {

		// return "product deleted";

		ResponseEntity<Object> response = null;
		try {
			log.info("Inside com.spring.restapi.controllers.TaskController.delete(String) method ...");

			System.out.println("Task id to be deleted : " + id);

			Task product = taskRepository.findById(id).get();
			taskRepository.delete(product);

			response = ResponseHandler.generateResponse(HttpStatus.OK, false, "Success",
					"Task with id : " + id + " deleted successfully");

		} catch (Exception e) {
			/*
			 * if (e instanceof InvalidInputSuppliedException) { response =
			 * ResponseHandler.generateResponse(HttpStatus.BAD_REQUEST, true,
			 * ((InvalidInputSuppliedException) e).getCustomMessage(),
			 * "File Created : null"); }
			 */ /* else { */
			response = ResponseHandler.generateResponse(HttpStatus.INTERNAL_SERVER_ERROR, true, e.getMessage(),
					"Exception during delete Task object");
			/* } */
			e.printStackTrace();
		}
		return response;
	}
}