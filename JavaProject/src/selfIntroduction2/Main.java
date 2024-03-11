package selfIntroduction2;

class Main {
	public static void main(String[] argos) {
		// Personクラスを呼び出して初期化する処理
		// Personクラスの引数に"鈴木太郎", 20, 1.7, 60を渡す
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		// print()メソッドを呼び出す
		person1.print();
		// 合計人数を出力する
		System.out.println("合計" + Person.count + "人です" + "\r\n");

		// Personクラスを呼び出して初期化する処理
		// Personクラスの引数に"山田花子", 22, 1.5, 40を渡す
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		// print()メソッドを呼び出す
		person2.print();
		// 合計人数を出力する
		System.out.println("合計" + Person.count + "人です" + "\r\n");
		// printCount()メソッドを呼び出す
		Person.printCount();
	}
}