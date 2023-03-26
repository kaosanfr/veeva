package com.sandra.repository;

import com.sandra.entity.Color;
import com.sandra.entity.Site;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteRepository extends CrudRepository<Site, String> {


}
