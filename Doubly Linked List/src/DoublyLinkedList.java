class DoublyLinkedList {

    // Node class oo matalaysa xubin kasta oo liiska ka mid ah.
    static class Node {
        int data;  // Qaybta xogta ee node-ka
        Node prev, next; // Tixraaca hore iyo midka dambe ee node-ka

        // Constructor si loo abuuro node cusub
        Node(int data) {
            this.data = data; // Ku kaydi xogta node-ka
        }
    }

    Node head = null; // Madaxda liiska, markii hore waa null

    // Function lagu geliyo node cusub dhamaadka liiska.
    public void insert(int data) {
        Node newNode = new Node(data); // Node cusub oo xog cusub wata

        if (head == null) { // Haddii liiska uu faaruq yahay
            head = newNode; // Node-kan cusub ha noqdo madax
        } else {
            Node temp = head; // Ku bilow madaxda
            while (temp.next != null) { // Soco ilaa node-ka ugu dambeeya
                temp = temp.next;
            }
            temp.next = newNode; // Ku xir node-kan cusub dhamaadka
            newNode.prev = temp; // U xir node-ka cusub midkii ka horeeyay
        }
    }

    // Function lagu kala saaro liiska iyadoo la isticmaalayo bubble sort.
    public void sort() {
        if (head == null) return; // Haddii liisku faaruq yahay, dib u laabo

        boolean swapped; // Calaamad si loo ogaado in wax la bedelay
        Node current; // Node-ka hadda socda

        do {
            swapped = false; // Dib u deji calaamada
            current = head; // Ku bilow madaxda

            while (current.next != null) { // Soco ilaa dhamaadka
                if (current.data > current.next.data) { // Haddii xogtu aan kala horreyn
                    int temp = current.data; // Ku meel-geli xogta
                    current.data = current.next.data; // Xogta ugu horreysa dhig kan xiga
                    current.next.data = temp; // Dhig xogtii hore meesha labaad
                    swapped = true; // Calaamadee in wax la bedelay
                }
                current = current.next; // U gudub node-ka xiga
            }
        } while (swapped); // Ku celi ilaa wax dambe aan la bedelin
    }

    // Function lagu soo bandhigo liiska oo dhan.
    public void display() {
        Node temp = head; // Ku bilow madaxda liiska
        while (temp != null) { // Soco ilaa dhamaadka
            System.out.print(temp.data + " <-> "); // Daabac xogta node-ka
            temp = temp.next; // U gudub node-ka xiga
        }
        System.out.println("null"); // Dhamaadka liiska
    }

    // Function-ka main si loo tijaabiyo liiska iyo sorting-ka.
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList(); // Liis cusub oo laba jiho leh

        list.insert(3); // Ku dar 3
        list.insert(1); // Ku dar 1
        list.insert(2); // Ku dar 2

        System.out.print("Before sorting: ");
        list.display(); // Muuji liiska kahor kala saarista

        list.sort(); // Kala saar liiska

        System.out.print("After sorting: ");
        list.display(); // Muuji liiska kadib kala saarista
    }
}
