package com.tnj.attd.models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "Auth")
public class Auth
{
    @Id
    @Column(name = "auth_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer auth_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "Token", nullable = false, columnDefinition = "varchar(100)")
    private String token;

    @Column(name = "DT", nullable = false, columnDefinition = "timestamp")
    private Date dt;

    public Auth() {}

    public Integer getAuthId() {return auth_id;}
    public User getUserId() {return user;}
    public String getToken()   {return token;}
    public Date getDt()        {return dt;}

    public void setToken(String token) {this.token=token;}
    public void setDt(Date dt)         {this.dt=dt;}

}
