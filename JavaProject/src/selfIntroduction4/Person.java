package selfIntroduction4;

class Person {
	// [概要]インスタンスフィールドを定義
	// int型の変数countを作成する
	public static int count = 0;
	// String型の変数firstNameを作成する
	public String firstName;
	// int型の変数ageを作成する
	public int age;
	// double型の変数heightとweightを作成する
	public double height, weight;
	// String型の変数lastNameを作成する
	public String lastName;

	// [概要]コンストラクタを定義しインスタンスフィールドに値をセットする
	Person(String firstName, int age, double height, double weight) {
		// String型の変数firstNameの初期値を引数firstNameの値にする
		this.firstName = firstName;
		// int型の変数ageの初期値を引数ageの値にする
		this.age = age;
		// double型の変数heightの初期値を引数heightの値にする
		this.height = height;
		// double型の変数weightの初期値を引数weightの値にする
		this.weight = weight;
	}

	// [概要]コンストラクタをオーバーロードする
	Person(String firstName, String lastName, int age, double height, double weight) {
		// String型の変数firstNameの初期値を引数firstNameの値にする
		this.firstName = firstName;
		// String型の変数lastNameの初期値を引数lastNameの値にする
		this.lastName = lastName;
		// int型の変数ageの初期値を引数ageの値にする
		this.age = age;
		// double型の変数heightの初期値を引数heightの値にする
		this.height = height;
		// double型の変数weightの初期値を引数weightの値にする
		this.weight = weight;
		// 変数countに1を足す処理(Personが呼び出されるごとに足される)
		Person.count++;
	}

	// [概要]入力された苗字と名前を一緒にする処理
	public String fullName() {
		// 値を返す
		return this.firstName + this.lastName;
	}

	// [概要]格納された値を出力する処理
	public void print() {
		// fullNameに格納された名前を出力する
		System.out.println("名前は" + this.fullName() + "です");
		// ageに格納された年齢を出力する
		System.out.println("年は" + this.age + "です");
	}

	// [概要]BMIを計算する処理
	public double bmi() {
		// BMIの計算をし、結果を返す処理
		return this.weight / this.height / this.height;
	}

	// [概要]合計人数を出力する処理
	public static void printCount() {
		// 合計人数を出力する
		System.out.println("合計" + Person.count + "人です");
	}

	// 引数carに渡された値をownerに格納し、出力するメソッド
	public void buy(Car car) {
		// 引数carにfullName()の値を渡しownerに格納する
		car.setOwner(this.fullName());
		// 出力する
		System.out.println(car.getOwner() + "が購入しました");
	}

	// 引数bicyclerに渡された値をownerに格納し、出力するメソッド
	public void buy(Bicycle bicycler) {
		// 引数bicyclerにfullName()の値を渡しownerに格納する
		bicycler.setOwner(this.fullName());
		// 出力する
		System.out.println(bicycler.getOwner() + "が購入しました");
	}
}