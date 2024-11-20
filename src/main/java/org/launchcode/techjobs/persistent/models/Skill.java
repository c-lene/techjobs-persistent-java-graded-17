package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    /** FIELDS **/
    private String description;



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

}
