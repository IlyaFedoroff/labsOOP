package lab1.lab1_2;

import java.util.Scanner;

public class lab1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("введите набор слов\n");
        String words = sc.nextLine();
        System.out.printf("введите предложение:\n");
        String sentence= sc.nextLine();
        System.out.printf("вы ввели: \nнабор слов: %s\nпредложение: %s\n",words,sentence);
        String[] W = words.split(" ");
        String[] S = sentence.split(" ");
        String result="";
        int i = 0;
        int j = 0;
        // сначала два слова из words
        // потом одно слово из sentence
        // и так далее
        // words и sentence это массивы слов
        // то есть сначала два элемента из массива words потом одно слово из массива sentence
        // w - words, s - sentence
        // 0 1 2 3 4 5 6 7
        // 0 mod 3 == 0 words
        // 1 mod 3 == 1 words
        // 2 mod 3 == 2 sentence
        // 3 mod 3 == 0 words
        // 4 mod 3 == 1 words
        // 5 mod 3 == 2 sentence
        // 6 mod 3 == 0 words
        // 7 mod 3 == 1 words
        // 8 mod 3 == 2 sentence
        Boolean flag=true;
        int k = 0;
        while (flag == true){
            if(k%3==0 && i<W.length){
                result=zad1_2.AddWord(result, W[i]);
                i++;
                k++;
            } else
            if(k%3==1 && i<W.length){
                result=zad1_2.AddWord(result, W[i]);
                i++;
                k++;
            } else
            if(k%3==2 && j<S.length){
                result=zad1_2.AddWord(result,S[j]);
                j++;
                k++;
            } else {
                flag=false;
            }
        }

        System.out.printf("результат: \n%s",result);

        sc.close();
    }
}
