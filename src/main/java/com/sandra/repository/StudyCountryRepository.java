package com.sandra.repository;

import com.sandra.entity.Study;
import com.sandra.entity.StudyCountry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyCountryRepository extends CrudRepository<StudyCountry, String> {


}
