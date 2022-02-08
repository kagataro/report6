package jp.ac.uryukyu.ie.e215758;

import java.rmi.Naming;
import java.util.Scanner;

/**
 * このクラスはプレイヤーとコンピュータがジャンケンをするために作ったクラス。
 * 基本的に必要なメソッドはここのクラスに記述されている。
 */
public class Janken {
    /**
     * このメソッドは最初に実行されるメソッドで、AIと自己紹介する。
     */
    public static void start() {
        System.out.println("AI「やあ！僕はジャンケンAI！君の名前を教えて！」");
        String PlayerName = new java.util.Scanner(System.in).nextLine();
        System.out.println("AI「よろしくね！" + PlayerName + "さん！」");
    }

    /**
     * このメソッドはコンピュータ側がジャンケンで何出すのかを決めるメソッド。
     * @return jankenOfRobotto AIがジャンケンで出す手。
     */
    public static String jankenOfRobotto() {
        String[] kindOfJanken = {"グー", "チョキ", "パー"};
        int num = new java.util.Random().nextInt(3);
        String jankenOfRobotto = kindOfJanken[num];
        return jankenOfRobotto;
    }

    /**
     * このメソッドはプレイヤー側がジャンケンで何出すのかを決めるメソッド。
     * @return jankenOfPlayer プレイヤーがジャンケンで出す手。
     */
    public static String jankenOfPlayer() {
        System.out.println("AI「勝負だ！行くぞ！最初はグー！ジャンケン...」");
        String[] kindOfJanken = {"グー", "チョキ", "パー"};
        System.out.println("何を出す？ \n1:グー \n2:チョキ \n3:パー");
        int imput = new java.util.Scanner(System.in).nextInt();
        String jankenOfPlayer = kindOfJanken[imput - 1];
        return jankenOfPlayer;
    }

    /**
     * このメソッドが実際にジャンケンをして結果を出力してくれるメソッド。
     */
    public static void match() {
        String result;
        String jankenOfRobotto = jankenOfRobotto();
        String jankenOfPlayer = jankenOfPlayer();
        System.out.println("AI「ポン！！！」 \n AI：" + jankenOfRobotto + "\nあなた：" + jankenOfPlayer);
        switch (jankenOfRobotto) {
            case "グー":
                if (jankenOfPlayer == "グー") {
                    System.out.println("あいこ！惜しい！");
                    result = "あいこ";
                } else if (jankenOfPlayer == "チョキ"){
                    System.out.println("あなたの負けです...残念。");
                    result = "敗北...";
                } else {
                    System.out.println("あなたの勝ちです！すごい！！");
                    result = "勝利！";
                }
                break;
            case "チョキ":
                if (jankenOfPlayer == "グー") {
                    System.out.println("あなたの勝ちです！すごい！！");
                    result = "勝利！";
                } else if (jankenOfPlayer == "チョキ"){
                    System.out.println("あいこ！惜しい！");
                    result = "あいこ";
                } else {
                    System.out.println("あなたの負けです...残念。");
                    result = "敗北...";
                }
                break;
            case "パー":
                if (jankenOfPlayer == "グー") {
                    System.out.println("あなたの負けです...残念。");
                    result = "敗北...";
                } else if (jankenOfPlayer == "チョキ"){
                    System.out.println("あなたの勝ちです！すごい！！");
                    result = "勝利！";
                } else {
                    System.out.println("あいこ！惜しい！");
                    result = "あいこ";
                }
                break;
        }
    }
}