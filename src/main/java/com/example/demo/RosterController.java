package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/")
public class RosterController {
    @Autowired
    RosterRepository rosterRepository;

    @GetMapping("/getAllRosterEntities")
    public List<Roster> getAllEntities(){
        return rosterRepository.getAllEntities();
    }

    @GetMapping("/getCharClassList")
    public List<String> getUniqueClassNames(){
        return rosterRepository.getUniqueClassNames();
    }
}
