package calendar.service;

import calendar.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getUsers();
}
