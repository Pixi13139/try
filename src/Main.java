import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        int eletkor = ThreadLocalRandom.current().nextInt(1, 100);
        System.out.println("Az illető életkora: " + eletkor);

        if (eletkor >= 0 && eletkor <= 17) {
            System.out.println("Az illető kiskorú: " + eletkor + " éves");
        } else if (eletkor >= 18 && eletkor <= 64) {
            System.out.println("Az illető felnőtt korú: " + eletkor + " éves");
        } else {
            System.out.println("Az illető nyugdíjas korú: " + eletkor + " éves");
        }


        int num1 = (int) (Math.random() * (11 - 1) + 1);
        int num2 = (int) (Math.random() * (11 - 1) + 1);
        System.out.println("Az első szám: " + num1);
        System.out.println("A második szám: " + num2);
        if (num1 > num2) {
            System.out.println("Az első szám a nagyobb: " + num1 + " nagyobb, mint " + num2);
        } else if (num2 > num1) {
            System.out.println("A második szám nagyobb: " + num2 + " nagyobb, mint " + num1);
        } else {
            System.out.println("A számok egyenlőek: " + num1 + " = " + num2);
        }

//        int randomszam1 = ThreadLocalRandom.current().nextInt(1, 100);
//        System.out.println(randomszam1);

        int randomszam1 = 15;
        if (randomszam1 % 3 == 0) {
            System.out.println("Fizz");
        }

        if (randomszam1 % 5 == 0) {
            System.out.println("Buzz");
        }

        if (randomszam1 % 15 == 0) {
            System.out.println("FizzBuzz");
        }


        int aOldal = (int) (Math.random() * (11 - 1) + 1);
        int bOldal = (int) (Math.random() * (11 - 1) + 1);
        System.out.println("Az egyik oldal: " + aOldal);
        System.out.println("A másik oldal: " + bOldal);
        if (aOldal == bOldal) {
            System.out.println("Mivel az oldalak egyenlőek, így négyzetet alkothatnak");
        } else {
            System.out.println("Mivel az oldalak nem egyformák, így téglalapot alkothatnak");
        }

        if ((aOldal * bOldal) % 2 == 0) System.out.println("A két oldal szorzata páros");
        else {
            System.out.println("A két oldal szorzata páratlan");
        }

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

//        Készítsünk programot, ami elszámol egyesével a születési évünktől az aktuális évig, és
//        mindig kiírja, hogy az adott évben hanyadik életévünket töltöttük

        int szuletesiEv = 1987;
        int aktualisEv = 2023;

        for (int j = szuletesiEv; j < aktualisEv; j++) {
            int eletkorr = j - szuletesiEv;
            System.out.println(j + "-ban/-ben " + eletkorr + " éves voltál!Isten éltessen sokáig!");


        }

//Készítsünk programot, ami sorsol két véletlen számot! Az első 1-10-ig, a második 20-30 közt generálódhasson!
//Készítsünk programot, ami az előzőben kapott első számtól elszámol a másodikig!
//Írjuk át úgy, hogy mindkét szám 1-30 közt generálódjon, és a program mindig a kisebbtől a nagyobbig számoljon

        int num3 = ThreadLocalRandom.current().nextInt(1, 31);
        int num4 = ThreadLocalRandom.current().nextInt(1, 31);
        System.out.println(num3);
        System.out.println(num4);

        System.out.println();


        if (num3 > num4) {
            for (int j = num4; j < num3; j++) {
                System.out.println(j);
            }
        } else {
            for (int j = num3; j < num4; j++) {
                System.out.println(j);
            }
        }
