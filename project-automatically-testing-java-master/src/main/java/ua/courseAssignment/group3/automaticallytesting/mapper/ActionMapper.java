package ua.courseAssignment.group3.automaticallytesting.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ua.courseAssignment.group3.automaticallytesting.model.Action;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ActionMapper implements RowMapper<Action> {

    /**
     * @param resultSet contains result from DB
     * @param i integer
     * @return Action
     * @throws SQLException throw SQLException
     */
    @Override
    public Action mapRow(ResultSet resultSet, int i) throws SQLException {
        return Action.builder().
                actionId(resultSet.getLong("id"))
                .actionName(resultSet.getString("name"))
                .actionDescription(resultSet.getString("description"))
                .isVoid(resultSet.getBoolean("is_void"))
                .build();
    }
}
