package com.dms.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dms.hr.entity.Job;

@Repository
public interface JobRepo extends JpaRepository<Job,Long >  {

}
