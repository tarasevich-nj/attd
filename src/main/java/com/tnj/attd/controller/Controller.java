package com.tnj.attd.controller;

import com.tnj.attd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tnj.attd.models.*;

@RestController
public class Controller
{
    private final long inta = 0;
    private static long LastPostInt = 0;

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/addUser")
    public @ResponseBody String addUser (@RequestParam(value = "userName") String userName, @RequestParam(value = "userPassword") String userPassword)
    {
        User u = new User();
        u.setUsername(userName);
        u.setPassword(userPassword);
        return "OK. User created. Id = " + u.getUserId();
    }

    @GetMapping(path="/allUsers")
    public @ResponseBody Iterable<User> getAllUsers()
    {
        return userRepository.findAll();
    }




    @GetMapping("/test")
    public String Test()
    { return "Test ok"; }




    @GetMapping("/average")
    public Average Average(@RequestParam(value = "intone") long int1, @RequestParam(value = "inttwo") long int2)
    { return new Average(int1, int2, inta); }




    @PostMapping("/in")
    public long TakeNumber(@RequestParam(value = "number") long LastPostInt)
    {
        this.LastPostInt = LastPostInt;
        return this.LastPostInt;
    }
    @GetMapping("/out")
    public long GiveNumber()
    { return LastPostInt; }

}
