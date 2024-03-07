package prefecturesExecution;

import java.util.Arrays;
import java.util.Collections;
// Scannerのインポート
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Stream APIのインポート
import java.util.stream.Stream;

import prefecturesProsess.PrefacturesP;
import prefecturesProsess.Prefectures;

public class PrefacturesE {

	public static void main(String[] args) {
		while (true) {
			// [概要]昇順・降順の入力
			System.out.println("昇順・降順を入力してください");
			// Scannerクラスを初期化する
			@SuppressWarnings("resource")
			Scanner scn = new Scanner(System.in);
			// コンソールに入力された値をString型として一行取得し変数orderに格納する
			String order = scn.nextLine();
			// [概要]昇順か降順が入力されたら処理する
			if (order.equals("昇順") || order.equals("降順")) {
				// [概要]数字の入力
				System.out.println("0~10を入力してください");
				// コンソールに入力された値をString型として一行取得し変数numberに格納する
				String number = scn.nextLine();
				// 判定するパターンを生成
				Pattern p = Pattern.compile("[0-10]");
				// 入力された数字が半角かどうか判定する
				Matcher m = p.matcher(number);
				// 結果がtrueの場合に処理をする
				if (m.find() == true) {
					// splitメソッドで区切り文字を,(カンマ)に指定し、配列number2に格納する
					String[] number2 = number.split(",");
					// String型配列number2をint型配列number3に変換する
					int[] number3 = Stream.of(number2).mapToInt(Integer::parseInt).toArray();
					// [概要]昇順が入力された時の処理
					if (order.equals("昇順")) {
						// 配列number3に格納されている値を昇順に並べ替える
						Arrays.sort(number3);
						// [概要]配列number3に格納されている値の数だけ処理を繰り返す
						for (int numbers : number3) {
							// prefecturesProsessパッケージのPrefacturesPクラス、getAscendingOrderメソッドにnumbersの値を渡す処理
							String arreyNumber = PrefacturesP.getAscendingOrder(numbers);
							// パッケージprefecturesProsessのPrefacturesPクラスを変数prに格納し、初期化する
							PrefacturesP pr = new PrefacturesP();
							// splitメソッドで区切り文字を「:」に指定し、配列arrに格納する
							String[] arr = arreyNumber.split(":");
							// arr[2]に格納された値をdouble型に変更し、変数dbに格納する
							double db = Double.parseDouble(arr[2]);
							// prefecturesProsessパッケージのPrefacturesPクラス、prefectureInformationメソッドに引数を渡す処理
							Prefectures P = pr.prefectureInformation(arr[0], arr[1], db);
							// Pがnullの場合に処理を止める
							if (P != null) {
								// [概要]結果を出力する
								// getPrefecturesに格納された値の出力
								System.out.println("都道府県名：" + P.getPrefectures());
								// getCapitalに格納された値の出力
								System.out.println("県庁所在地：" + P.getCapital());
								// getAreaに格納された値の出力
								System.out.println("面積：" + P.getArea() + "km2" + "\r\n");
							}
						}
						// [概要]降順が入力された時の処理
					} else if (order.equals("降順")) {
						// 配列number3の型をInteger型配列number4に変更する
						Integer[] number4 = new Integer[number3.length];
						// 配列number3に格納されている値を配列number4に格納する
						for (int i = 0; i < number3.length; i++) {
							number4[i] = Integer.valueOf(number3[i]);
						}
						// 配列number4に格納されている値を降順に並べ替える
						Arrays.sort(number4, Collections.reverseOrder());
						// [概要]配列number4に格納されている値の数だけ処理を繰り返す
						for (int arr2 : number4) {
							// prefecturesProsessパッケージのPrefacturesPクラス、getDescendingOrderメソッドにarr2の値を渡す処理
							String arreyNumber2 = PrefacturesP.getDescendingOrder(arr2);
							// パッケージprefecturesProsessのPrefacturesPクラスを変数prに格納し、初期化する
							PrefacturesP pr = new PrefacturesP();
							// splitメソッドで区切り文字を「:」に指定し、配列arr3に格納する
							String[] arr3 = arreyNumber2.split(":");
							// arr3[2]に格納された値をdouble型に変更し、変数dbに格納する
							double db = Double.parseDouble(arr3[2]);
							// prefecturesProsessパッケージのPrefacturesPクラス、prefectureInformationメソッドに引数を渡す処理
							Prefectures P = pr.prefectureInformation(arr3[0], arr3[1], db);
							// Pがnullの場合に処理を止める
							if (P != null) {
								// [概要]結果を出力する
								// getPrefecturesに格納された値の出力
								System.out.println("都道府県名：" + P.getPrefectures());
								// getCapitalに格納された値の出力
								System.out.println("県庁所在地：" + P.getCapital());
								// getAreaに格納された値の出力
								System.out.println("面積：" + P.getArea() + "km2" + "\r\n");
							}
						}
					}
					// 入力された数字が半角でない場合にエラー文を出す処理
				} else {
					System.out.println("エラー：数字を半角で入力してください");
				}
				// [概要]昇順か降順が入力されなかったら処理を中止し、エラー文を出す処理
			} else {
				System.out.println("エラー：昇順・降順を入力してください");
			}
		}
	}
}