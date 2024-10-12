import java.util.*;

class Solution {
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        int[] sample = new int[numbers.length];
        for (int i=0; i< 1<<numbers.length; i++){
            int part = 0;
            for (int j=0; j < numbers.length; j++){
                if (( i & 1<<j )!= 0 ){
                    part += numbers[j];
                    sample[j] = 1;
                } else{
                    part -= numbers[j];
                    sample[j] = 0;
                }   
            }
            if (part == target){
                answer++;
            }
        }
        
        
        return answer;
        
    }
}