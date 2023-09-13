public class Multiples {
    public static void main(String[] args) {
        int count = 0, num = 1000;
        while (num != 0) {
            boolean divisibleBy15 = num % 15 == 0;
            boolean divisibleBy5 = num % 5 == 0;
            boolean divisibleBy3 = num % 3 == 0;
            if (divisibleBy15) {
                count++;
            }
            else if (divisibleBy5) {
                count++;
            }
            else if (divisibleBy3) {
                count++;
            }
            num--;
        }
        System.out.println("The Number of Multiples of 3 and 5 below 1,000 are: " + count);
    }


    }



