package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// 掛け算の1〜9の段をループする
		for (int i = 1; i <= 9; i++) {
			// 各段で1〜20までかける処理
			for (int j = 1; j <= 20; j++) {
				// 変数kakezanにiとjの掛け算を入れる
				int kakezan = i * j;
				// jが20の時、最後の||を表示しないようにする
				if (j == 20) {
					// String.format("%03d", 値)で数値が2桁以下の時に左側に0埋めされるようにする
					System.out.print(String.format("%03d", j) + " * " + String.format("%03d", i) + " = "
							+ String.format("%03d", kakezan) + " ");
				} else {
					// String.format("%03d", 値)で数値が2桁以下の時に左側に0埋めされるようにする
					System.out.print(String.format("%03d", j) + " * " + String.format("%03d", i) + " = "
							+ String.format("%03d", kakezan) + " || ");
				}
			}
			// 改行する
			System.out.println();
		}
	}

}