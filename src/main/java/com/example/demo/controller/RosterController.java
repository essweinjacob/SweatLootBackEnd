package com.example.demo.controller;

import com.example.demo.respository.RosterRepository;
import com.example.demo.model.Roster;
import com.example.demo.respository.UserRepositoryRoleCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getNoteByName/{charName}")
    @ResponseBody
    public String getNoteByName(@PathVariable("charName") String charName) {
        return rosterRepository.getNoteByName(charName);
    }

    @PutMapping("/updateNote")
    public void updateNote(@RequestBody Roster roster){
        rosterRepository.updateNote(roster);
    }

    @PutMapping("/addNewUserRoster")
    public int addNewUser(@RequestBody Roster roster){
        return rosterRepository.addNewUser(roster);
    }

    @PutMapping("/removeUserFromRoster")
    public boolean removeUser(@RequestBody String charName) {
        return rosterRepository.removeUser(charName);
    }
}
