package com.tnj.attd.repository;

import org.springframework.data.repository.CrudRepository;
import com.tnj.attd.models.User;

public interface UserRepository extends CrudRepository<User, Integer>
    {

    }
