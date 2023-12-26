package curriculum_B;

public class Qes4 {
	// [概要]掛け算(九九)をする処理
	public static void main(String[] args) {
		// 掛け算の１〜９の段をループする
		for (int i = 1; i <= 9; i++) {
			// 各段で１〜９までかける処理
			for (int j = 1; j <= 9; j++) {
				// 変数kakezanにiとjの掛け算を入れる
				int kakezan = i * j;
				// jが９の時、最後の||を表示しないようにする
				if (j == 9) {
					// System.out.print()で改行しないようにする
					// String.format("%02d", 値)で数値が1桁の時に左側に0埋めされるようにする
					System.out.print(String.format("%02d", i) + " * " + String.format("%02d", j) + " = "
							+ String.format("%02d", kakezan) + " ");
				} else {
					// System.out.print()で改行しないようにする
					// String.format("%02d", 値)で数値が1桁の時に左側に0埋めされるようにする
					System.out.print(String.format("%02d", i) + " * " + String.format("%02d", j) + " = "
							+ String.format("%02d", kakezan) + " || ");
				}
			}
			// 各段の終わりで改行する
			System.out.println();
		}
	}

}
