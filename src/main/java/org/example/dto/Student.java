package org.example.dto;

import lombok.*;
import org.example.util.Gender;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Student {
 private Integer id;
 private  String name;
 private  String adrees;
  private String age;
  private Gender gender;

}
