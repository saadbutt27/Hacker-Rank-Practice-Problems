
public class Main {
    public static void main(String[] args) {

        Patterns pattern = new Patterns();
        pattern.solidRectangle(5,5);
        pattern.hollowRectangle(5,5);
        pattern.halfPyramid(5);
        pattern.invertedHalfPyramid(5);
        pattern.rotatedHalfPyramid180Degrees(5);
        pattern.halfPyramidWithNumbers(5);
        pattern.invertedHalfPyramidWithNumbers(5);
        pattern.floydTriangle(5);
        pattern.onOffTriangle(5);
        pattern.solidRhombus(5);
        pattern.numberPyramid(5);
        pattern.palindromicNumberPyramid(5);
        pattern.pyramid(5);


        /*
        Result problem = new Result();

        int arr[][] = { {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}
        };
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(problem.hourglassSum(arr));

        int candles[] = {1,2,3,5,5};
        problem.maxCandlesNumberChecker(candles);

        int arr[] = {1, 2, 3, 4, 5};
        problem.aaa(arr);

        System.out.println(problem.smallestNum(20));

        problem.primeFactors(600851475143L);

        int s[][] = {{5,3,4},{1,5,8},{6,4,2}};
        System.out.println(problem.formingMagicSquare(s));

        System.out.println(problem.catAndMouse(100,11,55));

        System.out.println(problem.getSmallestAndLargest("welcometojava", 3));

        int keyboards[] = {4};
        int drives[] = {5};
        problem.getMoneySpent(keyboards, drives, 5);

        System.out.println("Valleys passed: "+ problem.countingValleys(8,"DDUUDDUDUUUD"));

        problem.pageCount(5,4);

        int arr1[] = {44, 55, 11, 15, 4, 72, 26, 91, 80, 14, 43, 78, 70, 75, 36, 83, 78, 91, 17, 17, 54, 65, 60, 21, 58, 98, 87, 45, 75, 97, 81, 18, 51, 43, 84, 54, 66, 10, 44,45, 23, 38, 22, 44, 65, 9, 78, 42, 100, 94, 58, 5, 11, 69, 26, 20, 19, 64, 64, 93, 60, 96, 10, 10, 39, 94, 15, 4, 3, 10, 1, 77, 48, 74, 20, 12, 83, 97, 5, 82, 43, 15, 86, 5, 35, 63, 24, 53, 27, 87, 45, 38, 34, 7, 48, 24, 100, 14, 80, 54};
        int arr2[] = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        System.out.println("Pair of socks "+ problem.sockMerchant(arr1.length,arr2));

        problem.dayOfProgrammer(1700);

        int scores[] = {10,5,20,20,4,5,25,2,1};
        problem.breakingRecords(scores);

        int a[] = {100, 99, 98, 97, 96, 95, 94, 93, 92, 91};
        int b[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(problem.getTotalX(a,b));

        System.out.println(problem.kangaroo(0,3,4,4));

        int[] apples = {-2};
        int[] oranges = {-1};
        problem.countApplesAndOranges(2,3,1,5,apples,oranges);

        int grades[] = {73,67,38,33};
        problem.gradingStudents(grades);

        String time = "24:40:03PM";
        System.out.println(problem.timeFormatChanger(time));

         */



//        int fibo1 = 0;
//        int fibo2 = 1;
//        int fiboNext;
//        int resultSum = 0;
//        for (int i=0; fibo2<4e6; i++) {
//            fiboNext = fibo1 + fibo2;
//            fibo1 = fibo2;
//            fibo2 = fiboNext;
//            if (fibo2 % 2 == 0) {
//                resultSum += fibo2;
//            }
//        }
//        System.out.println(resultSum);

//        int n=1000;
//        int sum = 0;
//        for (int i=2; i<n; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("Sum = " + sum);
        /*


        String A= "madam";
        String B = "";
        for (int i=A.length()-1; i>=0; i--) {
            B += A.charAt(i);
        }
        if (A.compareTo(B) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.printf("Saad Nisar %s!%n", "Butt");

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        System.out.println((A.compareTo(B)) > 0 ? "Yes" : "No");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1) + " " + B.substring(0,1).toUpperCase()+B.substring(1) );


         */

    }

}
