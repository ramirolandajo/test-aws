package org.uade.testaws.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DateService {

    public String returnDate() {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
        return date.toString();
    }

}
