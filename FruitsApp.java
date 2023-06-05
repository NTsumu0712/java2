/*野菜をいくつ購入しますか>>3
	1つめ野菜>>トマト
	トマトの価格>>120
	2つめ野菜>>レタス
	レタスの価格>>150
	3つめ野菜>>にんじん
	にんじんの価格>>90

	トマト(120円)
	レタス(150円)
	にんじん(90円)
	合計は360円です。

	以上の処理をFruitsクラスとFruitsAppクラスを用いて作成せよ。なお、ファイルはFruitsApp.javaで1枚で行うこと*/

import java.util.*;
public class FruitsApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("野菜をいくつ購入しますか？>>");
			int n = sc.nextInt();
		Fruits[] data = new Fruits[n];
		for(int i =0;i<data.length;i++){
			System.out.printf("%dつめ野菜>>",i+1);
			String name = sc.next();
			System.out.printf("%sの価格>>",name);
			int price = sc.nextInt();
			Fruits f = new Fruits(name,price);
			data[i]= f;
		}
		//合計を管理する変数
		int sum =0;
		for(Fruits f :data){
			f.showInfo();
			//合計金額に個別の金額を加算
			sum +=f.price;
		}
		System.out.printf("合計は%d円です。%n",sum);
	}
}

class Fruits{
	String name;
	int price;
	public Fruits(String name,int price){
		this.name = name;
		this.price = price;
	}
	public void showInfo(){
		System.out.printf("%s(%d円)%n",this.name,this.price);
	}
}
