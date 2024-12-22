public class OddNumbers{
    //program to print first 100 odd numbers
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (count <= 100) {
            if (i % 2 != 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}