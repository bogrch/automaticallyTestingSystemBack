package ua.courseAssignment.group3.automaticallytesting.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ua.courseAssignment.group3.automaticallytesting.dto.TestCaseExecutionsCountsByStartDatesDto;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class TestCaseExecutionsCountsByStartDatesMapper implements RowMapper<TestCaseExecutionsCountsByStartDatesDto> {
    @Override
    public TestCaseExecutionsCountsByStartDatesDto mapRow(ResultSet resultSet, int i) throws SQLException {
        return TestCaseExecutionsCountsByStartDatesDto.builder()
                .date(resultSet.getDate("date"))
                .numberOfExecutions(resultSet.getLong("number_of_executions")).build();
    }
}
