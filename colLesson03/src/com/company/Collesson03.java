package com.company;

import java.util.Scanner;

public class Collesson03 {
    @SuppressWarnings("resource")

    public static void main(String[] args){
        //辞書の作成
        Word[] words = new Word[10];

        System.out.println("わからなかった単語とその意味をスペースで区切ってください");

        //コマンドラインから入力できるようにする
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //indexの初期化
        int index = 0;

        //try-catchで例外処理を施す。
        try {
            while (!input.equals("e")) {
                String[] dictionary = new String[2];
                dictionary = input.split(" ");
                Word wd = new Word(dictionary[0], dictionary[1]);
                words[index] = wd;
                index++;
                System.out.println("次の単語と意味を入力してください。'e'で終了します。");
                input = sc.nextLine();
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("登録制限を越えました。登録済みのデータは以下になります。");
        }

        //登録されたデータの表示
        for (int i = 0; i < index; i++){
            System.out.println("わからない単語: "+ words[i].getUnknown()+"意味: "+words[i].getMeaning());
        }
        System.out.println(index+"件、登録しました。");


    }
}
