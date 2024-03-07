package prefecturesProsess;

public class PrefacturesP {
	// Prefecturesクラスを変数pに格納して初期化する
	Prefectures p = null;

	// 変数pに初期値を代入するコンストラクタを作成する
	public PrefacturesP() {
		// new演算子を使用してPrefecturesクラスのインスタンスを生成する
		p = new Prefectures();
	}

	// [概要]都道府県の情報を配列に格納するメソッド
	public static String[] getArray() {
		// 県の情報を配列として作成する
		String[] prefecture = { "北海道:札幌市:83424", "青森県:青森市:9646", "岩手県:盛岡市:15275",
				"宮城県:仙台市:7282", "秋田県:秋田市:11638", "山形県:山形市:9323", "福島県:福島市:13784",
				"茨城県:水戸市:6097", "栃木県:宇都宮市:6408", "群馬県:前橋市:6362", "埼玉県:さいたま市:3798" };
		// 作成した配列を返す
		return prefecture;
	}

	// [概要]配列prefectureを昇順に並べるメソッド
	public static String getAscendingOrder(int arreyNumber) {
		// getArray()に格納されている配列を呼び出す
		String[] prefecture2 = getArray();
		// prefecture2[arreyNumber]を結果として返す
		return prefecture2[arreyNumber];
	}

	// [概要]コンソールに入力された値を格納するメソッド
	public Prefectures prefectureInformation(String prefectures2, String capital2, double area2) {
		// 引数setPrefecturesに格納された値をprefectures2メソッドに格納する
		p.setPrefectures(prefectures2);
		// 引数capital2に格納された値をsetCapitalメソッドに格納する
		p.setCapital(capital2);
		// 引数area2に格納された値をsetAreaメソッドに格納する
		p.setArea(area2);
		// 格納した値を変数pに返す
		return p;
	}

	// [概要]配列prefectureを降順に並べるメソッド
	public static String getDescendingOrder(int arreyNumber2) {
		// getArray()に格納されている配列を呼び出す
		String[] prefecture2 = getArray();
		// 配列prefectureを降順に並べる処理
		for (int i = prefecture2.length - 1; i >= 0; i--) {
		}
		// prefecture2[arreyNumber2]を結果として返す
		return prefecture2[arreyNumber2];
	}
}
