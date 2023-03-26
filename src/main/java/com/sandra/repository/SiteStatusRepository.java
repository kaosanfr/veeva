package com.sandra.repository;

import com.sandra.entity.Site;
import com.sandra.entity.SiteStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteStatusRepository extends CrudRepository<SiteStatus, String> {


}
