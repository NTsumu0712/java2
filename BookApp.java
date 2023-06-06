/*一般クラスBookとアプリケーションクラス
	BookAppを作成し(ファイルはBookApp.java1枚）

	Book クラス
//フィールド
本の名前
本の価格
出版社
//コンストラクタ
任意
//インスタンスメソッド
自分自身の情報を以下のフォーマットで出力
すっきりJava入門:インプレス(2600円)

アプリケーションクラスにてインタンスを２つ作成せよ。(好きな本でよい)
配列は使わない。

実行例
すっきりJava入門:インプレス(2600円)
すっきりMySQL:インプレス(2200円)*/

import java.util.*;
public class BookApp{
	public static void main(String[] args){
		/*Scanner sc = new Scanner(System.in);
		System.print("何冊？>>");
		int n =sc.nextInt();
		Book[] data =new Book[n];
		for(int i=0;i<n;i++){
			System.out.print("本の題名>>");
			String bookName =sc.next();
			System.out.print("出版社>>");
			String publisher=sc.next();
			System.out.print("値段>>");
			int bookPrice =sc.nextInt();
			Book b = new Book(bookName,publisher,bookPrice);
			data[i]= b;
		}
		for(Book b:data){
			Book.showInfo();
		}
	}*/

	/* Book クラス
		 5 //フィールド
		 6 本の名前
		 7 本の価格
		 8 出版社
		 9 //コンストラクタ
		 10 任意
		 11 //インスタンスメソッド
		 12 自分自身の情報を以下のフォーマットで出力
		 13 すっきりJava入門:インプレス(2600円)*/
	class Book{
		String bookName;
		int bookPrice;
		String publisher;
		public Book(String bookName,int bookPrice,String publisher){
			this.bookName = bookName;
			this.bookPrice= bookPrice;
			this.publisher= publissher;
		}
		public void showInfo(){
			System.out.printf("%s%s(%d円)%n",this.bookName,this.publisher,this.bookprice);
		}
	}
}
