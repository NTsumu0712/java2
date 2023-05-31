import java.util.*;
public class FishingApp{
	public static void main(String[] args){

		int[] LEN_ARR= {20,10,10,5,5,1};
		int[] DAMAGE_ARR= {-1,0,0,0,1,1,1,1,1,1,};
		String[] DAMAGE_MESSAGES = {"Great!!","Good","Bad"};
		int length=100;
		int damage=2;

		//内容が２０個くらいまでなら配列の方が早い
		//３０個超えると面倒なので配列は使わないかも

		//ランダムインスタンス生成
		Random rand=new Random();
		//スキャナーインスタンス生成
		Scanner sc = new Scanner(System.in);

		//初期表示
		System.out.println("釣りゲーム");
		System.out.println("Press enter Key...");

		//残りの長さが0より大きくかつダメージが5より大きい間
		//継続するループ

		while(length > 0&& damage < 5){
			//エンターキーで進む処理
			sc.nextLine();
			//巻き取り長さの抽選
			int len = LEN_ARR[rand.nextInt(LEN_ARR.length)];
			//ダメージの抽選
			int dmg =DAMAGE_ARR[rand.nextInt(DAMAGE_ARR.length)];

			System.out.println(len+"m!");
			System.out.println(DAMAGE_MESSAGES[dmg+1]);
			length = Math.max(length-len,0);
			damage =Math.max(damage+dmg,0);

			System.out.println("残り"+length+"m");
			System.out.println("ダメージ:"+damage+"/5");
		}
		System.out.printf("%s%n",length == 0?"釣り上げることに成功した！":"糸が切れてしまった。");

	}
}
