package com.api.peoplecontrol.repositories;


import com.api.peoplecontrol.models.PeopleDataModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PeopleDataRepository extends JpaRepository<PeopleDataModel, UUID> {

}
