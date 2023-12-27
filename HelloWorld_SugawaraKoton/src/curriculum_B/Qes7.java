package curriculum_B;

//Scannerクラスを使用し、コンソールに文字を入力できるようにする
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// Scannerクラスを初期化する
		Scanner scn = new Scanner(System.in);
		// 変数studentを初期化する
		int student = 0;
		// 変数sを初期化する
		int s = 0;
		// [概要]生徒の人数を入力する処理
		while (true) {
			// コンソールに「生徒の人数を入力してください（2以上）:」と表示する
			System.out.print("生徒の人数を入力してください（2以上）:");
			// 入力した内容をInt型として1行取得し、変数studentに格納する
			student = scn.nextInt();
			// 変数studentを変数sに格納する
			s = student;
			// [概要]コンソールに入力した生徒数が2未満の場合にエラーをだし、2以上を入力するまで繰り返す処理
			// 入力した数字が2未満の場合の処理
			if (s < 2) {
				// エラー文「生徒の人数は2以上になるようにしてください」を表示する
				System.out.println("生徒の人数は2以上になるようにしてください");
				// 入力した数字が2以上の場合の処理
			} else {
				// 生徒数をコンソールに入力する処理から抜けだす
				break;
			}
			// Scannerクラスを閉じる
			scn.close();
		}
		// Scannerクラスを初期化する
		Scanner test = new Scanner(System.in);
		// 変数studentTestを初期化する
		double studentTest = 0;
		// 変数average1〜5を初期化する
		double average1 = 0;
		double average2 = 0;
		double average3 = 0;
		double average4 = 0;
		double average5 = 0;
		// 変数sum1〜5を初期化する(後で計算する際に小数点以下が全て0にならない様に0.00にする)
		double sum1 = 0.00;
		double sum2 = 0.00;
		double sum3 = 0.00;
		double sum4 = 0.00;
		// 受け取り用配列
		int[][] line = new int[s][4];
		// [概要]各生徒のテストの点数を科目ごとに入力する処理
		for (int i = 0; i < s; i++) {
			// 変数mesにi + 1の数字を格納する(そのままだと表示する際に0人から始まってしまうため)
			String mes = Integer.toString(i + 1);
			// コンソールに「mes人目の『英語』の点数を入力してください:」と表示する
			System.out.print(mes + "人目の『英語』の点数を入力してください:");
			// 配列line[i][0]に入力した数字を格納する
			line[i][0] = test.nextInt();
			// コンソールに「mes人目の『数学』の点数を入力してください:」と表示する
			System.out.print(mes + "人目の『数学』の点数を入力してください:");
			// 配列line[i][1]に入力した数字を格納する
			line[i][1] = test.nextInt();
			// コンソールに「mes人目の『理科』の点数を入力してください:」と表示する
			System.out.print(mes + "人目の『理科』の点数を入力してください:");
			// 配列line[i][2]に入力した数字を格納する
			line[i][2] = test.nextInt();
			// コンソールに「mes人目の『社会』の点数を入力してください:」と表示する
			System.out.print(mes + "人目の『社会』の点数を入力してください:");
			// 配列line[i][3]に入力した数字を格納する
			line[i][3] = test.nextInt();
			// 改行する
			System.out.print("\r\n");
		}
		// Scannerクラスを閉じる
		test.close();
		// [概要]各生徒の平均点を求める処理
		for (int i = 0; i < s; i++) {
			// 変数mesにi + 1の数字を格納する(そのままだと表示する際に0人から始まってしまうため)
			String mes = Integer.toString(i + 1);
			// 配列lineに格納した点数を足し、4.00で割る(4だと小数点以下が全て00になってしまうため4.00で割る)
			studentTest = (line[i][0] + line[i][1] + line[i][2] + line[i][3]) / 4.00;
			// 結果を表示する(String.format("%.2f", studentTest)の部分で小数点第2位まで表示するようにしている)
			System.out.println(mes + "人目の平均点は" + String.format("%.2f", studentTest) + "点です。");
		}
		// [概要]各教科の合計点を求める処理
		for (int i = 0; i < s; i++) {
			// 変数sum1にline[i][0]を生徒数分足す(for文の中で除算をするとその都度計算されてしまう為乗算のみ)
			sum1 = (sum1 + line[i][0]);
			// 変数sum2にline[i][1]を生徒数分足す
			sum2 = (sum2 + line[i][1]);
			// 変数sum3にline[i][2]を生徒数分足す
			sum3 = (sum3 + line[i][2]);
			// 変数sum4にline[i][3]を生徒数分足す
			sum4 = (sum4 + line[i][3]);
		}
		// [概要]各教科の平均点を求めて結果を表示する処理
		// 英語の合計点からs人(入力した生徒数)を除算する
		average1 = sum1 / s;
		// 結果を表示する
		System.out.println("\r\n" + "英語の平均点は" + String.format("%.2f", average1) + "点です。");
		// 数学の合計点からs人(入力した生徒数)を除算する
		average2 = sum2 / s;
		// 結果を表示する
		System.out.println("数学の平均点は" + String.format("%.2f", average2) + "点です。");
		// 理科の合計点からs人(入力した生徒数)を除算する
		average3 = sum3 / s;
		// 結果を表示する
		System.out.println("理科の平均点は" + String.format("%.2f", average3) + "点です。");
		// 社会の合計点からs人(入力した生徒数)を除算する
		average4 = sum4 / s;
		// 結果を表示する
		System.out.println("社会の平均点は" + String.format("%.2f", average4) + "点です。");
		// [概要]全体の平均点を求めて表示する処理
		// 各教科で求めた平均点を足して4で割る処理
		average5 = (average1 + average2 + average3 + average4) / 4;
		// 結果を表示する
		System.out.println("全体の平均点は" + String.format("%.2f", average5) + "点です。");
	}
}
