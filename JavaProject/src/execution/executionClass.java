package execution;

import process.processClass;

public class executionClass {

	public static void main(String[] args) {
		// processClassクラスを呼び出して変数prに代入する
		processClass pr = new processClass();
		// 変数prがnullの場合に処理を止める様にする
		if (pr != null) {
			// 変数helloを呼び出してコンソールに出力する
			System.out.println(pr.hello);
			// 変数deliciousを呼び出してコンソールに出力する
			System.out.println(pr.delicious);
			// 変数sushiを呼び出してコンソールに出力する
			System.out.println(pr.sushi);
			// 現在の日時をコンソールに出力する
			System.out.println(pr.nowTime);
		}
	}

}
