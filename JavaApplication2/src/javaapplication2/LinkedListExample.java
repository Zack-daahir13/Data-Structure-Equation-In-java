package javaapplication2;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Abuur LinkedList
        LinkedList<String> names = new LinkedList<>();

        // Ku dar magacyo bilow iyo dhamaadka LinkedList-ka
        names.add("Abdi");
        names.add("Hodan");
        names.addFirst("Yusuf");  // Ku dar bilowga
        names.addLast("Zahra");   // Ku dar dhamaadka

        // Soo bandhig magacyada LinkedList-ka
        System.out.println("Magacyada ku jira LinkedList-ka: ");
        names.forEach((name) -> {
            System.out.println(name);
        });

        // Ka saar magaca ugu horeeya iyo ugu dambeeya
        names.removeFirst();
        names.removeLast();

        System.out.println("Kadib markii magacyada ugu horeeya iyo ugu dambeeya la saaray: " + names);

        // Hel magaca ku jira booska 1
        System.out.println("Magaca booska 1 waa: " + names.get(1));
    }
}
