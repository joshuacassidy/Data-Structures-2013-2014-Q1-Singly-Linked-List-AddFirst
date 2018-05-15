public class SingleLinkedList {
    private Node first;

    public void addFirst(int data) {
        if (isEmpty()) {
            first = new Node(data);
        } else {
            Node temp = first;
            first = new Node(data);
            first.setNext(temp);
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void printList() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String str = "";
        Node temp = first;
        while (temp != null) {
            str+=temp.getData() + " ";
            temp=temp.getNext();
        }
        return str;
    }
}
