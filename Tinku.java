import java.util.Scanner;

class Arraysum {
    public static void main(String[] args) {
        int sum = 0, sum_array;
        Scanner s = new Scanner(System.in);

        sum_array = s.nextInt();

        int arr[] = new int[sum_array];

        for (int i = 0; i < sum_array; i++) {
            arr[i] = s.nextInt();
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
