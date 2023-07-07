import java.util.LinkedList;
import java.util.ListIterator;

public class CustomLinkedList<Element> {

    private Node<Element> first;
    private Node<Element> last;
    private int size = 0;

    public void add(Element element) {
        Node<Element> node;
        if (first == null) {
            node = new Node<>(element, null, null);
              first = node;
        } else {
            node = new Node<>(element, null, last);
              last.next = node;
        }
        last = node;
        size++;
    }
    public int size() {
        return size;
    }
    public Element get(int index) {
        return getNodeByIndex(index).item;
    }
// getFirst
    public Element getFirst() {
        return get(0);
    }

//  getLast

    public Element getLast() {
        return get(size - 1);
    }
    // Set

    public void set(int index, Element element) {
        Node<Element> node = getNodeByIndex(index);
        node.item = element;
    }




    public Node<Element> getNodeByIndex(int index) {
        Node<Element> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }



    public void delete(int index) {
        Node<Element> currentNode = getNodeByIndex(index);
        if (index == 0) {
            first = currentNode.next;
        } else if (index == size-1) {
            last = currentNode.prev;
        } else {
            Node<Element> nodeBefore = currentNode.prev;
            Node<Element> nodeAfter = currentNode.next;
            nodeBefore.next = nodeAfter;
            nodeAfter.prev = nodeBefore;
        }
        size--;
    }
// Without list itterator
    private static class Node<Element> {
        Element item;
        Node<Element> next;
        Node<Element> prev;

        public Node(Element item, Node<Element> next, Node<Element> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}


//* Custom linked list data saved in nodes and contains links for next and previews nodes most effectively for
// pasting and deleting elements
// Array list always reprinted during deleting from scratch, and it takes more time than linked list most effectively for
// adding elements. Elements in array list stored with fix size