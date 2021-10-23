package com.tnj.attd.models;

public class Average
{
    private final long int1;
    private final long int2;
    private final long inta;

    public Average(long int1, long int2, long inta)
    {
        this.int1 = int1;
        this.int2 = int2;
        this.inta = (int1 + int2) / 2;
    }

    public long getInt1() { return int1; }
    public long getInt2() { return int2; }
    public long getInta() { return inta; }
}
