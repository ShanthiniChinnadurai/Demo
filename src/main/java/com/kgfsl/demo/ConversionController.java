package com.kgfsl.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/converter")
@CrossOrigin(origins = "*")
public class ConversionController {
  @Autowired
private Conversionservice cs;
@RequestMapping(method=RequestMethod.POST)
public ResponseEntity<?> saveConverter(@RequestBody Converter con){
    cs.saveRegister(con);
    return new ResponseEntity<Converter>(con,HttpStatus.OK);
}

@GetMapping("/getall")
public @ResponseBody ResponseEntity<List<Converter>> all() {
    System.out.println("++++++++findall+++++++");


    return new ResponseEntity<List<Converter>>(cs.findAll(), HttpStatus.OK);
}

@RequestMapping(value = "/{id}", method = RequestMethod.GET)
public Converter getRegister(@PathVariable long id) {
    return cs.findOne(id);
}
}
