// https://www.hackerrank.com/challenges/game-of-two-stacks/problem?isFullScreen=false
// Game of Two Stacks
// Medium HackerRank

/*NOTE :-
 *        1. Find the posibillity of max count we can have
 *        2. In question where they ask posibillity or ways there is high chance that the question is need to be solved by
 *        3. Recursion method
 */

package java6.stacksAndQueues.leetcodeQuestions;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class GameOfTwoStacks { 

    public class TwoStacks {
        public static int twoStacks(int maxSum, int [] a, int [] b) {
        
            return twoStacks(a, b, maxSum, 0, 0) - 1;
            // subtracting 1 bcoz
            // loop is breaking when sum is greater than maxSum which is happened in next call
            // our answer count is in previous call, so thats why - 1

        }

        // helper function, recursion tree
        private static int twoStacks (int [] a, int [] b, int maxSum, int sum, int count){
            // base condition
            if(sum > maxSum){
            return count;
            }

            // and if maxSum is not achived and length of array is reducing then 
            if(a.length == 0 || b.length == 0){
                return count;
            }

            int first = twoStacks(Arrays.copyOfRange(a, 1, a.length), b, maxSum, sum + a[0], count + 1);
            int second = twoStacks(a, Arrays.copyOfRange(b, 1, a.length), maxSum, sum + a[0], count + 1);

            return Math.max(first, second);
        }
    }

    public class Solution { 
        public static void main(String[] args) {
            Scanner s = new Scanner (System.in);
            int times = s.nextInt();

            for (int i = 0; i < times; i++) {
                int sizeOfFirst = s.nextInt();
                int sizeOfSecond = s.nextInt();
                int maxSum = s.nextInt();

                int [] first = new int[sizeOfFirst];
                int [] second = new int[sizeOfSecond];


                // enter first array
                for (int j = 0; j < sizeOfFirst; j++) {
                    first[j] = s.nextInt();
                }
                // enter second array
                for (int j = 0; j < sizeOfSecond; j++) {
                    second[j] = s.nextInt();
                }

                System.out.println(TwoStacks.twoStacks(maxSum, first, second));
            }
        }
    }

    
}
