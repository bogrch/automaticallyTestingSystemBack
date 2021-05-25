package ua.courseAssignment.group3.automaticallytesting.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestCaseExecution {
    long id;
    long testCaseId;
    String status;
    //Timestamp startDateTime;
    String startDateTime;
    //Timestamp endDateTime;
    String endDateTime;
    long userId;
}
