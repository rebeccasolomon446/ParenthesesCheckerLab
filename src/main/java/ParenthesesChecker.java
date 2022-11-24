import java.util.Stack;

public class ParenthesesChecker {

    public boolean checkParentheses(String testString) {
        Stack<Character> stack1 = new Stack<>();

        for (int i = 0; i < testString.length(); i++) {
            char y = testString.charAt(i);
            if (y == '(' || y == ')') {
                stack1.push(y);

            }






        }


        return false;
        }




    }


//if (stack1.isEmpty()) {
//        return true;
//        }



// make a method called checkParentheses()
// takes in a String
// returns a boolean

// return if the string contains "correct" pairs of parentheses
// return false if not!

// situations for return:
// more opening or closing brackets of particular type (), <>, {}, []
// closing bracket at start, opening one at end
// opening bracket followed by two closing bracket
