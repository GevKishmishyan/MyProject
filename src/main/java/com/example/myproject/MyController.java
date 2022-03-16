package com.example.myproject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class MyController {

    @GetMapping
    public ResponseEntity<String> hi(){
        return ResponseEntity.status(HttpStatus.OK).body("hi");
    }

}
