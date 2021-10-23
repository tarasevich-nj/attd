package com.tnj.attd.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "User")
public class User
{
    @Id
    @Column(name = "user_id", nullable = false, unique = true, columnDefinition = "User Main ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column(name = "lastname", length = 100, columnDefinition = "User Lastname")
    private String lastname;

    @Column(name = "firstname", length = 100, columnDefinition = "User Firstname")
    private String firstname;

    @Column(name = "username", nullable = false, unique = true, updatable = false, length = 100, columnDefinition = "User LOGIN string")
    private String username;

    @Column(name = "password", nullable = false, length = 100, columnDefinition = "User PASSWORD string")
    private String password;

    @Column(name = "created", nullable = false, updatable = false, columnDefinition = "User Record CREATE Timestamp")
    private Date created;

    @Column(name = "updated", nullable = false, columnDefinition = "User Record UPDATE Timestamp")
    private Date updated;

    public User() {}

    public void Login(String username, String password)
    {
        setUsername(username);
        setPassword(password);
    }

    public long CreateUser(String username, String password, Date created, Date updated)
    {
        setUsername(username);
        setPassword(password);
        setCreated(created);
        setUpdated(updated);
        return getUserId();
    }

    public long UpdateUser(String username, String password, String firstname, String lastname, Date updated)
    {
        setPassword(password);
        setFirstname(firstname);
        setLastname(lastname);
        setUpdated(updated);
        return getUserId();
    }

    public long getUserId()      {return user_id;   }
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