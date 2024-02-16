package adventureExecution;

// Scannerクラスをインポートする
import java.util.Scanner;

// パッケージadventureProsessのAdventureSudクラスをインポートする
import adventureProsess.AdventureSud;
// パッケージadventureProsessのStatusPクラスをインポートする
import adventureProsess.StatusP;

public class AdventureE {

	public static void main(String[] args) {
		// [概要]名前を入力する処理
		// Scannerクラスを初期化する
		try (Scanner scn = new Scanner(System.in)) {
			// 変数playerをString型として作成
			String player = null;
			// 変数pをString型として作成
			String p = null;
			while (true) {
				// 入力した内容をString型として1行取得し、変数playerに格納する
				player = scn.next();
				// 変数playerを変数pに格納する
				p = player;
				// パッケージadventureProsessのStatusPクラスを変数stに格納し、初期化する
				StatusP st = new StatusP();
				// パッケージadventureProsessのAdventureSudクラスを変数statusに入れ、変数stに返された値を格納する
				AdventureSud status = st.Status(p);
				// [概要]結果をコンソールに出力する処理
				// 変数statusがnullの場合に処理を止める様にする
				if (status != null) {
					// setNameメソッドに格納された値を出力する
					System.out.println("こんにちは 「 " + status.getName() + " 」 さん");
					// コンソールに「ステータス」を出力する
					System.out.println("ステータス");
					// setHpメソッドに格納された値を出力する
					System.out.println("HP：" + status.getHp());
					// setMpメソッドに格納された値を出力する
					System.out.println("MP：" + status.getMp());
					// setAttackメソッドに格納された値を出力する
					System.out.println("攻撃力：" + status.getAttack());
					// setSpeedメソッドに格納された値を出力する
					System.out.println("素早さ：" + status.getSpeed());
					// setDefenseメソッドに格納された値を出力する
					System.out.println("防御力：" + status.getDefense());
					// コンソールに「さあ冒険に出かけよう！」を1行開けて出力する
					System.out.println("\r\n" + "さあ冒険に出かけよう！");
				}
			}
		}
	}

}
