package org.spring.mvc.Model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.Arrays;

@Component
public class Athlete {
    //@NotNull(message = "This is a required field.") // Size limit
    @Size(min = 1, message = "This is a required field must be greater than 1.") // fail for white space pattern = "   "
    //@NotEmpty(message = "This is a required Field.{@NotEmpty}")
    private String name;
    private String country;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Past(message = "Date must be in the Past.")
    private Date dob;

    @NotNull(message = "This is a required field.") // Size limit
    private String rank; // A , B , C , D

    //pattern "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" , message = "Please enter a valid <b>Email Address.</b>")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @NotNull(message = "This is a required Field.")
    @Min(value = 1, message = "Value must be greater than or equal to 1.")
    @Max(value = 10, message = "Value must be smaller than or equal to 10.")
    private int designation;

    public int getDesignation() {
        return designation;
    }

    public void setDesignation(int designation) {
        this.designation = designation;
    }

    private String[] tournaments;

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String[] getTournaments() {
        return tournaments;
    }

    public void setTournaments(String[] tournaments) {
        this.tournaments = tournaments;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Athlete() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", rank='" + rank + '\'' +
                ", tournaments=" + Arrays.toString(tournaments) +
                '}';
    }
}
