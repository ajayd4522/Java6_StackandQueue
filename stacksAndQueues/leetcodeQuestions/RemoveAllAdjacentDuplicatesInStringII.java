// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/description/
// 1209. Remove All Adjacent Duplicates in String II
// Medium

package java6.stacksAndQueues.leetcodeQuestions;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveAllAdjacentDuplicatesInStringII {
    public static String removeDuplicates(String s, int k) {
        Deque <Character> key = new ArrayDeque<>();
        Deque <Integer> value = new ArrayDeque<>();

        for(char ch : s.toCharArray()){
            if(!key.isEmpty() && key.peekLast() == ch){
                int i = value.pollLast();
                value.offer(++i);
                if(value.peekLast() == k){
                    key.pollLast();
                    value.pollLast();
                }
            } else {
                key.offer(ch);
                value.offer(1);
            }
        }

        StringBuilder sb = new StringBuilder ();
        for(char ch : key){
            int i = value.pollFirst();
            while(i != 0){
                sb.append(ch);
                i--;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String ans = removeDuplicates("deeedbbcccbdaa", 3);
        System.out.println(ans);
    }
}
