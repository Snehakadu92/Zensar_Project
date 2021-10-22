package com.zensar.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.model.Course;

public interface CourseDao extends JpaRepository<Course, Integer> {
	

}
