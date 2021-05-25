package ua.courseAssignment.group3.automaticallytesting.dao;

import ua.courseAssignment.group3.automaticallytesting.dto.ActionExecutionDto;
import ua.courseAssignment.group3.automaticallytesting.model.ActionExecution;
import ua.courseAssignment.group3.automaticallytesting.model.ActionExecutionPassedFailed;

import java.util.List;

public interface ActionExecutionDAO {
    void addActionExecution(List<ActionExecution> actionExecutionList);
    List<ActionExecutionDto> getAllActionExecution(Long testCaseExecutionId, String pagination,String search);
    List<ActionExecutionPassedFailed> getActionExecutionPassedFailed(String status);

    Integer getQuantityActionsExecutions(Long testCaseExecutionId,String searchName);
}
