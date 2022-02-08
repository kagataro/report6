package jp.ac.uryukyu.ie.e215758;

public class Main {
    /**
     * このメソッドは基本的にplay.classのメソッドを呼び出すメソッド。
     * 繰り返しジャンケンをするかどうかを判断するのもこのメソッドに追加した。
     * @param args
     */
    public static void main(String[] args) {
        var janken = new Janken();
        janken.start();
        janken.match();
        System.out.println("ロボット「いい試合だったね！まだやるかい？」 \n1:やる \n2:やらない");
        int oneOrTwo = new java.util.Scanner(System.in).nextInt();
        if (oneOrTwo == 1) {
            System.out.println("ロボット「よし！望む所だ！負けないぞ！！」");
            janken.match();
        } else {
            System.out.println("ロボット「そっか...またしようね！！」");
        }
    }
}