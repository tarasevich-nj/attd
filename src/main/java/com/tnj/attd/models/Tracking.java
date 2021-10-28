package com.tnj.attd.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Tracking")
public class Tracking {
    @Id
    @Column(name = "tracking_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tracking_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "hours", nullable = false)
    private Integer hours;

    public Integer getTrackingId() {
        return tracking_id;
    }

    public User getUser() {
        return user;
    }

    public void setUserId(User user) {
        this.user = user;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
