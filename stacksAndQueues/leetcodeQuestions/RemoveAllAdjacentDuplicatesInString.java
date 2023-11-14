// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
// 1047. Remove All Adjacent Duplicates In String
// Easy
// Two pointers, String Builder, Deque

package java6.stacksAndQueues.leetcodeQuestions;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveAllAdjacentDuplicatesInString {
    // // 1. Two Pointer
    // public String removeDuplicates(String s) {
    //     char [] ch = s.toCharArray();
    //     int end = -1;
    //     for(char c : ch){
    //         if(end >= 0 && ch[end] == c){
    //             --end;
    //         } else {
    //             ch[++end] = c;
    //         }
    //     }

    //     return String.valueOf(ch, 0, end + 1);
    // }

    // // 2. String Builder
    // public String removeDuplicates(String s) {
    //     StringBuilder sb = new StringBuilder();
    //     for( char c : s.toCharArray()){
    //         int size = sb.length();
    //         if(size > 0 && sb.charAt(size -1) == c){
    //             sb.deleteCharAt(size - 1);
    //         } else {
    //             sb.append(c);
    //         }
    //     }

    //     return sb.toString();
    // }


    // 3. Deque
    public String removeDuplicates(String s) {
        Deque <Character> dq = new ArrayDeque ();
        for(char c : s.toCharArray()){
            if(!dq.isEmpty() && dq.peekLast() == c){
                dq.pollLast();
            } else {
                dq.offer(c);
            }
        }

        StringBuilder sb = new StringBuilder ();
        for(char c : dq){
            sb.append(c);
        }

        return sb.toString();
        
    }
}