package org.iffat.stuctural_design.adapter;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Masserati();
        Vehicle v2 = new MasseratiAdapter();
        System.out.println(v1);
        System.out.println(v2);
    }
}
