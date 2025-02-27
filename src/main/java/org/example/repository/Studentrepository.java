package org.example.repository;

import org.example.entity.Studententity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Studentrepository extends JpaRepository<Studententity,Integer> {

}
