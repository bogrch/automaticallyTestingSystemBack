package ua.courseAssignment.group3.automaticallytesting.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ActionExecution {
    private Integer id;
    private Long testCaseExecutionId;
    private Long actionInstanceId;
    private String status;
}
