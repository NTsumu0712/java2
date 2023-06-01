public class HeroApp{
  public static void main(String[] args){
		//インスタンスの生成
		Hero h1 = new Hero();
    h1.name ="ゼシカ";
		h1.hp= 100;

		Hero h2 =new Hero();
		h2.name="ヤンガス";
		h2.hp =200;

    Matango ma =new Matango();
		ma.hp=20;
		ma.suffix='A';

    Matango mb =new Matango();
		ma.hp=20;
		ma.suffix='B';

    Matango [] ms =new Matango[3];
		ms[0]=ma;
		ms[1]=mb;
		ms[2]=new Matango();
    ms[2].hp=30;
	  ms[2].suffix='C';
    
		ma.run();
    mb.run();

		for(Matango m : ms){
			m.run();
		}
		h1.attack(ms[0]);

		Sword s = new Sword();
		s.name="炎の剣";
		s.damage=10;


		Cleric cleric =new Cleric();
		cleric.name="ククール";

		cleric.mp -=20;
    cleric.selfAid();

		cleric.pray(3);

    cleric.selfAid();

		h1.slip();
		h2.slip();
		h1.sit(3);
		h1.sleep();
		h1.run();
		h2.run();

	}
}
