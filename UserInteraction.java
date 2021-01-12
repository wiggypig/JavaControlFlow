import org.jetbrains.annotations.NotNull;

import java.util.Scanner;



public class UserInteraction {

//    Print message and Collect the user name and display the collected name
    public static String getName(String commPrompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(commPrompt);
        String name = input.nextLine();
//        System.out.printf("Hello %s.\n", name);
        return name;
    }

    //    Print message and Collect user decision to continue
    public static boolean exitCheck(String greetName) {
        boolean flag = false;
        String decisionPlay = "no";
        System.out.println(greetName);
        // Collect input
        Scanner input = new Scanner(System.in);
        decisionPlay = input.nextLine();
        if ((decisionPlay.equalsIgnoreCase("Y")) || (decisionPlay.equalsIgnoreCase("Yes"))) {
            flag = true;
        } else if (((decisionPlay.equalsIgnoreCase("N"))) || (decisionPlay.equalsIgnoreCase("No"))) {
            flag = false;
        }
        return flag;
    }

    // Print message and collect user string response
    public static @NotNull String getInputString(String commPrompt) {
        String stringResult = "test 2";
        System.out.println(commPrompt);
        Scanner input = new Scanner(System.in);
        stringResult = input.nextLine();
//        System.out.printf("Input is %s.\n", stringResult);
        return stringResult;
    }

    // Print message and collect user numerical response
    public static Integer getInputNumber(String commPrompt) {
       int numResult = 0;
        boolean flag;
        String n;
        Scanner input = new Scanner(System.in);
        System.out.println(commPrompt);
        do {

            n = input.next();
            try {
                Integer.parseInt(n);
                numResult = Integer.parseInt(n);
                flag = false;
            }
            catch (NumberFormatException e)
            {
                System.out.println(commPrompt);
                flag=true;
            }
        }while (flag);
        // printing out just to check assignment is successful
//        System.out.println(numResult);
        return numResult;
    }
    // TODO: generate random number between 1 and 50
    // Print message and collect user numerical response
    public static Integer getRndNumInput(String commPrompt) {
        int numResult = 0;
        /* System.out.println(commPrompt);
        Scanner input = new Scanner(System.in);
//        numResult = input.nextInt();
        System.out.printf("Input is %s.\n", numResult);
        return numResult;*/
        boolean flag = true;
        String n;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println(commPrompt);

            try {
                n = input.next();
                if (Integer.parseInt(n) >= 1 && Integer.parseInt(n) <= 50) {
                    numResult = Integer.parseInt(n);
                    flag = false;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Not a valid number.");
                flag=true;
            }
        }while (flag);
        // printing out just to check assignment is successful
//        System.out.println(numResult);
        return numResult;
    }

}


