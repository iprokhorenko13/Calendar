package calendar.service.impl;

import calendar.entity.User;
import calendar.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements calendar.service.UserService {
    private final UserRepo userRepo;

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
