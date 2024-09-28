package com.electronics.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.Entity.eleEntity;
import com.electronics.Service.eleService;
import com.electronics.exceptions.ColorException;
import com.electronics.exceptions.NameException;

@RestController
@RequestMapping(value="/Electronic")
public class eleController {
	
	@Autowired
	eleService es;
	

	    //Using post mapping with entity class
		@PostMapping(value="/postElectronic")
		public String postThis(@RequestBody eleEntity e) {
			return es.postThis(e);
		}
		
        //Using with post mapping and save all
		@PostMapping(value="/postEle")
	    public String postEle(@RequestBody List<eleEntity> a) {
			return es.postEle(a);
		}
		
		//Using with get mapping with find all
		@GetMapping(value="/getEle")
		public List<eleEntity> getEle() {
			return es.getEle();
		}
		
		//Using with get mapping get a particular name field with full fields and using exception
		@GetMapping(value="/getEleName/{a}")
		public List<eleEntity> getEleName(@PathVariable String a)throws NameException {
			return es.getEleName(a);
		}
		
		//Using with get mapping get a particular id and get particular name with the id using name exception
		@GetMapping(value="/getEleId/{a}")
		public String getEleId(@PathVariable int a) throws NameException {
			return es.getEleId(a);
		}
		
		//Using with get mapping get a id and get particular color with the id using color exception
		@GetMapping(value="/getEleColor/{a}")
		public String getEleColor(@PathVariable int a) throws ColorException{
			return es.getEleColor(a);
		}
		
}






