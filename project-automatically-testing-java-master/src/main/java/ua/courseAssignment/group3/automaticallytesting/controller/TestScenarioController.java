package ua.courseAssignment.group3.automaticallytesting.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.courseAssignment.group3.automaticallytesting.dto.*;
import ua.courseAssignment.group3.automaticallytesting.exception.ValidationException;
import ua.courseAssignment.group3.automaticallytesting.model.CompoundActionWithActionIdAndPriority;
import ua.courseAssignment.group3.automaticallytesting.model.TestScenario;
import ua.courseAssignment.group3.automaticallytesting.service.ActionService;
import ua.courseAssignment.group3.automaticallytesting.service.CompoundService;
import ua.courseAssignment.group3.automaticallytesting.service.TestCaseService;
import ua.courseAssignment.group3.automaticallytesting.service.TestScenarioService;
import ua.courseAssignment.group3.automaticallytesting.util.Pageable;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")@RequestMapping("/test-scenario")
public class TestScenarioController {

    private final TestCaseService testCaseService;
    private final TestScenarioService testScenarioService;
    private final CompoundService compoundService;
    private final ActionService actionService;

    public TestScenarioController(TestScenarioService testScenarioService,
                                  TestCaseService testCaseService, CompoundService compoundService, ActionService actionService) {
        this.testScenarioService = testScenarioService;
        this.testCaseService = testCaseService;
        this.compoundService = compoundService;
        this.actionService = actionService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTestScenarioById(@PathVariable("id") long id) {
        return ResponseEntity.ok(testScenarioService.getTestScenarioById(id));
    }

    @GetMapping("/compounds")
    public ResponseEntity<?> getAllCompoundsWithIdName() {
        List<CompoundDtoWithIdName> compounds = compoundService.getAllCompoundsWithIdName();
        return ResponseEntity.ok(compounds);
    }

    @GetMapping("/actions")
    public ResponseEntity<?> getAllActionsWithIdName() {
        List<ActionDtoWithIdNameVoid> actions = actionService.getAllActionsWithIdName();
        return ResponseEntity.ok(actions);
    }

    @GetMapping("/compounds-actions/{id}")
    public ResponseEntity<?> getAllCompoundActionsByCompoundId(@PathVariable("id") long id) {
        List<CompoundActionWithActionIdAndPriority> compoundActions =
                testScenarioService.getAllCompoundActionsByCompoundId(id);
        return ResponseEntity.ok(compoundActions);
    }

    @PostMapping
    public ResponseEntity<?> createTestScenario(@RequestBody TestScenarioDto testScenario) {
        boolean isCreated = testScenarioService.saveTestScenario(testScenario);
        return ResponseEntity.ok(isCreated);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editTestScenario(@RequestBody TestScenarioDtoWithIdNameArchived testScenario) {
        boolean isUpdated = testScenarioService.updateTestScenario(testScenario);
        return ResponseEntity.ok(isUpdated);
    }

    @GetMapping("/list/page")

    public List<TestScenario> getPageTestScenarios(Integer pageSize, Integer page, String sortOrder, String sortField,
                                   String name) throws ValidationException {
        Pageable pageable = Pageable.builder().page(page).pageSize(pageSize).sortField(sortField).sortOrder(sortOrder).build();
        return testScenarioService.getTestScenarios(pageable, name);
    }

    @GetMapping("/list")
    public List<TestScenario> getAll() {
        return testScenarioService.getAll();
    }

    /**
     * @return actions instances of test scenario
     */
    @GetMapping("/{id}/steps")
    public List<ScenarioStepDto> getTestScenarioActions(@PathVariable("id") Long testCaseId) {

        return testCaseService.getTestScenarioStep(testCaseId);
    }

    @GetMapping("/pages/count")
    public Integer countUserPages(Integer pageSize) {
        return testScenarioService.countPages(pageSize);
    }

}