import java.util.*;

public class Assignment2 {

    public static boolean solve(String s, String[] arr) {
        // System.out.println(s);
        int n = s.length();
        if (n == 0)
            return true;

        // if (m.containsKey(s)) {
        // return m.get(s);

        // }

        for (int i = 1; i <= n; i++) {
            String temp = s.substring(0, i);
            for (int j = 0; j < arr.length; j++) {

                if (temp.equals(arr[j])) {
                    if (solve(s.substring(i), arr)) {
                        return true;
                    }

                }

            }

        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String s = sc.nextLine();
        System.out.println("Enter no. of strings in WordDict");
        int n = sc.nextInt();
        String[] arr = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println(solve(s, arr));
        sc.close();

    }

}
