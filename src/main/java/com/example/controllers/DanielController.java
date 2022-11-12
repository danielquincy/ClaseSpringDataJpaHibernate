package com.example.controllers;


import com.example.entity.DanielDto;
import com.example.services.DanielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/daniel")
public class DanielController {

    private final DanielService oService;

    @Autowired
    public DanielController(DanielService oService) {
        this.oService = oService;
    }

    @GetMapping(value = "/todos", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DanielDto>> buscarTodos(){
        return new ResponseEntity<>(oService.buscarTodos(), HttpStatus.OK);
    }

    @GetMapping(value = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DanielDto> buscarPorId(@PathVariable Integer prId){
        return new ResponseEntity<>(oService.buscarPorId(prId), HttpStatus.OK);
    }

    @PostMapping(value = "/insert",  consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insert(@RequestBody DanielDto oDaniel){
        oService.insert(oDaniel);
    }
    @PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody DanielDto oDaniel){
       oService.update(oDaniel);
    }


}
