package com.electronics.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.electronics.Entity.eleEntity;

public interface eleRepository extends JpaRepository<eleEntity, Integer> {
	
	 //This is native query or SQL query
    @Query(value="select * from electronics_table where name=?",nativeQuery=true)
	public List<eleEntity> getEleName (String a);

}