//        Tömbök:

        int[] randomArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        for (int j = 0; j < randomArray.length; j++) {
//            randomArray[j] = ThreadLocalRandom.current().nextInt(1, randomArray.length);
//        }
//
//        System.out.print(Arrays.toString(randomArray));
//
//        System.out.println();
//        for (int j = 1; j < randomArray.length; j++) {
//
//            if (j % 2 != 0) {
//                System.out.print(j + ", ");
//            }
//        }
        System.out.println("A páros számokat elosztjuk kettővel: ");
        for (int m = 0; m < randomArray.length; m++) {
            if (randomArray[m] % 2 == 0) {
                int parosPerKetto = randomArray[m] / 2;
                System.out.print(parosPerKetto + ", ");
            }
        }
        System.out.println();

//Készítsünk egy programot, ami létrehoz egy 5x3 méretű 2D tömböt, és feltölti minden elemét1-10ig terjedő véletlen számokkal!
//Rajzolja is ki a tömböt a konzolra!
//A tömb minden hárommal oszthatóeleméhez adjon hármat!
//Hozz létre egy új logikai tömböt, ami ugyanúgy 5x3-as, és minden elemének értéke attól függ, hogy az előbbi tömbben ugyanazon indexen lévő elem páros-e! Páros esetén true, páratlan esetén false!
//Rajzold is ki ezt konzolra!

        int newArray[][] = new int[5][3];
        for (int j = 0; j < newArray.length; j++) {

            for (int k = 0; k < newArray[j].length; k++) {
                newArray[j][k] = ThreadLocalRandom.current().nextInt(1, 10);

                System.out.print(newArray[j][k] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for (int j = 0; j < newArray.length; j++) {
            for (int k = 0; k < newArray[j].length; k++) {
                if (newArray[j][k] % 3 == 0) {
                    newArray[j][k] = newArray[j][k] + 3;
                }
                System.out.print(newArray[j][k] + " ");
            }
            System.out.println();
        }

        System.out.println();


        int new2Array[][] = new int[5][3];
        for (int j = 0; j < new2Array.length; j++) {
            for (int k = 0; k < new2Array[j].length; k++) {
                new2Array[j][k] = ThreadLocalRandom.current().nextInt(1, 10);

                System.out.print(new2Array[j][k] + " ");
            }
            System.out.println();
        }


        System.out.println();
        boolean logikai[][] = new boolean[5][3];
        for (int k = 0; k < new2Array.length; k++) {
            for (int l = 0; l < newArray[k].length; l++) {
                logikai[k][l] = (new2Array[k][l] % 2 == 0);
            }
        }

        for (int j = 0; j < logikai.length; j++) {
            for (int k = 0; k < logikai[j].length; k++) {
                System.out.print(logikai[j][k] + " ");
            }
            System.out.println();
        }

        Scanner newscan = new Scanner(System.in);
        System.out.println("Írj egy természetes egész számot!");
        int numberr = newscan.nextInt();
int factorial = 1;
        for (int j = numberr; j >0 ; j--)  {
                if (j > 0){factorial = factorial * j;}else System.out.println("HIBA");
            }


        int[] valamicsoda = new int[]{2, 4, 6, 10};
        int sumResult = 0;
        for (int j = 0; j < valamicsoda.length; j++) {
            sumResult = sumResult + valamicsoda[j];}

        System.out.println(sumResult + " -Ez a tömb elemeinek összeadása");



        System.out.println(factorial);



        args1(args);
        System.out.println();
        args2(args);
        System.out.println();
        sakkos(args);
        System.out.println();



        String stringpractice = " cica kutya madár";
        String tisztitott = stringpractice.trim();
        System.out.println(tisztitott);

        String valami = "kutya cica";
        char[] karakterTomb = valami.toCharArray();

// Karakterek kiíratása
        for (char karakter : karakterTomb) {
            System.out.print(karakter + " ");
        }
        System.out.println(valami.toUpperCase());


        //    Készíts programot, ami létrehoz egy 10 elemű 1 dimenziós tömböt úgy, hogy a
//    páros indexeken " " karakter, a páratlanokon "#" karakter legyen! Írja is ki ezt!

        char[] karitombi = new char[10];
        char semmi = ' ';
        char krixkrax = '#';
        for (int j = 0; j < karitombi.length; j++) {
            if (j % 2 == 0) {
                karitombi[j] = semmi;
            }
            if (j % 2 != 0) {
                karitombi[j] = krixkrax;
            }

        }
        System.out.print(Arrays.toString(karitombi));

    }


    //Készíts programot, ami bekér egy egész számot argumentumból, aminek 1-10 közt kell lennie!
// A program hozzon létre egy ekkora 1 dimenziós tömböt, és töltse fel minden elemét egy véletlen egész számmal!
// A program írja is ki ezt!
    public static void args1(String[] args) {
        int oneD[] = new int[Integer.parseInt(args[0])];
        for (int i = 0; i < oneD.length; i++) {
            oneD[i] = ThreadLocalRandom.current().nextInt(1, 200);
        }
        System.out.print(Arrays.toString(oneD));

    }

    //Készíts programot, ami bekér egy egész számot argumentumból, aminek 1-10 közt kell lennie! A program hozzon
// létre egy ekkora 1 dimenziós tömböt, és töltse fel minden elemét úgy, hogy az adott indexen lévő elem az adott
// index értékének négyzete legyen! Pl: 0, 1, 4, 9, 16.. Ezt írja is ki!

    public static void args2(String[] args) {
        int oneD[] = new int[Integer.parseInt(args[0])];
        for (int i = 0; i < oneD.length; i++) {
            oneD[i] = i * i;
        }
        System.out.print(Arrays.toString(oneD));
    }

//    7. Feladat: Készíts programot, ami bekér két számot argumentumból, és létrehoz egy n * m-es 2d tömböt,
//    amiben hozzon létre egy sakktábla mintát. A fehér legyen " " karakter, míg a fekete "#" karakter!
//    Írja is ki ezt igényes formában!

    public static void sakkos(String[] args) {
        if (args.length < 2) System.exit(0);
        char feher = '@';
        char fekete = '#';
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        char[][] sakkos = new char[n][m];
        for (int i = 0; i < sakkos.length; i++) {
            for (int j = 0; j < sakkos[i].length; j++) {
                if ((i + j) % 2 == 0){sakkos[i][j] = feher;}
                if ((i + j) % 2 != 0){sakkos[i][j] = fekete;}
            }
        }
        for (int i = 0; i < sakkos.length; i++) {
            for (int j = 0; j < sakkos[i].length; j++) {
                System.out.print(sakkos[i][j] + " ");
            }
            System.out.println();
        }

    }


}
