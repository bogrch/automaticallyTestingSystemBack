package ua.courseAssignment.group3.automaticallytesting.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ActionVariableDto {
    private Long actionId;
    private String actionName;
    private String actionDescription;
    private String variableName;
}
