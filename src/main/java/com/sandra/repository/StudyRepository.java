package com.sandra.repository;

import com.sandra.entity.SiteStatus;
import com.sandra.entity.Study;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRepository extends CrudRepository<Study, String> {


}
