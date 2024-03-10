package selfIntroduction;

class Main {
	public static void main(String[] args) {
		// Personクラスを呼び出して初期化する処理
		// Personクラスの引数に"鈴木太郎", 20, 1.7, 60を渡す
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		// 変数person1のnameに格納された値を出力する
		System.out.println(person1.name);
		// 変数person1のageに格納された値を出力する
		System.out.println(person1.age);
		// 変数person1のheightに格納された値を出力する
		System.out.println(person1.height);
		// printメソッドを呼び出す
		person1.print();
	}
}
