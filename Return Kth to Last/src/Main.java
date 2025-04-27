public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    int printKthToLast(LinkedListNode head, int k){
        if(head = null){
            return 0;
        }
        int index = printKthToLast(head.next, k) + 1;
        if(index == k){
            System.out.println(k + "th to last node is " + head.data);
        }
        return index;

    }
}