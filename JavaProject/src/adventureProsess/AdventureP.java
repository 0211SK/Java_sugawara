package adventureProsess;

public class AdventureP {
	// [概要]入力した名前とステータスのデータを保持するクラス
	// 変数nameをString型として作成
	private String name;

	// 入力された名前を格納するメソッド
	public void setName(String player_name) {
		// nameの初期値をplayer_nameに渡された値にする
		this.name = player_name;
	}

	// 入力された名前を取得するメソッド
	public String getName() {
		// 変数nameに格納された文字を返す
		return this.name;
	}
}