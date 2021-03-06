package ua.courseAssignment.group3.automaticallytesting.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestScenarioDtoWithIdNameArchived {
    private long id;
    private String name;
    private boolean archived;
}
