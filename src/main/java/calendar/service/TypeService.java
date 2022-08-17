package calendar.service;

import calendar.entity.Type;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TypeService {
    List<Type> getTypes();
}
