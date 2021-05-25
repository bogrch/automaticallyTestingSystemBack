package ua.courseAssignment.group3.automaticallytesting.service;

import ua.courseAssignment.group3.automaticallytesting.dto.TestCaseWithUserDto;
import ua.courseAssignment.group3.automaticallytesting.exception.ValidationException;
import ua.courseAssignment.group3.automaticallytesting.model.TestCaseTopSubscribed;
import ua.courseAssignment.group3.automaticallytesting.dto.CreateUpdateTestCaseDto;
import ua.courseAssignment.group3.automaticallytesting.model.TestCaseUpd;

import java.util.List;

import ua.courseAssignment.group3.automaticallytesting.dto.ScenarioStepDto;
import ua.courseAssignment.group3.automaticallytesting.dto.TestCaseDto;
import ua.courseAssignment.group3.automaticallytesting.util.Pageable;

public interface TestCaseService {

    void createTestCase(CreateUpdateTestCaseDto createUpdateTestCaseDto, Long userId);

    List<ScenarioStepDto> getTestScenarioStep(Long testCaseId);

    TestCaseDto getTestCase(Long testCaseId);

    List<TestCaseWithUserDto> getTestCasesWithUser(Long projectID, Pageable pageable, String name) throws ValidationException;

    List<TestCaseUpd> getAllTestCases();

    Integer countTestCasesByProject(Integer pageSize, Long projectId);

    List<TestCaseTopSubscribed> getFiveTopSubscribedTestCases();

    void updateTestCase(CreateUpdateTestCaseDto createUpdateTestCaseDto);

    void addSubscriber(Long testCaseId, Long userId);

    Boolean isFollowedByUser(Long testCaseId, Long userId);

    void removeSubscriber(Long testCaseId, Long userId);

    void archiveTestCase(Long testCaseId);

    void unarchiveTestCase(Long testCaseId);

}
