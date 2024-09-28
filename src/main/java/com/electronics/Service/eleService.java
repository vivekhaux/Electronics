package com.electronics.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronics.DAO.eleDAO;
import com.electronics.Entity.eleEntity;
import com.electronics.exceptions.ColorException;
import com.electronics.exceptions.NameException;

@Service
public class eleService {

	@Autowired
	eleDAO ed;
	
	    //using with post mapping
		public String postThis(eleEntity e) {
			return ed.postThis(e);
		}
		
	    //Using with post mapping and save all
		public String postEle(List<eleEntity> a) {
			return ed.postEle(a);
		}
		
		//Using with  get mapping with find all 
		public List<eleEntity> getEle() {
			return ed.getEle();
		}
		
		//Using with get mapping get the particular field with full fields and using exception
		public List<eleEntity> getEleName(String a)throws NameException {
				if(ed.getEleName(a).isEmpty()) {
				throw new NameException("no name in db");
			}
			else {
			return ed.getEleName(a);
			}		
		}
		
		//Using will get mapping get a particular id and get particular name with the id using name exception
		public String getEleId(int a) throws  NameException {
//			try {
				
			
			if(ed.getEleId(a).startsWith("D")) {
			return ed.getEleId(a);
			}
			else {
				throw new NameException("name not found");
			}
//			}
//			catch(NameException ne) {
//				return ne.getMessage();
//			}
		
		}
		
		//Using with get mapping get a id and get particular color with the id using color exception
		public String getEleColor(int a) throws ColorException {
			if (ed.getEleColor(a).endsWith("e")) {
				return ed.getEleColor(a);
			}
			else {
				throw new ColorException("color not found");
			}
		}
		
}
