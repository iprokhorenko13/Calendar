package calendar.repository;

import calendar.entity.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalendarRepo extends JpaRepository<Calendar, Long> {
    List<Calendar> findByUser_id(Long userId);

    List<Calendar> findFirst3ByUser_id(Long userId);

    List<Calendar> findByType_common(boolean common);

    List<Calendar> findByUser_idAndType_common(Long userId, boolean common);
}
