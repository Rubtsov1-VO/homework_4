package homework_1;

public class Main {

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.remove(2);
        list.remove(1);
        list.add(5);
        list.add(6);
        list.add(7);
        list.print();

    }
}