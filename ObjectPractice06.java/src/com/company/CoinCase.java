package com.company;


public class CoinCase{

    //Field

    //小銭の配列を作成
    private int coin_500;
    private int coin_100;
    private int coin_50;
    private int coin_10;
    private int coin_5;
    private int coin_1;

    //お金の配列
    //int[] yen = {500, 100, 50, 10, 5, 1};


    //Method

    //コインを追加する処理
    public void addCoins(int type, int count){
        if (type == 500){
            this.coin_500 = this.coin_500 + count;
        }
        else if(type == 100){
            this.coin_100 = this.coin_100 + count;
        }
        else if(type == 50){
            this.coin_50 = this.coin_50 + count;
        }
        else if(type == 10){
            this.coin_10 = this.coin_10 + count;
        }
        else if(type == 5){
            this.coin_5 = this.coin_5 + count;
        }
        else{
            this.coin_1 = this.coin_1 + count;
        }
    }

    //コインの枚数を数える処理
    public int getCount(int type) {
        if (type == 500) {
            return this.coin_500;
        }
        else if (type == 100) {
            return this.coin_100;
        }
        else if (type == 50){
            return this.coin_50;
        }
        else if (type ==10){
            return this.coin_10;
        }
        else if (type == 5){
            return this.coin_5;
        }
        else{
            return this.coin_1;
        }
    }


    //コインの合計金額を数える処理
    public int getAmount(){
        return 500 * coin_500 + 100 * coin_100 + 50 * coin_50 + 10 * coin_10 + 5 * coin_5 + 1 * coin_1;
    }

}
