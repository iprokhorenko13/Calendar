package calendar.service.impl;

import calendar.entity.Calendar;
import calendar.repository.CalendarRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class CalendarService implements calendar.service.CalendarService {
    private final CalendarRepo calendarRepo;

    @Override
    public Set<Calendar> getCalendars(Long userId, boolean includeCommon) {
        Set<Calendar> calendars;
        if (userId == null) {
            calendars = new HashSet<>(calendarRepo.findAll());
        } else {
            calendars = new HashSet<>(calendarRepo.findByUser_id(userId));
        }
        if (includeCommon) {
            calendars.addAll(calendarRepo.findByType_common(true));
        }
        return calendars;
    }
}
