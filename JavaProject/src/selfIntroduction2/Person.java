package selfIntroduction2;

class Person {
	// [概要]インスタンスフィールドを定義
	// String型の変数nameを作成する
	public String name;
	// int型の変数ageを作成する
	public int age;
	// double型の変数heightを作成する
	public double height;
	// double型の変数weightを作成する
	public double weight;
	// int型の変数countを作成し、初期化する
	public static int count = 0;

	// [概要]コンストラクタを定義しインスタンスフィールドに値をセットする
	Person(String name, int age, double height, double weight) {
		// String型の変数nameの初期値を引数nameの値にする
		this.name = name;
		// int型の変数ageの初期値を引数ageの値にする
		this.age = age;
		// double型の変数heightの初期値を引数heightの値にする
		this.height = height;
		// double型の変数weightの初期値を引数weightの値にする
		this.weight = weight;
		// 変数countに1を足す処理(Personが呼び出されるごとに足される)
		Person.count = count + 1;
	}

	// [概要]BMIを計算する処理
	public double bmi() {
		// BMIの計算をし、結果を返す処理
		return this.weight / this.height / this.height;
	}

	// [概要]格納された値を出力する処理
	public void print() {
		// nameに格納された名前を出力する
		System.out.println("名前は" + this.name + "です");
		// ageに格納された年齢を出力する
		System.out.println("年は" + this.age + "です");
	}

	// [概要]合計人数を出力する処理
	public static void printCount() {
		// 合計人数を出力する
		System.out.println("合計" + count + "人です");
	}
}