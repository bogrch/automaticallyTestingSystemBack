package ua.courseAssignment.group3.automaticallytesting.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.courseAssignment.group3.automaticallytesting.dto.ActionDtoWithIdNameVoid;
import ua.courseAssignment.group3.automaticallytesting.dto.CompoundDto;
import ua.courseAssignment.group3.automaticallytesting.model.Compound;
import ua.courseAssignment.group3.automaticallytesting.service.CompoundService;
import ua.courseAssignment.group3.automaticallytesting.util.Pageable;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")@RequestMapping("/compounds")
@Slf4j
public class CompoundController {

    private final CompoundService compoundService;

    public CompoundController(CompoundService compoundService) {
        this.compoundService = compoundService;
    }

    @GetMapping
    public ResponseEntity<?> getCompounds(@RequestParam Integer pageSize,
                                          @RequestParam Integer page,
                                          @RequestParam String search,
                                          @RequestParam String sortField) {
        Pageable pageable = new Pageable();
        pageable.setPageSize(pageSize);
        pageable.setSortField(sortField);
        pageable.setSearch(search);
        pageable.setPage((page > 0 ? page - 1 : 0) * pageSize);
        return ResponseEntity.ok(compoundService.getAllCompounds(pageable));
    }

    @GetMapping("/quantity")
    public ResponseEntity<?> getQuantityCompounds(@RequestParam String search) {
        return ResponseEntity.ok(compoundService.getQuantityCompounds(search));
    }

    @GetMapping("/{id}/actions")
    public ResponseEntity<?> getAllActionsOfCompoundByCompoundId(@PathVariable("id") long compoundId) {
        List<ActionDtoWithIdNameVoid> actions =
                compoundService.getAllCompoundActionsByCompoundId(compoundId);
        return ResponseEntity.ok(actions);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCompoundWithById(@PathVariable long id) throws Exception {
        return ResponseEntity.ok(compoundService.getCompoundById(id));
    }

    @PutMapping("/{id}")
    public void archiveCompoundById(@PathVariable long id) {
        compoundService.archiveCompoundById(id);
    }

    /**
     * Returns boolean if compound name is existed
     * @param name for checking name in DB
     * @return boolean if compound name is existed
     */
    @GetMapping(value = "/create/check/{name}")
    public boolean checkIfNameExist(@PathVariable String name){
        log.info("Check if compound name exists before creating compound with name : {}",name);
        return compoundService.checkIfNameExist(name);
    }

    /**
     * Void method that create compound with compoundDto
     * @param compoundDto needed for creating compound in DB
     */
    @PostMapping(value = "/create")
    public void createCompound(@RequestBody CompoundDto compoundDto){
        log.info("Compound for creating : {}",compoundDto);
        compoundService.createCompound(compoundDto);
    }

    @GetMapping("/edit/{id}")
    public CompoundDto getCompoundById(@PathVariable long id) throws Exception{
        return compoundService.getCompoundById(id);
    }
    @PutMapping("/edit/{id}")
    public void updateCompound(@PathVariable long id, @RequestBody Compound compound){
        compoundService.updateCompound(compound, id);
    }
}

