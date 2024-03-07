
package prefecturesProsess;

public class Prefectures {
	// [概要]コンソールに出力するデータを保持するクラス
	// 変数prefecturesをString型として作成
	private String prefectures;
	// 変数capitalをString型として作成
	private String capital;
	// 変数areaをdouble型として作成
	private double area;

	// 配列の都道府県名を格納するメソッド
	public void setPrefectures(String prefectures_name) {
		// prefecturesの初期値をprefectures_nameに渡された値にする
		this.prefectures = prefectures_name;
	}

	// 配列の都道府県名を取得するメソッド
	public String getPrefectures() {
		// 変数prefecturesに格納された文字を返す
		return this.prefectures;
	}

	// 配列の県庁所在地を格納するメソッド
	public void setCapital(String capital_name) {
		// capitalの初期値をcapital_nameに渡された値にする
		this.capital = capital_name;
	}

	// 配列の県庁所在地を取得するメソッド
	public String getCapital() {
		// 変数capitalに格納された文字を返す
		return this.capital;
	}

	// 配列の面積を格納するメソッド
	public void setArea(double area_km2) {
		// areaの初期値をarea_km2に渡された値にする
		this.area = area_km2;
	}

	// 配列の面積を取得するメソッド
	public double getArea() {
		// 変数areaに格納された文字を返す
		return this.area;
	}
}
