package com.tnj.attd.controller;

import org.springframework.web.bind.annotation.*;

import com.tnj.attd.models.*;

@RestController
public class Controller
{
    private final long int1 = 0;
    private final long int2 = 0;
    private final long inta = 0;
    private static long LastPostInt = 0;

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

    @GetMapping("/dbtest")
    public DBMSTest DBMSTest()
    { return new DBMSTest(); }
}
