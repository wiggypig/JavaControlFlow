import java.util.ArrayList;
public class GenOutPut {
    // Max number value for magic ball
    private static final int MaxMagicNum = 75;
    // Max number value for standard ball
    private static final int MaxStdBall = 65;
    // Max number of std ball
    private static final int ballCount = 5;


    // when a number is > than the largest number we need subtract from the max number
    private static int reduceTheBall(int seed, int max) {
        while (seed > max) seed -= max;
        return seed;
    }
    // Generate magic ball number
    public static int genMagicBall(int jrsyNum, int rndNum) {
        int resultball = 0;
        resultball = jrsyNum * rndNum;
        if (resultball > MaxMagicNum - 1){
            resultball = reduceTheBall(resultball, MaxMagicNum);
        }
        return resultball;
    }

//    Find the 3rd letter of their favorite pet.  Convert that character value to an integer value.
    public static int firstStdBall(String petName) {
        int resultball = petName.charAt(2);
        if (resultball > MaxStdBall - 1){
            resultball = reduceTheBall(resultball, MaxStdBall);
        }
        return resultball;
    }

//    Use the two digit model year of their car and add their lucky number to it.
    public static int secondStdBall(int carYear, int luckNumber) {
        int resultball = 0;
        resultball = carYear + luckNumber;
        if (resultball > MaxStdBall -1) {
            resultball = reduceTheBall(resultball, MaxStdBall);
        }
        return resultball;
    }

//    Use the random number between 1 and 50, subtracting one of the generated random numbers.
//    Use the value 42.
    public static int genStdBall(int firstNum, int secondNum) {
        int resultball = 0;
        resultball = firstNum - secondNum;
        if (resultball >= MaxStdBall){
            resultball = reduceTheBall(resultball, MaxStdBall);
        }else if (resultball < ballCount) {
            resultball = (int) Math.floor(Math.random() * 42);
        }
        return resultball;
    }
//    Convert the first letter of their favorite actor/actress to an integer and use that value.
    public static int fourthStdBall(String artistName) {
        int resultball = artistName.charAt(0);
        if (resultball > MaxStdBall - 1){
            resultball = reduceTheBall(resultball, MaxStdBall);
        }
        return resultball;
    }

//    Favorite quarterback number + age of pet + lucky number.
    public static int thirdStdBall(int quarterback, int petAgeNow, int luckNumber) {
        int resultball = 0;
        resultball = quarterback + petAgeNow + luckNumber;
        if (resultball > MaxStdBall -1) {
            resultball = reduceTheBall(resultball, MaxStdBall);
        }
        return resultball;
    }
}
