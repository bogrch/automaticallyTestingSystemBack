package ua.courseAssignment.group3.automaticallytesting.dto;

import lombok.Builder;
import lombok.Data;
import ua.courseAssignment.group3.automaticallytesting.model.TestCaseUpd;
@Data
@Builder
public class TestCaseWithUserDto {
    private TestCaseUpd testCaseUpd;
    private String email;
}
