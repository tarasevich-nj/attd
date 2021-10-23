package com.tnj.attd.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Tracking")
public class Tracking
{
    @Id
    @Column(name = "tracking_id", nullable = false, unique = true, columnDefinition = "Main Tracking Record ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tracking_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private int user_id;

    @Column(name = "date", nullable = false, columnDefinition = "Wanted DATE to hours input")
    private Date date;

    @Column(name = "hours", nullable = false, columnDefinition = "Value of the HOURS according to DATE")
    private int hour;

    //TODO Get and Set here
}