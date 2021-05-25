package ua.courseAssignment.group3.automaticallytesting.dao;

import ua.courseAssignment.group3.automaticallytesting.model.VariableValue;

import java.util.List;

public interface VariableValueDAO {

    void insert(List<VariableValue> variableValues, Long testCaseId);

    void updateDataEntry(List<VariableValue> variableValues);
}
