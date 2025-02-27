package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.example.util.Gender;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Student")
public class Studententity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private  String name;
    private String adrees;
    private String age;
    @Enumerated(EnumType.STRING)
    private Gender gender;


}
