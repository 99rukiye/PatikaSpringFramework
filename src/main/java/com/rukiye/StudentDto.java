package com.rukiye;

import jakarta.enterprise.context.Dependent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Dependent
//Data Transfer Object = Dto
public class StudentDto {

    private Long studentId;
    private String studentName;
    private String studentSurname;
}
