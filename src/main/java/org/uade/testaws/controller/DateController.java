package org.uade.testaws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uade.testaws.service.DateService;

@RequestMapping("/date")
@RestController
public class DateController {

    @Autowired
    DateService dateService;

    @GetMapping("/")
    public ResponseEntity<String> getTodaysDate() {
        return new ResponseEntity<>(this.dateService.returnDate(), HttpStatus.OK);
    }
}
