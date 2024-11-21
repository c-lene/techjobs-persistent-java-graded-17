package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    /** FIELDS **/
    @NotBlank
    @Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters.")
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id")                         // Specifies the foreign key column used to link 2 tables
    private List<Job> jobs = new ArrayList<>();



    /** CONSTRUCTORS **/
    // Primary Constructor
    public Employer(String location) {
        this.location = location;
    }

    // No-arg Constructor - Used for Hibernate to create an new Employer object
    public Employer() {}



    /** GETTER & SETTER **/
    // Public Accessor Methods
    public @NotBlank @Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters.") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank @Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters.") String location) {
        this.location = location;
    }

}
