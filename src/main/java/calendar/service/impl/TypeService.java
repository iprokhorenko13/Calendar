package calendar.service.impl;

import calendar.entity.Type;
import calendar.repository.TypeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TypeService implements calendar.service.TypeService {
    private final TypeRepo typeRepo;

    @Override
    public List<Type> getTypes() {
        return typeRepo.findAll();
    }
}
