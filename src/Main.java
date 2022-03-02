import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        testing();
    }
    public static boolean twoDisDup(int[][] arr)
    {

        for(int c = 0;c<arr[0].length;c++) {
        Set<Integer> set = new HashSet<>();
            for (int r = 0; r < arr.length; r++) {
                if (!set.add(arr[r][c])) return true;
            }
        }
        return false;
    }

    public static void testing()
    {
        int[][] arr1 = {{1,3,6},{2,4,7},{1,5,8}};
        test(arr1,1,true);
        int[][] arr2 = {{1,9,6},{4,4,7},{8,7,8}};
        test(arr2,2,false);
        int[][] arr3 = {{3,3,3},{3,3,3},{3,3,3},{3,3,3},{3,3,3}};
        test(arr3,3,true);
        int[][] arr4 = {{29,299,201,192},{89,201,8267,33},{83,432,201,283}};
        test(arr4,4,true);
        int[][] arr5 = {{28,229,211,282},{189,801,867,3},{831,32,21,23},{726,232,927,727}};
        test(arr5,5,false);
    }
    public static void test(int[][] testCase, int num, boolean expected)
    {
        boolean actual  = twoDisDup(testCase);
        String correct = (actual == expected) ? ":)" : "X";
        System.out.println("Test " + num);
        System.out.println("Input:");
        System.out.println(twoDtoStr(testCase));
        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);
        System.out.println(correct);
        System.out.println("------------------------------");
    }

    public static String twoDtoStr(int[][] arr)
    {
        String out = "";
        for(int[] a:arr)
        {
            out += Arrays.toString(a) + "\n";
        }
        return out;
    }
}
