package com.madalinBucur;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Cineplex", 8, 12);
        theatre.getSeats();
        theatre.reserveSeat("F04");

        theatre.reserveSeat("H04");


    }
}
