package selfIntroduction4;

public class Vehicle {
	// [概要]インスタンスフィールドを定義
	// String型の変数ownerを作成する
	private String owner;

	// 名前を格納するメソッド
	public void setOwner(String owner) {
		// ownerの初期値をownerに渡された値にする
		this.owner = owner;
	}

	// 名前を取得するメソッド
	public String getOwner() {
		// 変数ownerに格納された文字を返す
		return this.owner;
	}
}
