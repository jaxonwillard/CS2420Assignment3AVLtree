public class NodeLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public NodeLinkedList(Node head){
        this.head = head;
        this.head.setNext(tail);
        this.size = 1;
    }
    public Node getHead(){return head;}

    public void add(Node newNode){
        if (tail == null){
            head.setNext(newNode);
            tail = newNode;
        }
        else{
        tail.setNext(newNode);
        tail = newNode;
        }
        this.size = this.size + 1;
    }

    public int getSize(){return size;}

    public Node find(int index){
        Node returnNode = this.head;
        for (int i = 0; i < index; i++){
            returnNode = returnNode.getNext();
        }
        return returnNode;
    }

}