import java.util.Scanner;
import java.util.Stack;

class NoMoreSymbols{
  static int performOperation(int a, int b, String operation){
    if(operation.equals("add")){
      return (a+b);
    }
    else if(operation.equals("sub")){
      return (a-b);
    }
    else if(operation.equals("mul")){
      return (a*b);
    }
    else if(operation.equals("rem")){
      return (a%b);
    }
    else if(operation.equals("pow")){
      int ans = 1;
      for(int i = 0; i < b; i++){
        ans *= a;
      }
      return ans;
    }
    return 0;
  }
  
  static int getDigit(String number){
    switch(number){
      case "zero" : return 0;
      case "one" : return 1;
      case "two" : return 2;
      case "three" : return 3;
      case "four" : return 4;
      case "five" : return 5;
      case "six" : return 6;
      case "seven" : return 7;
      case "eight" : return 8;
      case "nine" : return 9;
    }
    return -1;
  }
  
  static int getNumber(String numberString){
    String[] numbers = numberString.split("c");
    int number = 0;
    
    if(numbers.length == 1){
      int digit  = getDigit(numbers[0]);

      if(digit == -1){
       System.out.print("expression evaluation stopped invalid words present");
       System.exit(0); 
      }

      return digit;
    }
    else{
      for(int i = 0; i < numbers.length; i++){
        int num = getDigit(numbers[i]);
        
        if(num == -1){
         System.out.print("expression evaluation stopped invalid words present");
         System.exit(0); 
        }
        
        number *= 10;
        number += num;
      }
    }
    
    return number;
  }
  
  static int evaluate(String expression){
    Stack<String> operations = new Stack<>();
    Stack<Integer> operands = new Stack<>();
    String[] op = expression.split(" ");
    int a,b,result;
    int numCount = 0;
    
    for(int i = 0; i < op.length; i++){
      if(op[i].equals("add") || op[i].equals("sub") || op[i].equals("mul") || op[i].equals("rem") || op[i].equals("pow") ){
        operations.push(op[i]);
        numCount = 0;
      }
      else{
        int num = getNumber(op[i]);
        if(num == -1){
          System.out.print("expression is not complete or invalid");
          System.exit(0);
        }

        numCount++;
        operands.push(num);

        if(numCount == 2){
          b = operands.pop();
          a = operands.pop();
          int ans = 0;
          if(!operations.isEmpty()){
            ans = performOperation(a,b,operations.pop());
          }
          else{
            System.out.print("expression is not complete or invalid");
          	System.exit(0);
          }
          
          operands.push(ans);

          numCount--;
        }
      }
    }
    
    if(operands.size() != 1 || !operations.isEmpty()){
      System.out.print("expression is not complete or invalid");
      System.exit(0);
    }
    
    return operands.pop();
  }
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String expression = sc.nextLine();
    
    System.out.print(evaluate(expression));
  }
}