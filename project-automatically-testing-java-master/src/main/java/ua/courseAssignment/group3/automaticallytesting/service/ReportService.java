package ua.courseAssignment.group3.automaticallytesting.service;

import org.springframework.http.ResponseEntity;
import ua.courseAssignment.group3.automaticallytesting.dto.ActionExecutionDto;
import ua.courseAssignment.group3.automaticallytesting.dto.SubscribedUserTestCaseDto;

import java.util.List;

public interface ReportService {
    ResponseEntity<?> sendReportToUser(List<ActionExecutionDto> actionExecutionList, List<SubscribedUserTestCaseDto> subscribedUsers);
    List<SubscribedUserTestCaseDto> getSubscribedUsers(Long testCaseExecutionId);
}
