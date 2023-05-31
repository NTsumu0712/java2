
//入力軽減措置　一覧
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//この一文ですべてjava.util系が全て省略できる
import java.util.*;
//配列変数の宣言と同時なら{}での代入OK！
public class Meirei{
	public static void main(String[] args){
		//引数を出力して改行
		System.out.println("hello");
		//引数を出力(改行なし)
		System.out.print("hello");
		//1未満の乱数を生成
		double rnd =Math.random();
		//0~9の値をランダムに生成
		int rndNum =new java.util.Random().nextInt(10);
		//aとbを比較して大きい方の値を返す
		int max = Math.max(a,b);
		//aとbを比較して小さい方の値を返す
		int min = Math.min(a,b);
		//strの文字列をintに変換
		int n = Integer.parseInt("10");
		//strの文字列をdoubleに変換
		double n = Integer.parseInt("152.3");
		//キーボードからの入力を１行まるっと受け取る
		String line=new java.util.Scanner(System.in).nextLine();
		//キーボードからの入力から一つの単語を受け取る
		String word=new java.util.Scanner(System.in).next();
		//キーボードから入力された数字をintに変換
		int num = new java.util.Scanner(System.in).nextInt();
		//キーボードから入力された数字をdoubleに変換
		double num = new java.util.Scanner(System.in).nextDouble();
		//配列変数の宣言と同時なら{}での代入OK！
		int[] dataA = { 3,5,10 };
		//dataA = new int[] {10,20};//OK
		//dataA = {40,10,20}//NG 　int[](配列変数)に関する宣言がない

		//こういった書きかたもある(new int[]をつける)
		int[] dataB =new int[]{4,5,10};
		/*　↑この書き方なら宣言と同時でなくても
		 * 　　　　後から代入することができる。
		 int[] dataB;
		 new int[]{4,5,10};*/

		//配列の要素を全部回すパターン１(走査/そうさ)
		for(int i=0;i<dataA.length;i++){
			System.out.println(dataA[i]);
		}
		//拡張for文
		for(int num : dataB){
			System.out.println(num);
		}//配列の未読の要素がなくなるまでループを続ける

		String[] candies = {"red","blue","yellow"};
		for(String candy : candies){
			System.out.println(candy);
		}//例文
    int[] dataA={3,5,10}
		System.out.println(Arrays.toString(dataA));
		//↑配列の内容を"全て"文字列にして見せてくれる命令
		//例[3.5.10]
		
		//配列の昇順ソート
		Arrays.sort(arr)
		
		//部分文字列の作成
		//文字列.substring(以上,未満)
		String S ="meirei dayo"
		String mozi= S.substring(0,2);//me
		String mozi= S.substring(7);//dayo
		String mozi= S.substring(0,S.length()-1);//meirei day
																						 
		//書式を使って文字列を作成する
		String fmt = String.format("%d:%s:%.1f",10,"Hello",20.235);
	}
}
