package ua.courseAssignment.group3.automaticallytesting.dto;

import lombok.Data;

@Data
public class ResetPassDto {
    String token;
    String password;
}
