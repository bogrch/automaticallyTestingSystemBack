package ua.courseAssignment.group3.automaticallytesting.dao;

import ua.courseAssignment.group3.automaticallytesting.dto.ActionDtoWithIdNameVoid;
import ua.courseAssignment.group3.automaticallytesting.dto.CompoundDto;
import ua.courseAssignment.group3.automaticallytesting.dto.CompoundDtoWithIdName;
import ua.courseAssignment.group3.automaticallytesting.model.Compound;
import ua.courseAssignment.group3.automaticallytesting.model.CompoundActionWithActionIdAndPriority;
import ua.courseAssignment.group3.automaticallytesting.util.Pageable;
import java.util.List;
import java.util.Optional;

public interface CompoundDAO {

    long getQuantityCompounds(String search);

    List<Compound> findAll(Pageable pageable);

    List<CompoundDtoWithIdName> findAllWithIdName();

    List<CompoundActionWithActionIdAndPriority> findAllCompoundActionsWithActionIdAndPriorityByCompoundId(long compoundId);

    List<ActionDtoWithIdNameVoid> findAllCompoundActionsByCompoundId(long compoundId);

    void archiveCompoundById(long id);

    boolean checkIfNameExist(String name);

    Integer createCompound(Compound compound);

    void createCompoundActions(Integer compoundId,CompoundDto compoundDto);


    Optional<Compound> findCompoundById(long id);
    void updateCompound(Compound compound);

    Optional<CompoundDto> findCompActionListById(long id);
}
