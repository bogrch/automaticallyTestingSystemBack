package ua.courseAssignment.group3.automaticallytesting.execution;

import ua.courseAssignment.group3.automaticallytesting.dto.TestCaseDto;

import java.util.List;

public interface TestCaseExecutionService {

  /*  Map<Long, ContextVariable> executeTestCase(TestCaseDto testCaseDto,Long testCaseExecutionId);*/
    List<String> executeTestCase(TestCaseDto testCaseDto, Long testCaseExecutionId);

}
