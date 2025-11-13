public class PracticeProblems {
    public static void main(String[] args) {}

        // Problem 1
    
        static int countOccurrences (int n) {
            int[] arr = new int[100];
            int count = 0;

            for (int index = 0; index < 100; index += 1) {
                if (arr[index]/n == 1) {
                    count += 1;
                }
                else{
                    count += 0;
                }
            }

            return count;
        }

        // Problem 2
        
        static int[] reverseArray (int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                int total = arr.length;
                arr[i] = arr[total - i];
            }

            return arr;
        }

        // Problem 3

        static int sumGrid (int[][] board) {
            int aa = board[0][0];
            int ab = board[0][1];
            int ac = board[0][2];
            int ad = board[1][0];
            int ae = board[1][1];
            int af = board[1][2];
            int ag = board[2][0];
            int ah = board[2][1];
            int ai = board[2][2];

            int ttl = aa + ab + ac + ad + ae + af + ag + ah + ai;

            return ttl;
        }

        // Problem 4

        static int fib (int n) {
            int[] fibArr = new int[9999];
            fibArr[0] = 0;
            fibArr[1] = 1;
            fibArr[2] = 1;
            fibArr[3] = 2;
            fibArr[4] = 3;
            fibArr[5] = 5;
            
            for (int index = 0; index < fibArr.length; index++) {

            }

        }

    }  

