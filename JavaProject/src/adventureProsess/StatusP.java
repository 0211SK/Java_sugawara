package adventureProsess;

// Randomクラスを使用し、ステータスの乱数を決める
import java.util.Random;

// [概要]ステータスにランダムな数字を振り分けるクラス
public class StatusP {
	// AdventureSudクラスを変数adに格納して初期化する
	AdventureSud ad = null;
	// 変数adに初期値(入力された名前)を代入するコンストラクタを作成する
	public StatusP() {
		// new演算子を使用してAdventureSudクラスのインスタンスを生成する
		ad = new AdventureSud();
	}

	// [概要]ステータスにランダムな数字を振り分けるメソッド
	public AdventureSud Status(String name) {
		// コンソールに入力した文字をsetNameメソッドに格納する
		ad.setName(name);
		// Randomクラスを初期化する
		Random r = new Random();
		// 変数statusを初期化する
		int status = 0;
		// 1～999までのランダムな数字を変数statusに格納する
		status = r.nextInt(1000);
		// 変数statusに格納した数字をsetAttackメソッドに格納する
		ad.setAttack(status);
		// 1～999までのランダムな数字を変数statusに格納する
		status = r.nextInt(1000);
		// 変数statusに格納した数字をsetDefenseメソッドに格納する
		ad.setDefense(status);
		// 1～999までのランダムな数字を変数statusに格納する
		status = r.nextInt(1000);
		// 変数statusに格納した数字をsetHpメソッドに格納する
		ad.setHp(status);
		// 1～999までのランダムな数字を変数statusに格納する
		status = r.nextInt(1000);
		// 変数statusに格納した数字をsetMpメソッドに格納する
		ad.setMp(status);
		// 1～999までのランダムな数字を変数statusに格納する
		status = r.nextInt(1000);
		// 変数statusに格納した数字をsetSpeedメソッドに格納する
		ad.setSpeed(status);
		// 格納した値を変数adに返す
		return ad;
	}
}
