package hellojpa;

import javax.persistence.*;
import javax.swing.text.TabExpander;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.locks.Lock;

@Entity
public class Member extends BaseEntitiy {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID", insertable = false, updatable = false)
    private Team team = new Team();

    @OneToOne
    @JoinColumn(name = "LOCKER_ID")
    Locker locker = new Locker();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
