package com.sandra.repository;

import com.sandra.entity.Color;
import com.sandra.entity.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, String> {


}
