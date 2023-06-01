public class SplitLesson {

	public static void main(String[] args) {
  //基本的な使い方
	/*仕切り壁になる部分を選択する感じ！*/
		String str="りんご,みかん,ばなな";
		String[] data=str.split(",");
		System.out.println(data.length);//3
		System.out.println(data[0]);//りんご
		System.out.println(data[1]);//みかん
		System.out.println(data[2]);//ばなな

		//数字(文字列)をint型配列にする
		/*基本文字列を区切るのに使われる*/
		str ="1,2,3,4,5,";
		data =str.split(,);
		System.out.println(Arrays.toString(data));
		int[] nums =new int[data.length];
		for(int i=0;i<nums.length;i++){
      nums[i]=Integer.paeseInt(data[i]);
		}
		System.out.println(Arrays.toString(nums));

  //「と」で分割
		str="さるといぬときじ";
		data=str.split("と");
		System.out.println(data.length);//3
		System.out.println(data[0]);//さる
		System.out.println(data[1]);//いぬ
		System.out.println(data[2]);//きじ

  //「and]で分割
		str="さるandいぬandきじ";
		data=str.split("and");
		System.out.println(data.length);//3
		System.out.println(data[0]);//さる
		System.out.println(data[1]);//いぬ
		System.out.println(data[2]);//きじ

  //途中に空データが入った場合
	/*壁と壁の間には空間があると認識され
	 * [空データが入っている]という扱いになる*/
		str="りんご,みかん,,ばなな";	
		data=str.split(",");
		System.out.println(data.length);//4
		System.out.println(data[0]);//りんご
		System.out.println(data[1]);//みかｎ
		System.out.println(data[2]);//""
		System.out.println(data[3]);//ばなな

  //第二引数を使うことで最大分割数を指定
	/*後ろに付ける引数って数字で、分割数を決めるよ*/
		str="りんご,みかん,ばなな";
		data=str.split(",",2);
		System.out.println(data.length);//2
		System.out.println(data[0]);//りんご
		System.out.println(data[1]);//みかん,ばなな

  //末尾に空データが並んだ場合は注意
	//なぜか末尾側の空データは認識されないらしい。
		str="りんご,みかん,ばなな,,,,";
		data=str.split(",");
		System.out.println(data.length);//3
		System.out.println(data[0]);//りんご
		System.out.println(data[1]);//みかん
		System.out.println(data[2]);//ばなな

  //末尾の空データも配列として取得したい場合は
  //第二引数に負の値をいれる
		str="りんご,みかん,ばなな,,,,";
		data=str.split(",",-1);
		System.out.println(data.length);//7
		System.out.println(data[0]);//りんご
		System.out.println(data[1]);//みかん
		System.out.println(data[2]);//ばなな
		System.out.println(data[3]);//""
		System.out.println(data[4]);//""
		System.out.println(data[5]);//""
		System.out.println(data[6]);//""
	}
}
