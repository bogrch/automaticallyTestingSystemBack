package ua.courseAssignment.group3.automaticallytesting.service;

import ua.courseAssignment.group3.automaticallytesting.dto.TestScenarioDto;
import ua.courseAssignment.group3.automaticallytesting.dto.TestScenarioDtoWithIdNameArchived;
import ua.courseAssignment.group3.automaticallytesting.exception.ValidationException;
import ua.courseAssignment.group3.automaticallytesting.model.CompoundActionWithActionIdAndPriority;
import ua.courseAssignment.group3.automaticallytesting.model.TestScenario;
import ua.courseAssignment.group3.automaticallytesting.util.Pageable;

import java.util.List;

public interface TestScenarioService {

    boolean updateTestScenario(TestScenarioDtoWithIdNameArchived testScenario);

    boolean saveTestScenario(TestScenarioDto testScenarioDto);

    List<TestScenario> getTestScenarios(Pageable pageable, String name) throws ValidationException;

    List<CompoundActionWithActionIdAndPriority> getAllCompoundActionsByCompoundId(long id);

    List<TestScenario> getTestScenarioById(long id);

    List<TestScenario> getAll();

    Integer countPages(Integer pageSize);


    //     List<User> getUsers(Pageable pageable, String name, String surname, String email, String role);
}
