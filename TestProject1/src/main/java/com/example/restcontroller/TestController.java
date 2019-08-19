package com.example.restcontroller;

import javax.ws.rs.Path;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@Path("/testcontroller")
//@RequestMapping(value={"/customer"})
public class TestController {
	
    
    //GET Customer BY ID
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public String print() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        String string = "Hello Shruthi";
       // return new ResponseEntity<String>(string, headers, HttpStatus.OK);
        return string;
    }
    
} 
