class CircularLinkedList {

    // Xubin class ah oo matalaysa node kasta oo ku jirta liiska wareegsan.
    static class Node {
        int data;  // Qaybta xogta ee node-ka
        Node next; // Tixraaca xigta ee node-kan

        // Constructor si uu node cusub u abuuro.
        Node(int data) {
            this.data = data; // Ku kaydi xogta
        }
    }

    Node head = null; // Madaxda liiska, oo ah null markii hore

    // Function lagu geliyo node cusub dhamaadka liiska.
    public void insert(int data) {
        Node newNode = new Node(data); // Node cusub oo xog cusub wata

        if (head == null) { // Haddii liiska uu faaruq yahay
            head = newNode; // Node-kan cusub ha noqdo madax
            newNode.next = head; // Node-ka dib ugu laabo madaxa (circular)
        } else {
            Node temp = head; // Ku bilow madaxda
            while (temp.next != head) { // Soco ilaa node-ka ugu dambeeya
                temp = temp.next;
            }
            temp.next = newNode; // Ku xir node-ka cusub dhamaadka
            newNode.next = head; // Dib ugu laabo madaxa
        }
    }

    // Function lagu soo bandhigo liiska oo dhan.
    public void display() {
        if (head == null) return; // Haddii liiska faaruq yahay, dib u laabo

        Node temp = head; // Ku bilow madaxda liiska
        do {
            System.out.print(temp.data + " -> "); // Daabac xogta node-ka
            temp = temp.next; // U guur node-ka xiga
        } while (temp != head); // Sii wad ilaa madaxa dib loo gaaro
        System.out.println("(head)"); // Tilmaan in uu yahay madax
    }

    // Function-ka main si loo tijaabiyo liiska.
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList(); // Liis cusub oo wareegsan

        list.insert(1); // Ku dar 1
        list.insert(2); // Ku dar 2
        list.insert(3); // Ku dar 3

        list.display(); // Muuji liiska: 1 -> 2 -> 3 -> (head)
    }
}
