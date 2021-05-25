package ua.courseAssignment.group3.automaticallytesting.service;

import ua.courseAssignment.group3.automaticallytesting.dto.UserCountDto;

public interface DashboardService {

    UserCountDto getCountOfUsersByRole();
}
