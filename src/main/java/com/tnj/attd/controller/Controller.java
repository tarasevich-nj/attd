package com.tnj.attd.controller;

import com.tnj.attd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tnj.attd.models.*;

@RestController
public class Controller
{
    private final long int1 = 0;
    private final long int2 = 0;
    private final long inta = 0;
    private static long LastPostInt = 0;

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/addUser")
    public @ResponseBody String addNewUser (@RequestParam String name, String password)
    {
        User u = new User();
        u.setUsername(name);
        u.setPassword(password);
        return "OK";
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
    public Average Average(@RequestParam(value = "int1") long int1, @RequestParam(value = "int2") long int2)
    { return new Average(int1, int2, inta); }

    @PostMapping("/takenumber")
    public long TakeNumber(@RequestParam(value = "num") long LastPostInt)
    {
        this.LastPostInt = LastPostInt;
        return 0;
    }

    @GetMapping("/givenumber")
    public long GiveNumber()
    { return LastPostInt; }

}
