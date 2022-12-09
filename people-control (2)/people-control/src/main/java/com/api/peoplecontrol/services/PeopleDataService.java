package com.api.peoplecontrol.services;

import com.api.peoplecontrol.repositories.PeopleDataRepository;
import org.springframework.stereotype.Service;

@Service
public class PeopleDataService {

    final PeopleDataRepository peopleDataRepository;

    public PeopleDataService(PeopleDataRepository peopleDataRepository) {
        this.peopleDataRepository = peopleDataRepository;
    }
}
