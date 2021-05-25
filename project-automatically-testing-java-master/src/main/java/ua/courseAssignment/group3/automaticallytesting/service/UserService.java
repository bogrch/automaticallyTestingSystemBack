package ua.courseAssignment.group3.automaticallytesting.service;

import ua.courseAssignment.group3.automaticallytesting.dto.UserSearchDto;
import ua.courseAssignment.group3.automaticallytesting.exception.ValidationException;
import ua.courseAssignment.group3.automaticallytesting.model.User;
import ua.courseAssignment.group3.automaticallytesting.util.Pageable;

import java.util.List;

public interface UserService {

    String getUserEmail(User user);

    void saveUser(User user);

    User getUserByEmail(String email);

    void updateUserById(String email, String name, String surname, String role, boolean is_enabled, long id);

    Integer countPages(Integer pageSize);

    List<User> getUsers(UserSearchDto userSearchDto, Pageable pageable) throws ValidationException;

    User getUserById(long id);

    public Long getUserIdByEmail(String email);

    void updateUserPasswordByToken(String token, String password) throws Exception;

    void updateUserSettings(User user);

    void updateUserPassword(User user);

    Integer countPagesSearch(UserSearchDto userSearchDto, Integer pageSize);

    Boolean checkIfEmailExists(String email);
}
