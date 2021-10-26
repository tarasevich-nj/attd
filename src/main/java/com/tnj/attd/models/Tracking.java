package com.tnj.attd.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Tracking")
public class Tracking
{
    @Id
    @Column(name = "tracking_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tracking_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Integer user_id;

    @Column(name = "date", nullable = false, columnDefinition = "timestamp")
    private Date date;

    @Column(name = "hours", nullable = false)
    private Integer hour;

    //TODO Get and Set here
}