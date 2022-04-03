package com.dms.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dms.hr.entity.Status;

@Repository
public interface StatusRepo extends JpaRepository<Status,Long >  {

}
