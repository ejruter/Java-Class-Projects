public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println("The sum is " + getEvenDigitSum(2));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        else {
            int sum = 0;
            do {
                int num = number % 10;
                number = number /= 10;
                if(num % 2 == 0) {
                    sum += num;
                }
            } while (number > 0);
            return sum;
        }
    }

}





