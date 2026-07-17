import java.util.Scanner;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] height=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int width=right-left;
            int area=width*h;
            maxArea=Math.max(maxArea,area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }System.out.println(maxArea);
      
        
        }
    }

