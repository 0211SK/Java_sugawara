package adventureProsess;

public class AdventureSud extends AdventureP {
	// [概要]入力した名前とステータスのデータを保持するクラス
	// 変数hpをint型として作成
	private int hp;
	// 変数mpをint型として作成
	private int mp;
	// 変数attackをint型として作成
	private int attack;
	// 変数speedをint型として作成
	private int speed;
	// 変数defenseをint型として作成
	private int defense;

	// ステータス(HP)を格納するメソッド
	public void setHp(int player_hp) {
		// hpの初期値をplayer_hpに渡された値にする
		this.hp = player_hp;
	}

	// ステータス(HP)を取得するメソッド
	public int getHp() {
		// 変数hpに格納された文字を返す
		return this.hp;
	}

	// ステータス(MP)を格納するメソッド
	public void setMp(int player_mp) {
		// mpの初期値をplayer_mpに渡された値にする
		this.mp = player_mp;
	}

	// ステータス(MP)を取得するメソッド
	public int getMp() {
		// 変数mpに格納された文字を返す
		return this.mp;
	}

	// ステータス(攻撃力)を格納するメソッド
	public void setAttack(int player_attack) {
		// attackの初期値をplayer_attackに渡された値にする
		this.attack = player_attack;
	}

	// ステータス(攻撃力)を取得するメソッド
	public int getAttack() {
		// 変数attackに格納された文字を返す
		return this.attack;
	}

	// ステータス(素早さ)を格納するメソッド
	public void setSpeed(int player_speed) {
		// speedの初期値をplayer_speedに渡された値にする
		this.speed = player_speed;
	}

	// ステータス(素早さ)を取得するメソッド
	public int getSpeed() {
		// 変数speedに格納された文字を返す
		return this.speed;
	}

	// ステータス(防御力)を格納するメソッド
	public void setDefense(int player_defense) {
		// defenseの初期値をplayer_defenseに渡された値にする
		this.defense = player_defense;
	}

	// ステータス(防御力)を取得するメソッド
	public int getDefense() {
		// 変数defenseに格納された文字を返す
		return this.defense;
	}
}
