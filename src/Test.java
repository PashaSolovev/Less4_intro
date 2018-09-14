import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println ("введи числа через запятую(привер: 1,2,3,4,5):");

        Scanner scan1 = new Scanner(System.in);
        String num1;

        boolean repeat;
        do {
            repeat = false;
            num1 = scan1.nextLine();
            String[] strMas = num1.split(",");

            int[] chisla = new int[strMas.length];

            for (int i = 0; i < strMas.length; i++) {
                try {
                    chisla[i] = Integer.parseInt(strMas[i]);
                } catch (NumberFormatException e) {
                    System.out.println("а теперь введи правильно!!!");
                    repeat = true;
                }
            }

            if (!repeat){

                for (int i = 0; i < chisla.length; i++) {
                    System.out.print(strMas[i] + " ");
                }

                System.out.println("");

                for (int i = 0; i < chisla.length; i++) {
                    if (i % 2 == 0) {
                        System.out.print(strMas[i] + " ");
                    }
                }

                int[] chisla2 = new int[chisla.length];

                for(int i=0; i<chisla.length; i++){
                    chisla2[i]=chisla[i];
                }

                System.out.println("");
                System.out.println("(1)- сортировка по возрастанию.");
                System.out.println("(2)- сортировка по убіванию.");

                Scanner scan2 = new Scanner(System.in);
                String you = scan2.nextLine();

                String sort1 = "1";
                String sort2 = "2";

                for (int i = chisla2.length - 1; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if ((you.equals(sort1) && chisla2[j] > chisla2[j + 1]) || (you.equals(sort2) && chisla2[j] < chisla2[j + 1])) {
                            int tmp = chisla2[j];
                            chisla2[j] = chisla2[j + 1];
                            chisla2[j + 1] = tmp;
                        }
                    }
                }

            for (int i = 0; i < chisla2.length; i++) {
                System.out.print(chisla2[i] + " ");
            }

            System.out.println(" ");

            System.out.println("введи чило и узнай его индекс");

                Scanner scan = new Scanner(System.in);

                int num;

                num = scan.nextInt();

                for(int i = 0; i < strMas.length; i++ ) {
                    if (chisla[i] == num) {
                        System.out.print(i + " ");
                    }
                }
            }
        } while (repeat);
    }
}

