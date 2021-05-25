package ua.courseAssignment.group3.automaticallytesting.dao;

import java.util.List;

public interface VariableDAO {
    void createVariables(Long actionId, List<String> names);
}
