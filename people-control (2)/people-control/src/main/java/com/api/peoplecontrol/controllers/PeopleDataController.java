package com.api.peoplecontrol.controllers;

import com.api.peoplecontrol.services.PeopleDataService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/people-spot")
public class PeopleDataController {
    final PeopleDataService peopleDataService;

    public PeopleDataController(PeopleDataService peopleDataService) {
        this.peopleDataService = peopleDataService;
    }


}
