package ua.courseAssignment.group3.automaticallytesting.dao;

import ua.courseAssignment.group3.automaticallytesting.dto.ActionDtoWithIdNameVoid;
import ua.courseAssignment.group3.automaticallytesting.dto.ActionVariableDto;
import ua.courseAssignment.group3.automaticallytesting.model.Action;

import java.util.List;

public interface ActionDAO {

    List<Action> getPageActions(String pageActionSql);

    List<Action> findActionsByName(String pageActionSql,String name);

    List<ActionDtoWithIdNameVoid> findAllWithIdName();

    Integer getNumberOfActions();

    long createAction(String name, String description);

    List<Action> getAllActions();

    List<ActionVariableDto> getActionVariable(Long id);

    void updateActionDescription(Long id, Action action);
}
