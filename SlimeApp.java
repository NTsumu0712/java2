/*SlimeAppとSlimeクラスを作成する。
	Slime
	staticフィールド
	このクラスから何匹のスライムが生成されたかをカウントする変数(count)
	インスタンスフィールド
	名前
	hp
	コンストラクタ
	引数２個
	引数１個(hp)この場合は名前はスライムとする
	インスタンスメソッド
	appear
	例)スラキチ(25)があらわれた！
	staticメソッド
	public static int getCount(){
//staticフィールドの値を リターンする
	}
	[実行例]
	スラキチ(25)があらわれた！
	スライム(20)があらわれた！
	2体のスライムが襲ってきた*/

import java.util.*;
public class SlimeApp{
	public static void main(String[] args){
		Slime s1 = new Slime("すらボム",25);
		s1.appear();
		Slime s2 = new Slime(25);
		s2.appear();
		System.out.printf("%d体のスライムがおそってきた！%n",Slime.getCount());
	}
}
class Slime{
	String name;
	int hp;
	static int count =0;

	public Slime(String name,int hp){
		this.name = name;
		this.hp = hp;
		count++;
	}
	public Slime(int hp){
		this("スライム",hp);
	}
	public void appear(){
		System.out.printf("%s(%d)があらわれた！%n",this.name,this.hp);
	}
	public static int getCount(){
		//staticフィールドの値を リターンする
		return count;
	}
}
