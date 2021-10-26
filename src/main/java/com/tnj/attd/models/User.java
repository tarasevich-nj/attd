package com.tnj.attd.models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "User")
public class User
{
    @Id
    @Column(name = "user_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer user_id;

    @Column(name = "lastname", length = 100, columnDefinition = "varchar(100)")
    private String lastname;

    @Column(name = "firstname", length = 100, columnDefinition = "varchar(100)")
    private String firstname;

    @Column(name = "username", nullable = false, unique = true, updatable = false, length = 100, columnDefinition = "varchar(50)")
    private String username;

    @Column(name = "password", nullable = false, length = 100, columnDefinition = "varchar(50)")
    private String password;

    @Column(name = "created", nullable = false, updatable = false, columnDefinition = "timestamp default current_timestamp()")
    private Date created;

    @Column(name = "updated", nullable = false, columnDefinition = "timestamp default current_timestamp() on update current_timestamp()")
    private Date updated;

    public User() {}

    public void Login(String username, String password)
    {
        setUsername(username);
        setPassword(password);
    }

    public Integer CreateUser(String username, String password, Date created, Date updated)
    {
        setUsername(username);
        setPassword(password);
        setCreated(created);
        setUpdated(updated);
        return getUserId();
    }

    public Integer UpdateUser(String username, String password, String firstname, String lastname, Date updated)
    {
        setPassword(password);
        setFirstname(firstname);
        setLastname(lastname);
        setUpdated(updated);
        return getUserId();
    }

    public Integer getUserId()   {return user_id;   }
    public String getUsername()  {return username;  }
    public String getPassword()  {return password;  }
    public String getFirstname() {return firstname; }
    public String getLastname()  {return lastname;  }
    public Date getCreated()     {return created;   }
    public Date getUpdated()     {return updated;   }

    public void setUsername(String username)   {this.username=username;   }
    public void setPassword(String password)   {this.password=password;   }
    public void setFirstname(String firstname) {this.firstname=firstname; }
    public void setLastname(String lastname)   {this.lastname=lastname;   }
    public void setCreated(Date created)       {this.created=created;     }
    public void setUpdated(Date updated)       {this.updated=updated;     }
}