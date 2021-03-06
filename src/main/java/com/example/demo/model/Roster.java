package com.example.demo.model;

import javax.persistence.*;

@Table(name = "roster")
@Entity
public class Roster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "charName")
    private String charName;
    @Column(name="charClass")
    private String charClass;
    @Column(name="notes")
    private String notes;


    private int attendCount;

    public Roster(){}

    public Roster(String charName, String charClass, String notes) {
        super();
        this.charName = charName;
        this.charClass = charClass;
    }


    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public int getAttendCount() {
        return attendCount;
    }

    public void setAttendCount(int attendCount) {
        this.attendCount = attendCount;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
