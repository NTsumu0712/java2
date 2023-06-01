import java.util.*;
public class nameAndAge{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		System.out.print("年齢＞＞");
		//nextIntの次にnextLineをする際は１度nextLineで空読みをしておく
		int age = sc.nextInt();sc.nextLine();
		System.out.print("名前＞＞");
		String name= sc.nextLine();
		System.out.printf("ようこそ%s(%d)!",name,age);
	
	}
}
