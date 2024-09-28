package com.electronics.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.electronics.Entity.eleEntity;
import com.electronics.Repository.eleRepository;

@Repository
public class eleDAO {
 
	@Autowired
	eleRepository er;
	
	//using with post mapping
	public String postThis(eleEntity e) {
		er.save(e);
		return "Posted Success";
	}
	
	//Using with post mapping and save all
	public String postEle(List<eleEntity> a) {
		er.saveAll(a);
		return "Posted Success";
	}
	
	//Using with get mapping with find all
	public List<eleEntity> getEle() {
		return er.findAll();
	}
	
	//using get mapping get the particular name field with full fields 
	public List<eleEntity> getEleName(String a) {
		return er.getEleName(a);
	}
	
	//Using will get mapping get a particular id and get particular name with the id using name exception
	public String getEleId(int a) {
		return er.findById(a).get().getName();
	}
	
	//Using with get mapping get a id and get particular color with the id using color exception
	public String getEleColor(int a) {
		return er.findById(a).get().getColor();
	}
	
}
