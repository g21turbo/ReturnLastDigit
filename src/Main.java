public class Main {
    public static void main(String[] args) {

        System.out.println(printLastDigit(23234536));
        System.out.println(printLastDigit(12345));
        System.out.println(printLastDigit(9991));

    }

    public static int printLastDigit(int number){

        while (number >= 10){
            number = number % 10;
        }
        return number;
    }
}