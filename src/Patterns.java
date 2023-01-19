public class Patterns {

        public void solidRectangle(int n, int m) {
            System.out.println("\nSolid Rectangle");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public void hollowRectangle(int n, int m) {
            System.out.println("\nHollow Rectangle");
            for (int i=1; i<=n; i++) {
                for (int j=1; j<=m; j++) {
                    if (i == 1 || j == 1 || i == n || j == m){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        public void halfPyramid(int n) {
            System.out.println("\nHalf Pyramid");
            for (int i=1; i<=n; i++) {
                for (int j=1; j<=i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


        public void invertedHalfPyramid(int n) {
            System.out.println("\nInverted Half pyramid");
            for (int i=n; i>=1; i--) {
                for (int j=1; j<=i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


        public void rotatedHalfPyramid180Degrees(int n) {
            System.out.println("\nRotated Half Pyramid 180 Degrees");
            for (int i=1; i<=n; i++) {
                for (int j=1; j<(n-i+1); j++) {
                    System.out.print("  ");
                }
                for (int j=1; j<=i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


        public void halfPyramidWithNumbers(int n) {
            System.out.println("\nHalf Pyramid With Numbers");
            for (int i=1; i<=n; i++) {
                for (int j=1; j<=i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

        public void invertedHalfPyramidWithNumbers(int n) {
            System.out.println("\nInverted Half Pyramid Withe Numbers");
            for (int i=n; i>=1; i--) {
                for (int j=1; j<=i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

        public void floydTriangle(int n) {
            System.out.println("\nFloyd's Triangle");
            int num = 1;
            for (int i=1; i<=n; i++) {
                for (int j=1; j<=i; j++) {
                        System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }
        }

        public void onOffTriangle(int n) {
            System.out.println("\nOn & Off Triangle");
            for (int i=1; i<=n; i++) {
                for (int j=1; j<=i; j++) {
                    int s = i+j;
                    if (s%2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }

        public void solidRhombus(int n) {
            System.out.println("\nSolid Rhombus");
            for (int i=1; i<=n; i++) {
                for (int j=1; j<=(n-i); j++) {
                    System.out.print("  ");
                }
                for (int j=1; j<=n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public void numberPyramid(int n) {
            System.out.println("\nNumber Pyramid");
            for (int i=1; i<=n; i++) {
                for (int j=1; j<=(n-i); j++) {
                    System.out.print("  ");
                }
                for (int j=1; j<=((2*i)-1); j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }

        public void palindromicNumberPyramid(int n) {
            System.out.println("\nPalindromic Number Pyramid");
            boolean flag = true;
            for (int i=1; i<=n; i++) {
                for (int j=1; j<=(n-i); j++) {
                    System.out.print("  ");
                }
                int k = i;
                for (int j=1; j<=((2*i)-1); j++) {
                    System.out.print(k + " ");
                    if (k > 1 && flag) {
                        k--;
                    } else {
                        k++;
                        flag = false;
                    }
                }
                flag = true;
                System.out.println();
            }
        }

        public void pyramid(int num) {
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= ((2 * i) - 1); k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

}