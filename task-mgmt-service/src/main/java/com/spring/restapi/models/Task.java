/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.restapi.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//import org.springframework.data.annotation.Id;
import javax.persistence.Id;
/**
 *
 * @author didin
 */

//@Document(collection = "tasks")
@Entity
@Table(name = "t_task")
public class Task {
    @Id
    @GenericGenerator(name = "sequence_task_id", strategy = "com.spring.restapi.sequence.TaskIdGenerator")
    @GeneratedValue(generator = "sequence_task_id")
    String id;
    
    @Column(name="title", columnDefinition="TEXT")
    String title;
    
    @Column(name="environment", columnDefinition="TEXT")
    String environment;
    
    @Column(name="taskDescription", columnDefinition="TEXT")
    String taskDescription;
    
    @Column(name="frequency", columnDefinition="TEXT")
    String frequency;
    
    @Column(name="activityType", columnDefinition="TEXT")
    String activityType;
    
    @Column(name="box", columnDefinition="TEXT")
    String box;
    
    @Column(name="sequence", columnDefinition="TEXT")
    String sequence;
    
    @Column(name="remarks", columnDefinition="TEXT")
    String remarks;
    
    @Column(name="routineScheduleDescription", columnDefinition="TEXT")
    String routineScheduleDescription;
    
    @Column(name="status", columnDefinition="TEXT")
    String status;
    
    @Column(name="scheduleDate")
    Date scheduleDate;
    
    @Column(name="endDate")
    Date endDate;
    
    @Column(name="performedBy", columnDefinition="TEXT")
    String performedBy;
    
    @Column(name="taskPriorityGroup", columnDefinition="TEXT")
    String taskPriorityGroup;
    
    @Column(name="nextOccurance")
    Date nextOccurance;
    
    @Column(name="highestPoint")
    int highestPoint;
    
    @Column(name="pointsEarnedToday")
    int pointsEarnedToday;
   
    @Column(name="whatIfNotDoing", columnDefinition="TEXT")
    String whatIfNotDoing;
    
    @Column(name="rating")
    int rating=1;

    public Task() {
    }

	/**
	 * @param title
	 * @param environment
	 * @param taskDescription
	 * @param frequency
	 * @param activityType
	 * @param box
	 * @param sequence
	 * @param remarks
	 * @param routineScheduleDescription
	 * @param status
	 * @param scheduleDate
	 * @param endDate
	 * @param performedBy
	 * @param taskPriorityGroup
	 * @param nextOccurance
	 * @param highestPoint
	 * @param pointsEarnedToday
	 * @param why
	 * @param how
	 * @param whatIfNotDoing
	 */
	public Task(String title,String environment,String taskDescription, String frequency, String activityType, String box, String sequence,
			String remarks, String routineScheduleDescription, String status, Date scheduleDate, Date endDate,
			String performedBy, String taskPriorityGroup, Date nextOccurance, int highestPoint,
			int pointsEarnedToday,String whatIfNotDoing,int rating) {
		super();
		this.title=title;
		this.environment=environment;
		this.taskDescription = taskDescription;
		this.frequency = frequency;
		this.activityType = activityType;
		this.box = box;
		this.sequence = sequence;
		this.remarks = remarks;
		this.routineScheduleDescription = routineScheduleDescription;
		this.status = status;
		this.scheduleDate = scheduleDate;
		this.endDate = endDate;
		this.performedBy = performedBy;
		this.taskPriorityGroup = taskPriorityGroup;
		this.nextOccurance = nextOccurance;
		this.highestPoint = highestPoint;
		this.pointsEarnedToday = pointsEarnedToday;
		
		this.whatIfNotDoing=whatIfNotDoing;
		this.rating=rating;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getBox() {
		return box;
	}

	public void setBox(String box) {
		this.box = box;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRoutineScheduleDescription() {
		return routineScheduleDescription;
	}

	public void setRoutineScheduleDescription(String routineScheduleDescription) {
		this.routineScheduleDescription = routineScheduleDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPerformedBy() {
		return performedBy;
	}

	public void setPerformedBy(String performedBy) {
		this.performedBy = performedBy;
	}

	public String getTaskPriorityGroup() {
		return taskPriorityGroup;
	}

	public void setTaskPriorityGroup(String taskPriorityGroup) {
		this.taskPriorityGroup = taskPriorityGroup;
	}

	public Date getNextOccurance() {
		return nextOccurance;
	}

	public void setNextOccurance(Date nextOccurance) {
		this.nextOccurance = nextOccurance;
	}

	public int getHighestPoint() {
		return highestPoint;
	}

	public void setHighestPoint(int highestPoint) {
		this.highestPoint = highestPoint;
	}

	public int getPointsEarnedToday() {
		return pointsEarnedToday;
	}

	public void setPointsEarnedToday(int pointsEarnedToday) {
		this.pointsEarnedToday = pointsEarnedToday;
	}

	

	public String getWhatIfNotDoing() {
		return whatIfNotDoing;
	}

	public void setWhatIfNotDoing(String whatIfNotDoing) {
		this.whatIfNotDoing = whatIfNotDoing;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
}
