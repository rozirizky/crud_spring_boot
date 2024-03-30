package com.imdb.imdb.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "imdb")

public class Movies {
    @Id
    @GeneratedValue
    private int id;
    private String Title;
    private float Rating;
    private int Year;
    private String Synopsis;
    private String Runtime;
    private String Directors;
    private String Filming_location;
    private String Budget;
    private String Income;
   
    private String Country_of_origin;
    private String Genres;
    
    
}
