/**
 * Week 8 day 5
 * Scottie Horne
 * Java Control flow
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String userName;
        String msgInteractiveUser = ", Do you wish continue to the interactive portion of this program? (Y/N): ";
        String msgNameRequest = "Please enter your name: ";
        String msgRedAuto = "Do you have a red car? (Y/N): ";
        String msgFavPet = "Please enter the name of your favorite pet: ";
        String msgFavPetAge = "Enter the age of your favorite pet: (numbers only please) ";
        String msgLuckyNumber = "What is your favorite number? ";
        String msgJerseyNumber = "What is your favorite player's jersey number? ";
        String msgAutoYearModel = "What is the two-digit model year of your auto? ";
        String msgCharFirstName = "What is the first name of your favorite character? ";
        String msgRandomNumber = "Please enter a random number (1 to 50): ";
        String response1 = "Hello ";
        String response2 = "That's too bad. I will miss you. Please return later.";
        String response3 = "Please return later to generate another set of numbers!";
        String response4 = "Bye-Bye.";
        boolean keepPlaying = false;
        String AutoResponse;
        String FavPetResponse;
        Integer FavPetAge = 0;
        Integer luckyNumber = 0;
        Integer jerseyNumber = 0;
        Integer autoYearModel = 0;
        String characterFirstName = "";
        Integer randomNumber = 0;
        Integer tmpInteger = 0;
        int[] lottNum = new int[5];


//      This was only to verify that we can print to the console
//        System.out.println("Meow goes the cat!");
        // print the valid characters for input
        Ascii.printNumbers();
        Ascii.printUpperCase();
        Ascii.printLowerCase();

        // Collect user name and print greeting with name
        userName = UserInteraction.getName(msgNameRequest);
        System.out.println(response1 + userName + ".");

        keepPlaying = UserInteraction.exitCheck(userName + msgInteractiveUser);

//        System.out.println(userName);
        // game loop here:
        while (keepPlaying) {

            System.out.println("Let's create some lucky numbers!");
            AutoResponse = UserInteraction.getInputString(msgRedAuto);
            FavPetResponse = UserInteraction.getInputString(msgFavPet);
            FavPetAge = UserInteraction.getInputNumber(msgFavPetAge);
            luckyNumber = UserInteraction.getInputNumber(msgLuckyNumber);
            jerseyNumber = UserInteraction.getInputNumber(msgJerseyNumber);
            autoYearModel = UserInteraction.getInputNumber(msgAutoYearModel);
            characterFirstName = UserInteraction.getInputString(msgCharFirstName);
            randomNumber = UserInteraction.getRndNumInput(msgRandomNumber);

            // create the lottery numbers
            tmpInteger = GenOutPut.genMagicBall(jerseyNumber, randomNumber);
            // Use of the fav pet name
            lottNum[0] = GenOutPut.firstStdBall(FavPetResponse);
            // Use of the model year and lucky number
            lottNum[1] = GenOutPut.secondStdBall(autoYearModel, luckyNumber);
            // Use the random number between 1 and 50, subtracting one of the generated random numbers.
            lottNum[2] = GenOutPut.genStdBall(randomNumber, luckyNumber);
            // Use of the qtrbck num + pet age + lucky number
            lottNum[3] = GenOutPut.thirdStdBall(jerseyNumber, FavPetAge, luckyNumber);
            // Convert the first letter of their favorite actor/actress to an integer and use that value.
            lottNum[4] = GenOutPut.fourthStdBall(characterFirstName);

            Arrays.sort(lottNum);

            // Print out the array of lottery numbers:
            System.out.printf("Lottery numbers: ");
            System.out.printf(Arrays.toString(lottNum));
            System.out.printf(" Magic ball: " + tmpInteger);
            System.out.println();

//            for (int i = 0; i < lottNum.length; ++i) {
//                System.out.printf(luckyNumber[i]);




            // exit check to leave the loop
            keepPlaying = UserInteraction.exitCheck(userName + msgInteractiveUser);
        }

        // Exiting the game messages
        System.out.println(response3);
        System.out.println(response4);

    }
}
