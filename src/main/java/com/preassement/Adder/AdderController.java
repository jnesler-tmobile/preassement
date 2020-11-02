package com.preassement.Adder;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdderController{

    
    private final PerformMath performMath = new PerformMath();

    @GetMapping(value="/add/{value1}/{value2}")
    ResponseEntity<String>
     getSum(@PathVariable int value1, @PathVariable int value2) throws NumberFormatException {
                
        int result = performMath.addValues(value1, value2);
        
        return new ResponseEntity<>("The sume of "+ value1 + " and "+ value2 + " is " + result + "}", HttpStatus.OK);
    }
    
}