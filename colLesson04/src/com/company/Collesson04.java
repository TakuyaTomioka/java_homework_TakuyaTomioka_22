package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collesson04 {
    @SuppressWarnings("resource")

    public static void main(String[] args){
        //辞書の作成(ArrayListに変更)
        List<Word> words = new ArrayList<>();

        System.out.println("わからなかった単語とその意味をスペースで区切ってください");

        //コマンドラインから入力できるようにする
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //indexの初期化
        int index = 0;
        while (!input.equals("e")) {
            String[] dictionary = new String[2];
            dictionary = input.split(" ");
            Word wd = new Word(dictionary[0], dictionary[1]);

            //ArrayListなのでaddメソッドで単語を追加する。
            words.add(wd);
            index++;
            System.out.println("次の単語と意味を入力してください。'e'で終了します。");
            input = sc.nextLine();
        }

        //登録されたデータの表示
        for (int i = 0;i < words.size(); i++){
            System.out.println("わからない単語: "+words.get(i).getUnknown()+ " 意味: "+words.get(i).getMeaning());
        }
        System.out.println(words.size()+"件、登録しました。");


    }
}
