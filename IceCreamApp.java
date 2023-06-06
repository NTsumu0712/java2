import java.util.*;
public class IceCreamApp{
	public static void main(String[] args){
		IceCream i1= new IceCream("ピノ",160);
		i1.showInfo();
		System.out.println();
		IceCream i2= new IceCream("スーパーカップ");
		i2.showInfo();
	}
}

class IceCream{
	String name;
	int price;
	public IceCream(String name,int price){
		this.name  = name;
		this.price = price;
	}
	public IceCream(String name){
		this.name = name;
		this.price = 120;
	}
	public void showInfo(){
		System.out.printf("%s(%d円)",this.name,this.price);
	}
}

