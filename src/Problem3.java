import java.math.BigInteger;

public class Problem3 {
    public static void main(String[] args){
        int b=100; //Number of rows
        int prime = 7; //prime number

        BigInteger count= BigInteger.valueOf(nonDivisible(b, prime));

        for (int i=0; i <= b;i++) {
            count = count.add(BigInteger.valueOf(nonDivisible(i, prime)));
        }

        System.out.println(("Number of entries not divisible by 7: "+count));

        }

        public static int nonDivisible(int row, int prime) { //count the non divisible entries
            int count = 0;
            int[][] pascalsTriangle = createPascalsTriangle(row);

            for (int i = 0; i <= row; i++) {
                if (pascalsTriangle[row][i] % prime != 0) {     //time complexity O(n) because it iterates number of rows
                    count++;
                }
            }
            return count;
        }

        public static int[][] createPascalsTriangle(int rows) {
            int[][] triangle = new int[rows+1][rows+1];

            for (int i = 0; i <= rows; i++) {
                triangle[i][0] = 1;
                for (int j = 1; j <= i; j++) {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }

            return triangle;



            }
        }































