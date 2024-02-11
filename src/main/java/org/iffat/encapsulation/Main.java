package org.iffat.encapsulation;

public class Main {
    public static void main(String[] args) {
        Car mercedes = new Car(1400, "Red");
        mercedes.setWeight(mercedes.getWeight() + 100);

        System.out.println(mercedes.getWeight());
    }
}
