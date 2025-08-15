package curriculum_A;

public class Qes1 {

	public static void main(String[] args) {
		byte x;
	    short d ;
		int aa;	
		long a;
		float b;
		double c;
		char letter;
		String letters;
		boolean is;
		
		x = 10;
		d = 100;
		aa = 1000;
		a = 10000;
		b = 9.5f;
		c = 10.5;
		letter = 'a';
		letters = "ハロー";
		is = true;
		System.out.println(x+d+aa+a);
		System.out.println(x+x);
		System.out.println(letter+letters+is);
		System.out.println(x+d+aa+a+b+c);
		System.out.println(x*d*aa*a);
		System.out.println(c/d);
		System.out.println(x-d);
		
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
		int cc =Integer.parseInt(numStr+10);
		System.out.println("変換後の値:"+cc);
		
		int num = 50;
		String dd = Integer.toString(num);
		System.out.println("得点:"+dd);
		
		int aaa = 10;
		int bbb = 20;
		boolean result =aaa<bbb;
		System.out.println(result);
		
		int xx = 15;
		String q =(xx>10)?"OK":"NG" ;
		System.out.println(q);
		
		String text ="私はJavaが好きです。Javaは楽しい！";
		String oo =text.replace("Java","Python");
		System.out.print(oo);
		
		

	}

}
