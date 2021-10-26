package com.tnj.attd.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Auth")
public class Auth
{
    @Id
    @Column(name = "auth_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer auth_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Integer user_id;

    @Column(name = "Token", nullable = false, columnDefinition = "varchar(100)")
    private String token;

    @Column(name = "DT", nullable = false, columnDefinition = "timestamp")
    private Date dt;

    public Auth() {}
}
