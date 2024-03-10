package selfIntroduction;

class Person {
	// [概要]インスタンスフィールドを定義
	// String型の変数nameを作成する
	String name;
	// int型の変数ageを作成する
	int age;
	// double型の変数heightを作成する
	double height;
	// double型の変数weightを作成する
	double weight;
	// int型の変数numを作成し、初期化する
	int num = 0;

	// [概要]コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) {
		// String型の変数nameの初期値を引数nameの値にする
		this.name = name;
		// int型の変数ageの初期値を引数ageの値にする
		this.age = age;
		// double型の変数heightの初期値を引数heightの値にする
		this.height = height;
		// double型の変数weightの初期値を引数weightの値にする
		this.weight = weight;
		// 格納された値を返す
		return;
	}

	// [概要]BMIを計算する処理
	public double bmi() {
		// double型の変数bmiを作成し、BMIの計算をする
		double bmi = weight / (height * height);
		// 格納された値を返す
		return bmi;
	}

	// [概要]格納された値を出力する処理
	public void print() {
		// nameに格納された名前を出力する
		System.out.println("\r\n" + "名前は" + this.name + "です");
		// ageに格納された年齢を出力する
		System.out.println("年は" + this.age + "才です");
		// bmiに格納されたBMIを出力する
		System.out.println("BMIは" + Math.floor(this.bmi()) + "です");
		// print()が呼び出される度に1足していく
		num++;
		// 合計人数を出力する
		System.out.println("\r\n" + "合計" + num + "人です");
		// 格納された値を返す
		return;
	}
}
