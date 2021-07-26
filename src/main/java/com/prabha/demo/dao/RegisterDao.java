package com.prabha.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.prabha.demo.model.RegisterModel;

public interface RegisterDao extends CrudRepository<RegisterModel, Integer>{
	

}
