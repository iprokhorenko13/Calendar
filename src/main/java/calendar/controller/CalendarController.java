package calendar.controller;

import calendar.entity.Calendar;
import calendar.entity.Type;
import calendar.service.TypeService;
import calendar.service.UserService;
import calendar.entity.User;
import calendar.service.impl.CalendarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@RestController
public class CalendarController {

    private final UserService userService;
    private final TypeService typeService;
    private final CalendarService calendarService;

    @GetMapping("users")
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }

    @GetMapping("types")
    public ResponseEntity<List<Type>> getTypes() {
        return new ResponseEntity<>(typeService.getTypes(), HttpStatus.OK);
    }

    @GetMapping("calendars")
    public ResponseEntity<Set<Calendar>> getCalendar(@Nullable @RequestParam("userId") Long userId,
                                                     @RequestParam(value = "includeCommon", defaultValue = "false") boolean includeCommon) {
        return new ResponseEntity<>(calendarService.getCalendars(userId, includeCommon), HttpStatus.OK);
    }

}
