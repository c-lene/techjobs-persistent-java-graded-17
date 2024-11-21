package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    /** FIELDS **/
    private String description;

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();


    /** CONSTRUCTORS **/
    // Primary Constructor
    public Skill(String description) {
        this.description = description;
    }

    // No-arg Constructor - Used for Hibernate to create an new Skill object
    public Skill() {}



    /** GETTER & SETTER **/
    // Public Accessor Methods
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
