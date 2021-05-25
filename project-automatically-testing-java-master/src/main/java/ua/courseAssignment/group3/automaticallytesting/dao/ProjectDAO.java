package ua.courseAssignment.group3.automaticallytesting.dao;

import ua.courseAssignment.group3.automaticallytesting.dto.ProjectDto;
import ua.courseAssignment.group3.automaticallytesting.dto.ProjectListPaginationDto;
import ua.courseAssignment.group3.automaticallytesting.model.Project;

import java.util.List;

public interface ProjectDAO {

    List<Project> findAll(ProjectListPaginationDto pagination);

    Project getProjectById(Long id);

    ProjectDto getProjectDtoById(Long id);

    void update(Project project);

    Integer countProjects(ProjectListPaginationDto pagination);

    void insert(Project project);

    void updateIsArchivedField(Long projectId, boolean isArchived);
}
