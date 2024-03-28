import java.util.LinkedList;

public class MiddleNodeLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Solution solution = new Solution(); 
        LinkedList<Integer> answer = solution.middleNode(list);
        for(int i : answer){
            System.out.print(" " + i );
        }
    }
}

class Solution {
    public LinkedList<Integer> middleNode(LinkedList<Integer> head) {
        LinkedList<Integer> answer = new LinkedList<>();
        int ListSize = head.size();
        int i = (ListSize/2);

        for(int j=i; j < ListSize; j++){
            int element = head.get(j);
            answer.add(element);
        }
        
        return answer;
    }
}