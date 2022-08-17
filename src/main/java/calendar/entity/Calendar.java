package calendar.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Calendar {
    @Id
    private Long id;
    private String name;
    @JsonFormat(pattern = "dd.MM.YYYY")
    private Date date;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "FK_user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "FK_type")
    private Type type;


}
