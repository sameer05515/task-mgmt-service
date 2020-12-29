/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.restapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author didin
 */

@Document(collection = "tasks")
public class Task {
    @Id
    String id;
    String title;
    String environment;
    String taskDescription;
    String frequency;
    String activityType;
    String box;
    String sequence;
    String remarks;
    String routineScheduleDescription;
    String status;
    String scheduleDate;
    String endDate;
    String performedBy;
    String taskPriorityGroup;
    String nextOccurance;
    String highestPoint;
    String pointsEarnedToday;
   
    String whatIfNotDoing;
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
			String remarks, String routineScheduleDescription, String status, String scheduleDate, String endDate,
			String performedBy, String taskPriorityGroup, String nextOccurance, String highestPoint,
			String pointsEarnedToday,String whatIfNotDoing,int rating) {
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

	public String getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
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

	public String getNextOccurance() {
		return nextOccurance;
	}

	public void setNextOccurance(String nextOccurance) {
		this.nextOccurance = nextOccurance;
	}

	public String getHighestPoint() {
		return highestPoint;
	}

	public void setHighestPoint(String highestPoint) {
		this.highestPoint = highestPoint;
	}

	public String getPointsEarnedToday() {
		return pointsEarnedToday;
	}

	public void setPointsEarnedToday(String pointsEarnedToday) {
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
