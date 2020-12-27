package TestDome.DataStructure;

public class LinkListS {

    Node head;

    public LinkListS(){
        head = null;
    }

    public void add(Object value){
        Node newNode = new Node(value,null);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void delete(){
        head=head.next;
    }

    public void delete(Object value){

        Node node = head;
        while(node!=null){
            if(node.next.value==value){
                head=head.next;
            }
            node = node.next;
            break;
        }

    }

    public void display(){
        Node node = head;
        while(node!=null){
            System.out.println(node.value);
            node = node.next;
        }
    }
}
