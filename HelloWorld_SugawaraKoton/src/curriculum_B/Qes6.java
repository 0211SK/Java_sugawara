package curriculum_B;

//Randomクラスを使用し、乱数を決める
import java.util.Random;
//Scannerクラスを使用し、コンソールに文字を入力できるようにする
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// テレビかディスプレイが入力されたときに使用する変数
		int Item = -1;
		// while(true)を使うことでコンソール入力を無限ループさせる
		while (true) {
			// [概要]コンソールに入力された文字を配列に格納する処理
			// Scannerクラスを初期化する
			Scanner goods = new Scanner(System.in);
			//nextLine()メソッドで一行取得する
			// 取得した一行をsplit("、")で「、」区切りにし、配列Goodsに格納する
			String[] goodsAry = goods.nextLine().split("、");
			// [概要]配列Goodsに格納された商品の残り台数を表示する処理
			for (String strGoods : goodsAry) {
				// Randomクラスを初期化する
				Random r = new Random();
				// [概要]入力された文字によって出る乱数を変更する処理
				switch (strGoods) {
				// パソコン,冷蔵庫,扇風機,洗濯機,加湿器と入力されたときの処理
				case "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器":
					// 商品の残り台数を0〜11までのランダムな値にする
					int Item2 = r.nextInt(12);
					// 結果を出力する
					System.out.println("\r\n" + strGoods + "の残り台数は" + Item2 + "台です");
					break;
				// テレビと入力されたときの処理
				case "テレビ":
					// 変数Itemに−1以外の数字が格納されていた場合、11からディスプレイの残り台数を引いた数字を出力する
					// 変数Itemが−1だった場合、乱数を出力する
					Item = (Item == -1) ? r.nextInt(12) : 11 - Item;
					// 結果を出力する
					System.out.println("\r\n" + strGoods + "の残り台数は" + Item + "台です");
					break;
				// ディスプレイと入力されたときの処理
				case "ディスプレイ":
					// 変数Itemに−1以外の数字が格納されていた場合、11からテレビの残り台数を引いた数字を出力する
					// 変数Itemが−1だった場合、乱数を出力する
					Item = (Item == -1) ? r.nextInt(12) : 11 - Item;
					// 結果を出力する
					System.out.println("\r\n" + strGoods + "の残り台数は" + Item + "台です");
					break;
				// 式の値がcase句に指定されたラベル以外の場合の処理
				default:
					// 結果を出力する
					System.out.println("\r\n『" + strGoods + "』は指定の商品ではありません");
				}
			}
		}
	}

}
