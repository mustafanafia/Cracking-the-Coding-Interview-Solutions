import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    void deleteDups(LinkedListNode n){

        HashSet<Integer> hs = new HashSet<>();
        LinkedListNode prev = null;

        while(n != null){
            if(hs.contains(n.data)){
                prev.next = n.next;
            }
            else{
                hs.add(n.data);
                prev = n;
            }
            n = n.next;
        }

    }
}