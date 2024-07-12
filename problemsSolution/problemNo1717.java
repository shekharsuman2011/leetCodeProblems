package problemsSolution;

import java.util.Stack;

public class problemNo1717 {
    public static int maximumGain(String s, int x, int y) {

        Stack<Character> stack = new Stack<>();
        char[] st = s.toCharArray();
        int ans = 0;
        int high = 0;
        int low = 0;
        String hi;
        String lo;

    if (x>y)
    {
        for (int i = 0; i < st.length; i++) {
            System.out.println("------------------------------");
            System.out.println("length value is : " + st[i]);

            if (st[i] == 'a' || st[i] == 'b') {
                System.out.println("inside of BIG IF :");
                if (!stack.isEmpty()) {
                    if (stack.peek() == 'a' && st[i] == 'b') {
                        System.out.println("inside of A:");
                        stack.pop();
                        ans += x;
                        continue;
                    }

                }

            }
            stack.push(st[i]);
            System.out.println("Ans is : " + ans);
            System.out.println("Stack value is :" + stack);

        }
        System.out.println("Stack last value is : "+stack);
        char[] left ;
        System.out.println("Stack in string : "+stack.toString());
        //------------------------------
        String s2 ="";
        while (!stack.isEmpty())
        {
            s2=s2+stack.pop();
        }

        left =s2.toCharArray();

//        stack.clear();

        System.out.println("++++++++++++++++++++++++++++");
        for (int i = left.length-1; i >=0; i--) {
            System.out.println("------------------------------");
            System.out.println("length value is : " + st[i]);

            if (left[i] == 'b' || left[i] == 'a') {
                System.out.println("inside of BIG IF :");
                if (!stack.isEmpty()) {
                    if (stack.peek() == 'b' && left[i] == 'a') {
                        System.out.println("inside of A:");
                        stack.pop();
                        ans += y;
                        continue;
                    }

                }

            }
            stack.push(left[i]);
            System.out.println("Ans is : " + ans);
            System.out.println("Stack value is :" + stack);

        }
        System.out.println("Stack last value is : "+stack);
        System.out.println("Stack in string : "+stack.toString());

    }
    else
    {
        System.out.println("Enter into else condition");

        for (int i = 0; i < st.length; i++) {
            System.out.println("------------------------------");
            System.out.println("length value is : " + st[i]);

            if (st[i] == 'b' || st[i] == 'a') {
                System.out.println("inside of BIG IF :");
                if (!stack.isEmpty()) {
                    if (stack.peek() == 'b' && st[i] == 'a') {
                        System.out.println("inside of A:");
                        stack.pop();
                        ans += y;
                        continue;
                    }

                }

            }
            stack.push(st[i]);
            System.out.println("Ans is : " + ans);
            System.out.println("Stack value is :" + stack);

        }
        System.out.println("Stack last value is : "+stack);
        char[] left ;
        System.out.println("Stack in string : "+stack.toString());
        //------------------------------
        String s2 ="";
        while (!stack.isEmpty())
        {
            s2=s2+stack.pop();
        }

        left =s2.toCharArray();

//        stack.clear();

        System.out.println("++++++++++++++++++++++++++++");
        for (int i = left.length-1; i >=0; i--) {
            System.out.println("------------------------------");
            System.out.println("length value is : " + st[i]);

            if (left[i] == 'a' || left[i] == 'b') {
                System.out.println("inside of BIG IF :");
                if (!stack.isEmpty()) {
                    if (stack.peek() == 'a' && left[i] == 'b') {
                        System.out.println("inside of A:");
                        stack.pop();
                        ans += x;
                        continue;
                    }

                }

            }
            stack.push(left[i]);
            System.out.println("Ans is : " + ans);
            System.out.println("Stack value is :" + stack);

        }
        System.out.println("Stack last value is : "+stack);
        System.out.println("Stack in string : "+stack.toString());

    }
        return ans;
    }

}
