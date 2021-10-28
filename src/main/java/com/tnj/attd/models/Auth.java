package com.tnj.attd.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "Auth")
public class Auth {
    @Id
    @Column(name = "auth_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer auth_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "auth_token", nullable = false)
    private String authToken;

    @Column(name = "auth_time", nullable = false)
    private Instant authTime;

    public Auth() {
    }

    public Integer getAuthId() {
        return auth_id;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public Instant getAuthTime() {
        return authTime;
    }

    public void setAuthTime(Instant authTime) {
        this.authTime = authTime;
    }

}
