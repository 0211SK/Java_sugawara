package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 様々なデータ型をローカル変数として宣言する
		// バイト型
		byte tiny;
		// 短整数型
		short small;
		// 整数型
		int usually;
		// 長整数型
		long large;
		// 単精度浮動小数点数型
		float ambiguousDecimal;
		// 倍精度浮動小数点数型
		double decimal;
		// 文字型
		char initial;
		// 文字列型
		String multiple;
		// ブーリアン型
		boolean judgement;
		// それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化する
		// tinyにバイト型の初期値「0」を代入する
		tiny = 0;
		// smallに短整数型の初期値「0」を代入する
		small = 0;
		// usuallyに整数型の初期値「0」を代入する
		usually = 0;
		// largeに長整数型の初期値「0」を代入する
		large = 0;
		// ambiguousDecimalに単精度浮動小数点数型の初期値「0.f」を代入する
		ambiguousDecimal = 0.f;
		// decimalに倍精度浮動小数点数型の初期値「0.0」を代入する
		decimal = 0.0;
		// initialに文字型の初期値「\u0000」を代入する
		initial = '\u0000';
		// multipleに文字列型の初期値「null」を代入する
		multiple = "null";
		// judgementにブーリアン型の初期値「false」を代入する
		judgement = false;
		// 初期化をしたそれぞれの変数に値を代入する
		// tinyに「10」を代入する
		tiny = 10;
		// smallに「100」を代入する
		small = 100;
		// usuallyに「1000」を代入する
		usually = 1000;
		// largeに「10000」を代入する
		large = 10000;
		// ambiguousDecimalに「9.5」を代入する
		ambiguousDecimal = 9.5f;
		// decimalに「10.5」を代入する
		decimal = 10.5;
		// initialに「a」を代入する
		initial = 'a';
		// multipleに「ハロー」を代入する
		multiple = "ハロー";
		// judgementに「true」を代入する
		judgement = true;
		// 指示通りにコンソール出力されるようにする
		// tiny,small,usually,largeを加算する
		System.out.println(tiny + small + usually + large);
		// tinyと2を乗算する
		System.out.println(tiny * 2);
		// initial,multiple,judgementを文字列として出力する(" "で空白を入れている)
		System.out.println(initial + " " + multiple + " " + judgement);
		// tiny,small,usually,large,ambiguousDecimal,decimalを加算する
		// そのままだと11130.0と出力されるため、(int)を記載してint型に変更する
		System.out.println((int)(tiny + small + usually + large + ambiguousDecimal + decimal));
		// tiny,small,usually,largeを乗算する
		System.out.println(tiny * small * usually * large);
		// decimal,smallを除算する
		System.out.println(decimal / small);
		// tiny,smallを減算する
		System.out.println(tiny - small);
		// 正しく動作するように修正する
		// Stringは文字列型であり20が文字として認識されるため、int型に変更する
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		// 『』で囲われた人の情報を変数に代入する 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		String name = "山田太郎";
		int age = 18;
		double hight = 170.5;
		double wight = 62.2;
		String like = "寿司";
		// formatの通りコンソールに出力する
		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + age + "歳です」");
		System.out.println("「身長は" + hight + "cmです」");
		System.out.println("「体重は" + wight + "kgです」");
		System.out.println("「好きな食べ物は" + like + "です」");
		// 作成した自己紹介に続いてBMIが出力されるようにする
		// BMIを計算する時は位を合わせる必要があるため、170.5cmを100で割って1.705mにしてから計算する
		double bmi = wight / ((hight /100) * (hight / 100));
		// roundメソッドで小数を四捨五入する(10をかけて割ることで小数第2位を四捨五入している)
		System.out.println("「BMIは" + ((double) Math.round(bmi * 10)) / 10 + "です」");
		// 宣言した変数に再代入する
		name = "鈴木一郎";
		age = 24;
		hight = 168.5;
		wight = 64.2;
		like = "オムライス";
		bmi = wight / ((hight /100) * (hight / 100));
		// 再代入した変数を使用し、指示通りコンソールに出力する
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + hight + "cmです");
		System.out.println("体重は" + wight + "kgです");
		System.out.println("好きな食べ物は" + like + "です");
		System.out.println("BMIは" + ((double) Math.round(bmi * 10)) / 10 + "です");
		// 変数【年齢(age)・身長(hight)・体重(wight)】の数値を和算で自己代入する
		age += age;
		hight += hight;
		wight += wight;
		bmi = wight / ((hight /100) * (hight / 100));
		// 自己代入した変数を使用し、指示通りコンソールに出力する
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + hight + "cmです");
		System.out.println("体重は" + wight + "kgです");
		System.out.println("好きな食べ物は" + like + "です");
		// roundメソッドで小数を四捨五入する(100をかけて割ることで小数第3位を四捨五入している)
		System.out.println("BMIは" + ((double) Math.round(bmi * 100)) / 100 + "です");
		// boolean型の変数を宣言
		boolean isOverTeenage;
		// 条件式(age >= 25)を変数に入れる
		isOverTeenage = (age >= 25);
		// 結果をコンソールに出力する
		System.out.println(isOverTeenage);
		// valueOfメソッドの引数にdoubleの値を指定する
		String changeAge = String.valueOf(age);
		String changeHight = String.valueOf(hight);
		String changeWight = String.valueOf(wight);
		// 文字列型に変換した値を繋げてコンソールに出力する
		System.out.println(changeAge + changeHight + changeWight);
		// parseIntメソッドを使用してString型からint型に変換する
		int changeAge2 = Integer.parseInt(changeAge);
		// String型からint型へは直接変換できないため、まずはparseFloatメソッドを使用してfloat型に変換する。
		float changeHight2 = Float.parseFloat(changeHight);
		// int型に変換した値をコンソールに出力する
		System.out.println(changeAge2);
		// float型に変換した値をint型で出力する
		System.out.println((int)(changeHight2));
		// 条件式を年齢が25もしくは身長が160以上にして変数に入れる
		isOverTeenage = (changeAge2 >= 25 || changeHight2 >= 160);
		// 結果をコンソールに出力する
		System.out.println(isOverTeenage);

	}

}
