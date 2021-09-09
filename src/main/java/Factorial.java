public class Factorial {

    public static int calculate(int number){

        int i = 1;
        int result = 1;

        while(i <= number){
            result *= i;

            i++;
        }

        return result;
    }
}
