package creatureProsess;

// [概要]コンソールに出力するデータを保持するクラス
public class CreatureContainer {
	// 変数nameをString型として作成
	private String name;
	// 変数bodyLengthをdouble型として作成
	private double bodyLength;
	// 変数speedをint型として作成
	private int speed;
	// 変数scientificNameをString型として作成
	private String scientificName;

	// 入力された動物の名前を格納するメソッド
	public void setName(String creature_name) {
		// nameの初期値をcreature_nameに渡された値にする
		this.name = creature_name;
	}

	// 入力された動物の名前を取得するメソッド
	public String getName() {
		// 変数nameに格納された文字を返す
		return this.name;
	}

	// 入力された動物の体長を格納するメソッド
	public void setBodyLength(double creature_bodyLength) {
		// bodyLengthの初期値をcreature_bodyLengthに渡された値にする
		this.bodyLength = creature_bodyLength;
	}

	// 入力された動物の体長を取得するメソッド
	public double getBodyLength() {
		// 変数bodyLengthに格納された文字を返す
		return this.bodyLength;
	}

	// 入力された動物の速度を格納するメソッド
	public void setSpeed(int creature_speed) {
		// speedの初期値をcreature_speedに渡された値にする
		this.speed = creature_speed;
	}

	// 入力された動物の速度を取得するメソッド
	public int getSpeed() {
		// 変数speedに格納された文字を返す
		return this.speed;
	}

	// 動物の学名を格納するメソッド
	public void setScientificName(String creature_scientificName) {
		// scientificNameの初期値をcreature_scientificNameに渡された値にする
		this.scientificName = creature_scientificName;
	}

	// 動物の学名を取得するメソッド
	public String getScientificName() {
		// 変数scientificNameに格納された文字を返す
		return this.scientificName;
	}
}
