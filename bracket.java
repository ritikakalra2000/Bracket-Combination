import java.util.*; 
import java.io.*;

class Main {

  public static int left(int left,int right,int answer) {

    left=left-1;
    if (left>0 && left!=right) {
      answer=left(left,right,answer);
      answer=right(left,right,answer);
    }
    else if (right==left && right>0)
    {
      answer=left(left,right,answer);
    }
    else if (left==0)
      answer=right(left,right,answer);
    else 
      answer=answer+1;
    return answer;
  }

  public static int right(int left,int right,int answer)
  {
    right=right-1;
    if (left>0 && left!=right) {
      answer=left(left,right,answer);
      answer=right(left,right,answer);
    }
    else if (right==left && right>0)
    {
      answer=left(left,right,answer);
    }
    else if (left==0 && right>0)
      answer=right(left,right,answer);
    else 
      answer=answer+1;
    return answer;
  }
  public static int BracketCombinations(int num) {
    if(num ==0 || num==1){
      num =1;
    }
    else {
      int right = num;
      int left = num-1;
      int answer=0;
      answer=left(left,right,answer);
      answer=right(left,right,answer);
      num=answer;
    }
    return num;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(BracketCombinations(s.nextInt())); 
  }

}
