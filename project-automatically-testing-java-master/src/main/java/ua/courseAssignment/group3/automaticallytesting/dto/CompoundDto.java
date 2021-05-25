package ua.courseAssignment.group3.automaticallytesting.dto;

import lombok.*;
import ua.courseAssignment.group3.automaticallytesting.model.ActionComp;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CompoundDto {
    long id;
    String name;
    String description;
    List<ActionComp> actionList;

}
