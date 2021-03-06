package ua.courseAssignment.group3.automaticallytesting.service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.courseAssignment.group3.automaticallytesting.dao.UserDAO;
import ua.courseAssignment.group3.automaticallytesting.model.User;


@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDAO userDao;

    /**
     * @param email needed for searching
     * @return UserDetails
     * @throws UsernameNotFoundException if user is not found
     */
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userDao.findUserByEmail(email);
        return new UserPrincipal(user);
    }
}
