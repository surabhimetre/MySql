package com.citi.rep;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.citi.model.System;
 
@Repository
public interface SystemRepository extends CrudRepository<System,Long> {
     
 
}
