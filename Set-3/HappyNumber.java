// ------------ Naive Approach ------------ 

// import java.util.HashSet;

// public class HappyNumber {
//     static boolean isHappyNumber(int num){
//         HashSet<Integer> occurence = new HashSet<>();
//         int currNum = 0;

//         while(currNum != 1){
//             currNum = 0;
//             while(num > 0){
//                 int lastDigit = num % 10;
//                 currNum += lastDigit * lastDigit;
//                 num /= 10;
//             }

//             if(occurence.contains(currNum)){
//                 return false;
//             }
//             else{
//                 occurence.add(currNum);
//             }
//             num = currNum;
//         }

//         return true;
//     }
//     public static void main(String[] args) {
//         int num1 = 19;
//         int num2 = 2;
//         System.out.println(isHappyNumber(num1));
//         System.out.println(isHappyNumber(num2));
//     }
// }


//  ------------ Floyd's Cycle Detection Algorithm ("Tortoise and Hare")  ------------ 


public class HappyNumber {
    static int getNext(int num){
        int nextNum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            nextNum += lastDigit * lastDigit;
            num /= 10;
        }

        return nextNum;
    }

    static boolean isHappyNumber(int num){
        int slow = num;
        int fast = getNext(num);

        while(fast != 1 && slow != fast){
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }

        return fast == 1;
    }
    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 2;
        System.out.println(isHappyNumber(num1));
        System.out.println(isHappyNumber(num2));
    }
}
