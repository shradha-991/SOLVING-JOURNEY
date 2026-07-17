import java.util.Scanner;
import java.util.Stack;
class ni{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack <Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) {
                    System.out.println (false);
                     return;}
                char top=st.pop();
                if(ch==')' && top!='(') {
                    System.out.println(false);
                     return;}
                if(ch=='}' && top!='{') {
                    System.out.println(false); 
                    return;}
                if(ch==']' && top!='[') {
                    System.out.println(false); 
                    return;}

            }
               
        }
        System.out.println(st.isEmpty());
        
        }
    }

