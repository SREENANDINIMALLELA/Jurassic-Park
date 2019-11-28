package com.codeclan.JurassicPark.models.dinosaurs;

import com.codeclan.JurassicPark.models.paddocks.Paddock;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name ="dinosaurs")
public class Dinosaur
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column (name ="species")
    private String species ;

    @Column (name ="belly")
    private int belly;

    @Column (name ="gender")
    private String gender;

    @Column (name ="age")
    private int age;


    @JsonIgnoreProperties("dinosaur")
    @ManyToOne
    @JoinColumn(name ="pad_id",nullable=false)
    private Paddock paddock;


    public Dinosaur(String species, int belly, String gender, int age ,Paddock paddock) {
        this.species = species;
        this.belly = belly;
        this.gender = gender;
        this.age = age;
        this.paddock=paddock;
    }

    public Dinosaur() {
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getBelly() {
        return belly;
    }

    public void setBelly(int belly) {
        this.belly = belly;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Paddock getPaddock() {
        return paddock;
    }

    public void setPaddock(Paddock paddock) {
        this.paddock = paddock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
