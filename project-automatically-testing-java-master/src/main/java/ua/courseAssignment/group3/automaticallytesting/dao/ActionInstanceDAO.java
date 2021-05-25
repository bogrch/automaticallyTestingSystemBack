package ua.courseAssignment.group3.automaticallytesting.dao;

import ua.courseAssignment.group3.automaticallytesting.dto.TestScenarioItemDto;
import ua.courseAssignment.group3.automaticallytesting.model.ActionInstanceJoined;

import java.util.List;

public interface ActionInstanceDAO {
    List<ActionInstanceJoined> getActionInstanceJoinedByTestCaseId(Long testCaseId);

    void saveActionInstancesWithoutCompoundInstanceId(List<TestScenarioItemDto> actions, long testScenarioId);

    void saveActionInstancesWithCompoundInstanceId(List<TestScenarioItemDto> actions, long testScenarioId, long compoundInstanceId);
}
