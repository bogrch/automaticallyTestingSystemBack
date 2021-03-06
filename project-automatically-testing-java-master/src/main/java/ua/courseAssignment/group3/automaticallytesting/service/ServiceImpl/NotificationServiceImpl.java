package ua.courseAssignment.group3.automaticallytesting.service.ServiceImpl;

import org.springframework.stereotype.Service;
import ua.courseAssignment.group3.automaticallytesting.dao.NotificationDAO;
import ua.courseAssignment.group3.automaticallytesting.service.NotificationService;
@Service
public class NotificationServiceImpl implements NotificationService {

    private final NotificationDAO notificationDAO;

    public NotificationServiceImpl(NotificationDAO notificationDAO) {
        this.notificationDAO = notificationDAO;
    }

    @Override
    public void addNotifications(long testCaseId, long testCaseExecutionId) {
        notificationDAO.insertNotifications(testCaseId, testCaseExecutionId);

    }
}
