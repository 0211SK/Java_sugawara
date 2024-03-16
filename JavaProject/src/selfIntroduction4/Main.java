package selfIntroduction4;

class Main {
	public static void main(String[] args) {
		// Personクラスを呼び出して初期化する処理
		// Personクラスの引数に"鈴木太郎", 20, 1.7, 60を渡す
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		// print()メソッドを呼び出す
		person1.print();

		// Personクラスを呼び出して初期化する処理
		// Personクラスの引数に"山田花子", 22, 1.5, 40を渡す
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		// print()メソッドを呼び出す
		person2.print();

		// printCount()メソッドを呼び出す
		Person.printCount();

		// Carクラスを呼び出して初期化する処理
		Car car = new Car();
		// Bicycleクラスを呼び出して初期化する処理
		Bicycle bicycle = new Bicycle();
		// Carクラスのインスタンスcarにperson1で設定した名前を格納する
		car.setOwner(person1.fullName());
		// Bicycleクラスのインスタンスbicycleにperson2で設定した名前を格納する
		bicycle.setOwner(person2.fullName());
		// Carクラスのインスタンスcarに格納された名前を出力する
		System.out.println(car.getOwner());
		// Bicycleクラスのインスタンスbicycleに格納された名前を出力する
		System.out.println(bicycle.getOwner());
		// Personクラスのbuy(car)メソッドにperson1の値を渡す
		person1.buy(car);
		// Personクラスのbuy(bicycle)メソッドにperson2の値を渡す
		person2.buy(bicycle);
	}
}
