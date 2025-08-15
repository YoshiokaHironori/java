package curriculum_A;

public class Qes1 {

	public static void main(String[] args) {
		byte byt=0;
	    short sht=0 ;
		int number=0;	
		long lon=0L;
		float flt=0.0f;
		double dbl=0.0;
		char letter='\u0000';
		String letters=null;
		boolean is=false;
		
		byt = 10;
		sht = 100;
		number = 1000;
		lon = 10000;
		flt = 9.5f;
		dbl = 10.5;
		letter = 'a';
		letters = "ハロー";
		is = true;
		System.out.println(byt+sht+number+lon);
		System.out.println(byt+byt);
		System.out.println(letter+letters+is);
		System.out.println(byt+sht+number+lon+flt+dbl);
		System.out.println(byt*sht*number*lon);
		System.out.println(dbl/sht);
		System.out.println(byt-sht);
		
		String name ="山田太郎";
		String e ="こんにちは";
		String f ="さん！";
		System.out.println(e+name+f);
		
		int age = 25;
		System.out.println("年齢:"+age+"歳");
		
		int num1 = 10;
		int num2 = 5;
		int sum =num1+num2;
		System.out.println(sum);
		
		int score = 80;
		score =80+20;
		System.out.println("最終スコア:"+score);
		
		double price = 99.99;
		int bb = (int)price;
		System.out.println("整数価格:"+bb);
		
		String numStr = "123";
		int cc =Integer.parseInt(numStr);
		int num3 =cc+10;
		System.out.println("変換後の値:"+num3);
		
		int num = 50;
		String dd = Integer.toString(num);
		System.out.println("得点:"+dd);
		
		int num5 = 10;
		int num4 = 20;
		boolean result =num5<num4;
		System.out.println(result);
		
		int num6 = 15;
		String q =(num6>10)?"OK":"NG" ;
		System.out.println(q);
		
		String text ="私はJavaが好きです。Javaは楽しい！";
		String oo =text.replace("Java","Python");
		System.out.print(oo);
		
		

	}

}
