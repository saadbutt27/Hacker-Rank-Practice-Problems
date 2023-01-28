import java.util.*;

public class Result {


    public long arrayManipulation(int n, int[][] queries) {
        // Write your code here
        int a,b,k;
        long arr[] = new long[n+1];
        for (int i=0; i<queries.length; i++) {
            a = queries[i][0] - 1;
            b = queries[i][1];
            k = queries[i][2];
            arr[a] += k;
            arr[b] -= k;
            System.out.println(Arrays.toString(arr));
        }
        long max = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }
    public int[] matchingStrings(String[] stringList, String[] queries) {
        // Write your code here
        int[] result = new int[queries.length];
        for (int i=0; i<queries.length; i++) {
            int count = 0;
            for (int j=0; j<stringList.length; j++) {
                if (queries[i] == stringList[j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;

    }

    public List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<queries.size(); i++) {
            int count = 0;
            for (int j=0; j<stringList.size(); j++) {
                if (queries.get(i) == stringList.get(j)) {
                    count++;
                }
            }
            result.add(count);
        }
        return result;

    }
    public int[] rotateLeft(int d, int[] arr) {
        // Write your code here
        int p=0;
        while (p<d) {
            int temp = arr[0];
            for (int i=0; i<arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = temp;
            d--;
        }
        return arr;
    }

    public List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here\
        List<Integer> ans = new ArrayList<Integer>();
        List<List<Integer>> arr = new ArrayList<List<Integer>>(n);
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<Integer>());
        }
        int lastAnswer = 0;
        for (List<Integer> query: queries) {
            int queryType = query.get(0);
            int x = query.get(1);
            int y = query.get(2);
            int idx = ((x ^ lastAnswer) % n);
            if (queryType == 1) {
                arr.get(idx).add(y);
            } else {
                lastAnswer = arr.get(idx).get(y % arr.get(idx).size());
                ans.add(lastAnswer);
            }
        }
        return ans;
    }

    public void printEvenOdds(int s,int l){
        if(s%2 == 0){
            System.out.print(s + " ");
        }
        if(s < l){
            printEvenOdds(++s,l);
        }
        if(s%2 != 0){
            System.out.print(s + " ");
        }
    }

    public int hourglassSum(int[][] arr) {
        // Write your code here
        int sums[] = new int[16];
        int maxSum = 0;
        int sum = 0;
        int y=0;
        for (int i=0; i<arr.length-2; i++) {
            for (int x = 0; x<arr.length-2; x++) {
                int k = i;
                int l = x;
                sum = 0;
                boolean flag = true;
                boolean flag1 = true;
                for (int j = x; j<x+3; j++) {
                    sum += arr[i][j];
                    if (j == l+2 && flag1) {
                        i += 1;
                        j -= 2;
                        flag1 = false;
                    }
                    else if (i != k && flag) {
                        i += 1;
                        j -= 2;
                        flag = false;
                    }
                    if (j == l+2 && i == k+2) {
                        i = k;
                    }
                }
                sums[y++] = sum;
            }

        }
        System.out.println(Arrays.toString(sums));
        maxSum = sums[0];
        for (int i=0; i<sums.length; i++) {
            if(maxSum < sums[i]) {
                maxSum = sums[i];
            }
        }
        return maxSum;
    }
    public int hourglassSum1(int[][] arr) {
        // Write your code here
        int sums[] = new int[16];
        int maxSum = 0;
        int sum = 0;
        int x=0;
        for (int i=0; i<arr.length-2; i++) {
            for (int j = 0; j<arr.length-2; j++) {
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                System.out.println(i);
                sums[x++] = sum;
                System.out.println(Arrays.toString(sums));
            }

        }
        System.out.println("\n" + Arrays.toString(sums));
        maxSum = sums[0];
        for (int i=0; i<sums.length; i++) {
            if(maxSum < sums[i]) {
                maxSum = sums[i];
            }
        }

        return maxSum;
    }

    public int smallestNum(int n) {
        int i=1;
        boolean flag = true;
        while (flag) {
            for (int j=1; j<=n; j++) {
                if (i%j != 0) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            } i++;
        }
        return i-1;
    }

