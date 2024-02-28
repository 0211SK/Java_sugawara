package creatureProsess;

// HashMapクラスをインポートする
import java.util.HashMap;

// [概要]入力された値を処理して格納するクラス
public class CreatureP {
	// CreatureContainerクラスを変数cに格納して初期化する
	CreatureContainer c = null;

	// 変数cに初期値を代入するコンストラクタを作成する
	public CreatureP() {
		// new演算子を使用してCreatureContainerクラスのインスタンスを生成する
		c = new CreatureContainer();
	}

	// [概要]コンソールに入力された値を格納するメソッド
	public CreatureContainer AnimalName(String name, double body, int speed) {
		// 引数nameに格納された値をsetNameメソッドに格納する
		c.setName(name);
		// 引数bodyに格納された値をsetBodyLengthメソッドに格納する
		c.setBodyLength(body);
		// 引数speedに格納された値をsetSpeedメソッドに格納する
		c.setSpeed(speed);
		// 格納した値を変数cに返す
		return c;
	}

	// [概要]入力された動物の学名の値を格納するメソッド
	public CreatureContainer AnimalMap(String scientific, String g) {
		// HashMapクラスのインスタンスを作成する
		HashMap<String, String> map = new HashMap<>();
		// マップに新しいキーと値のペアを追加する
		// ライオンが格納されたらパンテラ レオを返す
		map.put("ライオン", "パンテラ レオ");
		// ゾウが格納されたらロキソドンタ・サイクロティスを返す
		map.put("ゾウ", "ロキソドンタ・サイクロティス");
		// パンダが格納されたらアイルロポダ・メラノレウカを返す
		map.put("パンダ", "アイルロポダ・メラノレウカ");
		// チンパンジーが格納されたらパン・トゥログロディテスを返す
		map.put("チンパンジー", "パン・トゥログロディテス");
		// シマウマが格納されたらチャップマンシマウマを返す
		map.put("シマウマ", "チャップマンシマウマ");
		// インコが格納されたら不明を返す
		map.put("インコ", "不明");
		// 引数gに格納された値とペアになっている値を取得し、引数scientificに格納する
		scientific = map.get(g);
		// 引数scientificに格納された値をsetScientificNameメソッドに格納する
		c.setScientificName(scientific);
		// 格納した値を変数cに返す
		return c;
	}
}
