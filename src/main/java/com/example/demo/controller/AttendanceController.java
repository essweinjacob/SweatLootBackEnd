package com.example.demo.controller;

import com.example.demo.model.AttendanceItemEntry;
import com.example.demo.respository.AttendanceRepository;
import com.example.demo.model.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/")
public class AttendanceController {
    @Autowired
    private AttendanceRepository attendanceRepository;

    @GetMapping("/getAttendance")
    public List<Attendance> getAllAttendanceEntries() {
        return attendanceRepository.getAllAttendanceEntries();
    }

    @GetMapping("/getItemEntryAttendance")
    public List<AttendanceItemEntry> getAttendanceItemEnty() { return attendanceRepository.getAttendanceItemEntries(); }

    @GetMapping("/getUniqueRaidDates")
    public List <String> getUniqueRaidDates() { return attendanceRepository.getUniqueRaidDates(); }

    @GetMapping("/getUniquePlayerNames")
    public List <String> getUniquePlayerNames() {
        return attendanceRepository.getUniquePlayerNames();
    }

    @PutMapping("/postUpdateAttendance")
    public void updateAttendance(@RequestBody Attendance attendance) {
        attendanceRepository.updateAttendance(attendance);
    }

    @PutMapping("/putAddRaidDate")
    public void addRaidDate(@RequestBody List<Attendance> attendance) {
        attendanceRepository.addRaidDate(attendance);
    }

    @PutMapping("/removeRaidDate")
    public void removeRateDate(@RequestBody String raidDate){
        attendanceRepository.removeRaidDate(raidDate);
    }

    @PutMapping("/addAttendanceForNewUser")
    public boolean addRaidDatesForNewUser(@RequestBody List<Attendance> attendance){
        attendanceRepository.addRaidDatesForNewUser(attendance);
        return true;
    }
}
