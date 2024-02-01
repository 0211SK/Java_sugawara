package lion;

class processClass {
	// 変数nameをString型として作成
	private String name;
	// 変数bodyLengthをdouble型として作成
	private double bodyLength;
	// 変数speedをint型として作成
	private int speed;

	// 動物の名前(ライオン)を格納するメソッド
	public void setName(String animal_name) {
		// nameの初期値をanimal_nameに渡された値にする
		this.name = animal_name;
	}

	// 動物の名前(ライオン)を取得するメソッド
	public String getName() {
		// 変数nameに格納された文字を返す
		return this.name;
	}

	// ライオンの体長を格納するメソッド
	public void setBodyLength(double animal_bodyLength) {
		// 変数bodyLengthの初期値をanimal_bodyLengthに渡された値にする
		this.bodyLength = animal_bodyLength;
	}

	// ライオンの体長を取得するメソッド
	public double getBodyLength() {
		// 変数bodyLengthに格納された文字を返す
		return this.bodyLength;
	}

	// ライオンの速度を格納するメソッド
	public void setSpeed(int animal_speed) {
		// 変数speedの初期値をanimal_speedに渡された値にする
		this.speed = animal_speed;
	}

	// ライオンの速度を取得するメソッド
	public int getSpeed() {
		// 変数speedに格納された文字を返す
		return this.speed;
	}
}

public class lionClass {

	public static void main(String[] args) {
		// 変数lionFeaturesを初期化する
		processClass lionFeatures = new processClass();
		// 動物の名前(ライオン)を格納
		lionFeatures.setName("ライオン");
		// ライオンの体長(2.1)を格納
		lionFeatures.setBodyLength(2.1);
		// ライオンの速度(80)を格納
		lionFeatures.setSpeed(80);
		// 変数lionFeaturesがnullの場合に何もしない処理
		if (lionFeatures != null) {
			// 動物の名前(ライオン)を取得し、コンソールに出力する
			System.out.println("動物名：" + lionFeatures.getName());
			// ライオンの体長(2.1)を取得し、コンソールに出力する
			System.out.println("体長：" + lionFeatures.getBodyLength() + "m");
			// ライオンの速度(80)を取得し、コンソールに出力する
			System.out.println("速度：" + lionFeatures.getSpeed() + "km/h");
		}
	}

}
