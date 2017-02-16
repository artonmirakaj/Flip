import java.util.ArrayList;

public class Flip{
	
	public static void main(String[] args) {
		System.out.println(flip("100101"));
	}
	
	public static ArrayList<Integer> flip(String A) {
		
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int curCount = 0;
        int maxCount = 0;
        int i = 0; int j = 0;
        int start = 1;
        int end = -1;
        int maxStart = -1;
        
        while(i < A.length()){
            
            if( A.charAt(i) == '1' ){
                if(curCount - 1 < 0){
                    curCount = 0;
                    start = i+2;
                }else{
                    curCount--;
                }
            }else if( A.charAt(i) == '0' ){
                
                if(curCount + 1 > maxCount){
                    curCount++;
                    maxCount = curCount;
                    maxStart = start;
                    end = i+1;
                }else{
                    curCount++;
                }
            }
            i++;
        }     
        if(maxStart == -1 && end == -1){
            return arr;
        }
        arr.add(maxStart);
        arr.add(end);
        return arr;
		
	}
}
