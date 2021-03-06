package ua.courseAssignment.group3.automaticallytesting.dto;

import lombok.*;
import ua.courseAssignment.group3.automaticallytesting.model.VariableValue;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CreateUpdateTestCaseDto {
    private Long id;
    private String testCaseName;
    private Long projectId;
    private Long dataSetId;
    private Long testScenarioId;
    private List<VariableValue> variableValues;
}
