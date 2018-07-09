package yong.du.leetcode;

public class RemoveDuplicate_84 {

	public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int count = 2;
		if(len <=2) return len;
		
		for (int i = 2; i<len; i++) {
			if(nums[i] != nums[i-2]) 
			{
				nums[count++] = nums[i];
			}
		}
		return count;
    }
	
	public static int removeDuplicates1(int[] nums) {
        int len = nums.length;
        int count = 1;
		if(len <2) return len;
		
		for (int i = 1; i<len; i++) {
			if(nums[i] != nums[i-1]) 
			{
				nums[count++] = nums[i];
			}
		}
		return count;
    }
	
	public static int removeDuplicates3(int[] nums) {
		
		 int n = nums.length;
	     if (n <= 2) return n;
	     int pre = 0;
	     int cur = 1;
	     int count = 1;
	     while (cur < n) {
	          if (nums[pre] == nums[cur] && count == 0) ++cur;
	          else {
	        	  
	              if (nums[pre] == nums[cur]) --count;
	              else count = 1;
	              nums[++pre] = nums[cur++];
	            }
	        }
	        return pre + 1;
	    
	}
	
	public static void main(String[] args) {
		int[] test1= {1,1,1,2,2,3,3,4,5};
		int[] test2= {1,1,1,2,2,3,3};
		int[] test3= {1,1,1,2,2,3,3};
		System.out.println("after removing duplicate elements, the length is:" );
		System.out.println(removeDuplicates1(test1));
		
		
		System.out.println("after keep duplicate element only one time, the length is:" );
		System.out.println(removeDuplicates(test2));
		
		System.out.println("after keep duplicate element only one time, the length is:" );
		System.out.println(removeDuplicates3(test3));
		
	}
}
