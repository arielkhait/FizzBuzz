public class Reduce {
    public static void main(String[] args) {
        int count = 0, num = 100;
        while (num != 0) {
            boolean divisibileby2 = num % 2 == 0;
            if (divisibileby2) {
                num = num / 2;
                count++;
            } else {
                num--;
                count++;
            }
        }
        System.out.println("the count is " + count);
    }
}



