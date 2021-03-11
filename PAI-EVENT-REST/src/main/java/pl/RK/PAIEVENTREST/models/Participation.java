package pl.RK.PAIEVENTREST.models;

import javax.persistence.*;

@Entity
public class Participation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int participationId;

    boolean approved;

    @OneToOne
    UserPAI userPAI;

    @OneToOne
    EventPAI eventPAI;

}
