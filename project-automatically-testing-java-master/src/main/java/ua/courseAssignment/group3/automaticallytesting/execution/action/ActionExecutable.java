package ua.courseAssignment.group3.automaticallytesting.execution.action;

import org.openqa.selenium.WebDriver;
import ua.courseAssignment.group3.automaticallytesting.model.Status;

import java.util.Map;
import java.util.Optional;

public interface ActionExecutable {

    Map<Optional<ContextVariable>,Status> executeAction(WebDriver driver, Map<String, String> variableValues);
}
