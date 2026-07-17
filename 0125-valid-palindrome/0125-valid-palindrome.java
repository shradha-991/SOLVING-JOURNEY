import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
              System.out.println(false);
              return;
            }
            left++;
            right--;
        }
        System.out.println(true);
        
        }
    }

