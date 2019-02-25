package com.company;

import java.util.HashMap;
import java.util.Map;

public class CoinCase{

    //Field

    //小銭の配列を作成
    int[] coin_case = {0, 0, 0, 0, 0, 0, 0};

    //お金の配列
    int[] yen = {500, 100, 50, 10, 5, 1};


    //Method

    //コインを追加する処理
    public void addCoins(int coin_500, int coin_100, int coin_50, int coin_10, int coin_5, int coin_1){
        coin_case [0] += coin_500;
        coin_case [1] += coin_100;
        coin_case [2] += coin_50;
        coin_case [3] += coin_10;
        coin_case [4] += coin_5;
        coin_case [5] += coin_1;
        System.out.println("コインが追加されました。");
    }

    //コインの枚数を数える処理
    public void getCount(int coin_type){
        System.out.println("指定された"+coin_type+"円硬化の枚数は...");
        //coin_typeが正しいか確認
        if (coin_type == 500 || coin_type == 100|| coin_type == 50|| coin_type == 10 || coin_type == 5 || coin_type == 1) {
            switch (coin_type) {
                case 500:
                    System.out.println(coin_case[0] + "枚です");
                    break;
                case 100:
                    System.out.println(coin_case[1] + "枚です");
                    break;
                case 50:
                    System.out.println(coin_case[2] + "枚です");
                    break;
                case 10:
                    System.out.println(coin_case[3] + "枚です");
                    break;
                case 5:
                    System.out.println(coin_case[4] + "枚です");
                    break;
                case 1:
                    System.out.println(coin_case[5] + "枚です");
                    break;
            }
        }else{
            //想定外のcoin_typeが出てきたとき
            System.out.println("そんな小銭はありません！！！");
        }

    }

    //コインの合計金額を数える処理
    public void getAmount(){
        int sum = 0 ;
        for (int i = 0; i < 6; i++){
            sum += yen[i]*coin_case[i];
        }
        System.out.println("コインケースの合計金額は"+sum+"円です");
    }

}
