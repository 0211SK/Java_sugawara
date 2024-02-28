package creatureExecution;

// Scannerクラスをインポートする
import java.util.Scanner;

// パッケージcreatureProsessのCreatureContainerクラスをインポートする
import creatureProsess.CreatureContainer;
// パッケージcreatureProsessのCreaturePクラスをインポートする
import creatureProsess.CreatureP;

public class CreatureE {
	// [概要]メイン処理
	public static void main(String[] args) {
		System.out.println("コンソールに文字を入力してください");
		// Scannerクラスを初期化する
		Scanner scn = new Scanner(System.in);
		// コンソールに入力された値をString型として一行取得し変数animalNameに格納する
		String animalName = scn.nextLine();
		// splitメソッドで区切り文字を,(カンマ)に指定し、配列animalName2に格納する
		String[] animalName2 = animalName.split(",");
		// 拡張for文で配列の要素の数だけ繰り返しを行う様にする
		for (String animalN : animalName2) {
			// splitメソッドで区切り文字を「:」に指定し、配列animalName3に格納する
			String[] animalName3 = animalN.split(":");
			// パッケージcreatureProsessのCreaturePクラスを変数cpに格納し、初期化する
			CreatureP cp = new CreatureP();
			// animalName3[1]に格納された値をdouble型に変更し、変数dbに格納する
			double db = Double.parseDouble(animalName3[1]);
			// animalName3[２]に格納された値をint型に変更し、変数xに格納する
			int x = Integer.parseInt(animalName3[２]);
			// String型の変数animalMapを作成し、初期化する
			String animalMap = null;
			// cpがnullの場合に処理を止める
			if (cp != null) {
				// パッケージcreatureProsessのCreatureContainerクラスを変数animalに入れ、変数cpに返された値を格納する
				CreatureContainer animal = cp.AnimalName(animalName3[0], db, x);
				// パッケージcreatureProsessのCreatureContainerクラスを変数animalSに入れ、変数cpに返された値を格納する
				CreatureContainer animalS = cp.AnimalMap(animalMap, animal.getName());
				// animalがnullの場合に処理を止める
				if (animal != null) {
					// getNameメソッドに格納された値を出力する
					System.out.println("動物名：" + animal.getName());
					// getBodyLengthメソッドに格納された値を出力する
					System.out.println("体長：" + animal.getBodyLength() + "m");
					// getSpeedメソッドに格納された値を出力する
					System.out.println("速度：" + animal.getSpeed() + "km/h");
					// getScientificNameメソッドに格納された値を出力する
					System.out.println("学名：" + animalS.getScientificName() + "\r\n");
				}
			}
		}
		// Scannerクラスを閉じる
		scn.close();
	}

}
