package com.tnj.attd.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Tracking")
public class Tracking
{
    @Id
    @Column(name = "tracking_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tracking_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "date", nullable = false, columnDefinition = "timestamp")
    private Date date;

    @Column(name = "hours", nullable = false)
    private Integer hour;

    public Integer getTrackingId() {return tracking_id;}
    public User getUserId() {return user;}
    public Date getDate()      {return date;}
    public Integer getHour()   {return hour;}

    public void setUserId(Integer user_id) {this.user=user;}
    public void setDate(Date date) {this.date=date;}
    public void setHour(Integer hour) {this.hour=hour;}
}