    public int palindromeProduct() {
        int product;
        int maxProduct=0;
        int temp;
        int tempRev;
        for (int i=999 ; i>=100; i--) {
            for (int j=i ; j>=100; j--) {
                product = i*j;
                temp = product;
                tempRev=0;
                while (temp != 0) {
                    tempRev = tempRev*10 + temp%10;
                    temp = temp/10;
                }
                if (product == tempRev && product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        return maxProduct;
    }

    public void primeFactors(long n) {
        long max = 0;
        for (long i=2; i<n; i++) {
            if (n%i == 0 && prime(i)) {
                max = i;
                System.out.println(max);
                if (max <= 0) {
                    break;
                }
            }
        }
        System.out.println("Prime factors of " + n + " are " + max);
    }

    public boolean prime(long n) {
        boolean flag = true;
        for(long i=2; i<=n/2; i++){
            if(n%i == 0) {
                flag = false;
                break;
            } else {
                flag =  true;
            }
        }
        return flag;
    }

    public int formingMagicSquare(int[][] s) {
        // Write your code here
        int diffMade = 0;
        for (int i=0; i<s.length; i++) {
            for (int j=0;j<s.length; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }
        for (int i=0; i<s.length; i++) {
            for (int j=0;j<s.length; j++) {

            }
        }

        return diffMade;

    }

    public String catAndMouse(int x, int y, int z) {
        int catA = (z - x) < 0 ? -1 * (z - x) : (z - x);
        int catB = (z - y) < 0 ? -1 * (z - y) : (z - y);

        String result = "";
        if (catA < catB) {
            result = "Cat A";
        } else if (catA > catB) {
            result = "Cat B";
        } else {
            result = "Mouse C";
        }
        return result;
    }

    public String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        System.out.println(smallest + " " + largest);
        for (int i=0; i<=s.length()-k; i++) {
            System.out.println(s.substring(i, i+k)+" "+s.substring(i, i+k).compareTo(smallest));
            if (s.substring(i, i+k).compareTo(smallest) < 0) {
                smallest = s.substring(i, i+k);
                System.out.println("Smallest if: " + smallest);
            }
            System.out.println(s.substring(i, i+k)+" "+s.substring(i, i+k).compareTo(largest));
            if (s.substring(i, i+k).compareTo(largest) > 0) {
                largest = s.substring(i, i+k);
                System.out.println("Largest if: " + largest);
            }

        }

        return smallest + "\n" + largest;
    }

    public void getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int total = 0;
        int k = 0;
        int totCosts[] = new int[keyboards.length * drives.length];
        for (int i=0; i<keyboards.length; i++) {
            for (int j = 0; j<drives.length; j++) {
                total = keyboards[i] + drives[j];
                totCosts[k] = total;
                k++;
            }
        }
        System.out.println(Arrays.toString(totCosts));
        int max = totCosts[0];
        boolean flag = false;
        for (int i=1; i<totCosts.length; i++) {
            if (max < totCosts[i] && totCosts[i] <= b) {
                max = totCosts[i];
                flag = true;
            }
        }
        if (flag)
            System.out.println(max);
        else
            System.out.println(-1);

    }

    public  int countingValleys(int steps, String path) {
        // Write your code here U, D, D, D, U, D, U, U

        int valleyCount = 0;
        char[] pathCh = path.toCharArray();
        int level = 0;
        boolean flag2 = false;
        for (int i=0; i<pathCh.length; i++) {
            boolean flag = false;
            if (pathCh[i] == 'U') {
                level++;
            } else {
                level--;
                flag = true;
            }
            if (flag && level == -1) {
                valleyCount++;
                flag2 = true;
            }
            if (flag2 && level == 0) {}
        }
        return valleyCount;
    }

    public void pageCount(int n, int p) {
        // Write your code here
        int noOfPagesLeft = 0;
        int noOfPagesRight = 0;
        int j=1;
        for (int i=1; i<n; i++) {
            if (p == j) {
                break;
            }
            noOfPagesLeft++;
            if (p == ++j || p == ++j) {
                break;
            }
            System.out.println(j);
        }
        int k = n;
        for (int i=1; i<n; i++) {
            if (p == k) {
                break;
            }
            if (k % 2 != 0) {
                if (p == --k) {
                    break;
                }
            }
            noOfPagesRight++;
            if (p == --k || p == --k) {
                break;
            }
            System.out.println(k);
        }

        if (noOfPagesLeft < noOfPagesRight) {
            System.out.println("Minimum pages turned from left and are: " + noOfPagesLeft);
        } else {
            System.out.println("Minimum pages turned from right and are: " + noOfPagesRight);
        }
    }

    public static int[] removeTheElement(int[] arr, int index1, int index2) {
        if (arr == null || index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length) {
            return arr;
        }
        int[] anotherArray = new int[arr.length - 2];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index1 || i == index2) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    public int sockMerchant(int n, int[] ar) {
        // Write your code here
        System.out.println("original Array: "
                + Arrays.toString(ar));
        int noOfPairs = 0;
        for (int i=0;i<n;i++) {
            boolean flag = false;
            for (int j=i+1; j<n; j++) {
                if (ar[i] == ar[j]) {
                    noOfPairs++;
                    System.out.println(ar[i]);
                    int[] anotherArray = new int[ar.length - 2];
                    for (int m = 0, k = 0; m < ar.length; m++) {
                        if (m == i || m == j) {
                            continue;
                        }
                        anotherArray[k++] = ar[m];
                    }
                    ar = anotherArray;
                    n = n-2;
                    System.out.println("Resultant Array: "
                            + Arrays.toString(ar));
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            } if (flag){
                i--;
            }
        }
        return noOfPairs;
    }

    public void dayOfProgrammer(int year) {
        // Write your code here
        boolean flag = false;
        int date;
//        int programmerDayCount = 256;
//        int sumOf8Months;
        if (year >= 1700 && year <= 1917) {
            if (year % 4 == 0) {
                System.out.println(year + " is a leap year");
//                sumOf8Months = 31+29+31+30+31+30+31+31;
//                programmerDayCount = programmerDayCount - sumOf8Months;
                date = 12;
                flag = true;
            } else{
                System.out.println(year + " is not a leap year");
//                sumOf8Months = 31+28+31+30+31+30+31+31;
//                programmerDayCount = programmerDayCount - sumOf8Months;
                date = 13;
                flag = false;
            }
        } else if (year == 1918) {
//            sumOf8Months = 31+15+31+30+31+30+31+31;
//            programmerDayCount = programmerDayCount - sumOf8Months;
            date = 26;
            flag = true;
        }
        else {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year%400 == 0)) {
                System.out.println(year + " is a leap year");
//                sumOf8Months = 31+29+31+30+31+30+31+31;
//                programmerDayCount = programmerDayCount - sumOf8Months;
                date = 12;
                flag = true;
            } else{
                System.out.println(year + " is not a leap year");
//                sumOf8Months = 31+28+31+30+31+30+31+31;
//                programmerDayCount = programmerDayCount - sumOf8Months;
                date = 13;
                flag = false;
            }
        }
        if (flag) {
            System.out.println(date + ".09." +year);
        } else {
            System.out.println(date + ".09." +year);
        }
    }

    public static void breakingRecords ( int[] scores){
            // Write your code here
            int max = scores[0];
            int min = scores[0];
            int maxCount = 0;
            int minCount = 0;
            boolean flag1 = false;
            boolean flag2 = false;
            for (int i = 1; i < scores.length; i++) {
                if (scores[i] > scores[i - 1]) {
                    for (int j = i - 1; j >= 0; j--) {
                        if (scores[i] == scores[j] || max > scores[i]) {
                            flag1 = false;
                            break;
                        } else {
                            flag1 = true;
                        }
                    }
                    if (flag1) {
                        System.out.println("For max comparison " + scores[i] + " > " + scores[i - 1]);
                        max = scores[i];
                        maxCount++;
                    }
                } else if (scores[i] < scores[i - 1]) {
                    for (int j = i - 1; j >= 0; j--) {
                        if (scores[i] == scores[j] || min < scores[i]) {
                            flag2 = false;
                            break;
                        } else {
                            flag2 = true;
                        }
                    }
                    if (flag2) {
                        System.out.println("For min comparison " + scores[i] + " < " + scores[i - 1]);
                        min = scores[i];
                        minCount++;
                    }
                }
            }
            int records[] = {maxCount, minCount};
            System.out.println("Maximum records broken: " + records[0] + "Minimum records broken: " + records[1]);

        }

    public int getTotalX ( int[] a, int[] b){
            // Write your code here
            int count = 0;
            boolean iter = true;
            boolean flag = false;
            boolean flag2 = false;
            while (iter) {
                for (int check = 1; check <= 100; check++) {
                    if (check % a[0] == 0) {
                        System.out.println(check + " % " + a[0] + " = " + check % a[0]);
                        for (int j = 0; j < a.length; j++) {
                            if (check % a[j] == 0) {
                                System.out.println(check + " % " + a[j] + " = " + check % a[j] + " J=" + j);
                                flag2 = true;
                            } else {
                                flag2 = false;
                                break;
                            }
                        }
                        if (flag2) {
                            for (int k = 0; k < b.length; k++) {
                                if (b[k] % check == 0) {
                                    System.out.println(b[k] + " % " + check + " = " + b[k] % check);
                                    flag = true;
                                } else {
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) {
                                System.out.println(check);
                                count++;
                                iter = false;
                            }
                        }
                    }
                }
                break;
            }
            return count;
        }

    public String kangaroo ( int x1, int v1, int x2, int v2){
            // Write your code here
            if ((x1 > x2 && v1 > v2) || (x2 > x1 && v2 > v1)) {
                return "NO";
            } else {
                for (int i = 0; i < 100000; i++) {
                    x1 += v1;
                    x2 += v2;
                    if (x1 == x2) {
                        break;
                    }
                }
            }
            if (x1 == x2) {

                return "YES";
            } else {
                return "NO";
            }
        }

    public void countApplesAndOranges ( int s, int t, int a, int b, int[] apples, int[] oranges){
            // Write your code here
            int apple = 0;
            int count1 = 0;
            for (int i = 0; i < apples.length; i++) {
                apple = a + apples[i];
                System.out.println("Apples " + apple);
                if ((apple >= s) && (apple <= t)) {
                    count1++;
                }

            }
            int orange = 0;
            int count2 = 0;
            for (int i = 0; i < oranges.length; i++) {
                orange = b + oranges[i];
                if ((orange >= s) && (orange <= t)) {
                    count2++;
                }

            }
            System.out.println(count1);
            System.out.println(count2);
        }

    public void gradingStudents ( int[] grades){
            // Write your code here
            for (int i = 0; i < grades.length; i++) {
                if (grades[i] >= 38) {
                    int diff = (int) ((Math.ceil((float) grades[i] / 5)) * 5) - grades[i];
                    if (diff < 3) {
                        grades[i] = (int) ((Math.ceil((float) grades[i] / 5)) * 5);
                    } else {
                        grades[i] = grades[i];
                    }
                } else {
                    grades[i] = grades[i];
                }
            }
            for (int i = 0; i < grades.length; i++) {
                System.out.println(grades[i]);
            }
        }

    public String timeFormatChanger(String s) {
        String hourStr1 = s.substring(0, 2);
        String hourStr2;
        int hour = Integer.parseInt(hourStr1);

        if (s.contains("PM") && hour <= 12) {
            s = s.replace("PM", "");
            if (hour == 12) {
//                return s;
            } else {
                hour += 12;
                hourStr2 = String.valueOf(hour);
                s = s.replace(hourStr1, hourStr2);
            }
        } else if (s.contains("AM")) {
            s = s.replace("AM", "");
            if (hour == 12) {
                hour = 00;
                hourStr2 = String.valueOf(hour);
                s = 0 + s.replace(hourStr1, hourStr2);
            }
            return s;
        } else {
            return "12 hour format can't have " + s + " time";
        }
        return s;
    }
    public void aaa(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int n = arr.length;
        long sum1 = 0;
        long sum2 = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        for (int j = 1; j < n; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        if (max == min) {
            for (int i = 1; i < n; i++) {
                sum1 += arr[i];
                sum2 += arr[i];
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (arr[i] != max) {
                    sum1 += arr[i];
                }
                if (arr[i] != min) {
                    sum2 += arr[i];
                }
            }
        }
        System.out.println("\nMaximum of array: " + max + "\nMinimum of array: " + min);
        System.out.println("Large solution's sum " + sum1 + " " + sum2);
        System.out.println("Small solution's sum: " + (sum - max) + " " + (sum - min));
    }
    public void maxCandlesNumberChecker(int[] candles) {
        int n = candles.length;
        int max = candles[0];
        for (int i=1; i<n; i++) {
            if (candles[i] > max) {
                max = candles[i];
            }
        }
        int maxCandles = 0;
        for (int i=0; i<n; i++) {
            if (candles[i] == max) {
                maxCandles++;
            }
        }
        System.out.println("\nNo. of candles of maximum number is " + maxCandles);
    }
}
