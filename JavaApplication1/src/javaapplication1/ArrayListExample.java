package javaapplication1;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Abuur ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Ku dar magacyo ArrayList-ka
        names.add("Ahmed");
        names.add("Fatima");
        names.add("Ali");

        // Soo bandhig magacyada ArrayList-ka
        System.out.println("Magacyada ku jira ArrayList-ka: ");
        names.forEach((name) -> {
            System.out.println(name);
        });

        // Tirada guud ee ArrayList-ka
        System.out.println("Tirada magacyada: " + names.size());

        // Ka saar magac gaar ah
        names.remove("Fatima");
        System.out.println("Kadib markii Fatima la saaray: " + names);

        // Hel magac gaar ah oo la isticmaalayo index
        System.out.println("Magaca ku jira index 1 waa: " + names.get(1));
    }
}
