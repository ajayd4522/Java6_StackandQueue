// https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/
// 1700. Number of Students Unable to Eat Lunch
// Easy
package java6.stacksAndQueues.leetcodeQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NumberOfStudentsUnableToEatLunch {
    
        public static int countStudents(int[] students, int[] sandwiches) {
            int ones = 0; //count of students who prefer type1
            int zeros = 0; //count of students who prefer type0
            
            for(int stud : students){
                if(stud == 0) zeros++;
                else ones++;
            }
            
            // for each sandwich in sandwiches
            for(int sandwich : sandwiches){
                if(sandwich == 0){  // if sandwich is of type0
                    if(zeros == 0){ // if no student want a type0 sandwich
                        return ones;
                    }
                    zeros--;
                }
                else{  // if sandwich is of type1
                    if(ones == 0){  // if no student want a type1 sandwich 
                        return zeros;
                    }
                    ones--;
                }
            }
            return 0;
        }
    
    
    public static void main (String [] args){
        int ans = countStudents(new int []{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1});
        System.out.println(ans);
    }
}
