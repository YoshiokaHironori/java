package curriculum_B;

public class Qes2 {
	public static void main(String[] args) {

		int score = 75;
		if (score >= 60) {
			System.out.println("合格です！");
		}

		int ag = 25;
		if (ag >= 20) {
			System.out.println("適正年齢です。");
		} else if (ag >= 30) {
			System.out.println("適正年齢です");
		} else {
			System.out.println("対象外です。");
		}

		int age = 18;

		if (age > 20) {
			System.out.println("成人です。");
		}

		else if (age > 13 && age < 19) {
			System.out.println("ティーンエイジャーです。");
		} else {
			System.out.println("子供です。");
		}

		int x = 30;
		int y = 15;
		int z = 50;
		int big = x;

		if (y > big) {
			big = y;
		}
		if (z > big) {
			big = z;
		}
		{
			System.out.println("一番大きい数値は" + big);
		}
		int num = 0;
		if (num > 0) {
			System.out.println("正の数です。");
		} else if (num == 0) {
			System.out.println("0です。");
		} else if (num <= 0) {
			System.out.println("負の数です。");
		}

		int value = 2;
		if (value % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}

		int scor = 77;
		if (scor >= 90) {
			System.out.println("優");
		} else if (scor >= 70) {
			System.out.println("良");
		} else if (scor >= 50) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}

		String input1 = null;
		

			if (input1 == null || input1.isEmpty()) {
				System.out.println("入力が無効です");
			

			int day = 7;
			switch (day) {
			case 1:
				System.out.println("月曜日");
				break;
			case 2:
				System.out.println("火曜日");
				break;
			case 3:
				System.out.println("水曜日");
				break;
			case 4:
				System.out.println("木曜日");
				break;
			case 5:
				System.out.println("金曜日");
				break;
			case 6:
				System.out.println("土曜日");
				break;
			case 7:
				System.out.println("日曜日");
				break;
			}

			int month = 12;
			switch (month) {
			case 12:

			case 1:

			case 2:
				System.out.println("冬");
				break;
			case 3:

			case 4:

			case 5:
				System.out.println("春");
				break;
			case 6:

			case 7:

			case 8:
				System.out.println("夏");
				break;
			case 9:

			case 10:

			case 11:
				System.out.println("秋");
				break;
			default:
				System.out.println("無効な月です");
				break;
			}
		}
	}
}
