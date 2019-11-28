package com.codeclan.JurassicPark.Repositories;
import com.codeclan.JurassicPark.models.dinosaurs.Dinosaur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DinosaurRepository extends JpaRepository<Dinosaur, Long> {
}
