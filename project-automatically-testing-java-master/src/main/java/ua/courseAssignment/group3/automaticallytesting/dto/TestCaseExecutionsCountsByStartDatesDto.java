package ua.courseAssignment.group3.automaticallytesting.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Data
@Builder
public class TestCaseExecutionsCountsByStartDatesDto {
    private Date date;
    private Long numberOfExecutions;

}
