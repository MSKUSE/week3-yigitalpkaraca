public class FindGrade{

    public static void main(String[] args) {
        int lenght_of_args = args.length;
        if (lenght_of_args == 0) {
        System.out.println("You should give em a score!!!");
    }
        else {
        int grade = Integer.parseInt(args[0]);

            if(grade >= 90){
                System.out.println("Grade : A");


            }    else if(grade >= 80 && grade < 89) {
            System.out.println("Grade : B ");

        }   else if(grade >= 70 && grade< 79){
                System.out.println("Grade : C ");
            }
            else if(grade >= 60 && grade < 69){
                System.out.println("Grade : D");

            } else if(grade >= 00 && grade < 59){
                System.out.println("Grade : FF");

            }else {
                System.out.println("invalid score");
            }
        }

        //Get the score from the user as a file parameter
        //Calculate the grade based on the score
        //Print the grade to the console
        // 90 - 100 -> A
        // 80 - 89 -> B
        // 70 - 79 -> C
        // 60 - 69 -> D
        // 0 - 59 -> F





    }


    public static class FindMinimum {
        public static void main(String[] args) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);
                /*if (num1 < num2 && num1 < num3){
                    System.out.println("Lowest number is num 1 =" + num1);
                }   else if (num2 < num3 && num2 < num3){
                    System.out.println("Lowest is number 2 = "+num2);

                }else {
                    System.out.println("Lowest is number 3 =" +num3);*/
           /*     }*/
            boolean min_num1 = num1 < num2 && num1 < num3;
            boolean min_num2 = num2 < num1 && num2 < num3;
            int minimum = min_num1 ? num1:
                                min_num2 ? num2: num3;
            System.out.println(minimum);


        }
    }

    public static class FindPrimes {
        public static void main(String[] args) {
            int number = Integer.parseInt(args[0]);

            for (int i = 2; i <= number; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }

                }
                if (isPrime) {
                    System.out.println(i);

                }
            }

        }
    }
}