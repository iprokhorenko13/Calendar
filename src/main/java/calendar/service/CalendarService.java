package calendar.service;

import calendar.entity.Calendar;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface CalendarService {
    Set<Calendar> getCalendars(Long userId, boolean includeCommon);
}
