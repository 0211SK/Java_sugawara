package basicClass;

public class Dog {
	// フィールドに動物の名前の変数animalNamuを定義する
	String animalNamu;
	// フィールドに動物の数の変数animalsを定義する
	int animals;

	// 変数animalNamuに「犬」を代入するコンストラクタを作成する
	Dog() {
		// 変数animalNamuの初期値を犬にする
		this.animalNamu = "犬";
	}

	// 変数animalsに引数を代入するコンストラクタを作成する
	Dog(int animals2) {
		// 変数animalsの初期値を引数animals2にする
		this.animals = animals2;
	}
}