package curriculum_B;

// Randomクラスを使用し、じゃんけん時の乱数を決める
import java.util.Random;
// Scannerクラスを使用し、コンソールに文字を入力できるようにする
import java.util.Scanner;
// Matcherクラスで検査したい文字列と正規表現とのマッチングを行えるようにする
import java.util.regex.Matcher;
// Patternクラスを使用し、正規表現のパターンを表せるようにする
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		// [概要]ユーザー名を入力する時の処理
		// 変数userNameを初期化する
		String userName = "";
		// while(true)を使うことでコンソール入力を無限ループさせる
		while (true) {
			// Scannerクラスを初期化する
			Scanner user = new Scanner(System.in);
			// 入力した内容（標準入力）をString型として1行取得
			userName = user.nextLine();
			// checkNameメソッドの戻り値を代入する(trueかfalseが戻り値のためboolean型)
			boolean rtn = checkName(userName);
			// checkNameメソッドでtrueが返ってきたらループを抜ける処理
			if (rtn == true) {
				// whileでのループ処理を抜ける
				break;
			}
			// Scannerクラスを閉じる
			user.close();
		}

		// [概要]じゃんけんのシステムを作成する
		// じゃんけんの回数をカウントするための変数
		int count = 0;
		// while(true)でじゃんけんを無限ループさせる
		while (true) {
			// 一回ループするたびに1ずつカウントを増やす
			count++;
			// Randomクラスを初期化する
			Random PcHand = new Random();
			// コンピュータの手を０・１・２の乱数で決める
			int pc = PcHand.nextInt(3);
			// Randomクラスを初期化する
			Random userHand = new Random();
			// ユーザーの手を０・１・２の乱数で決める
			int us = userHand.nextInt(3);
			// じゃんけんの手を配列で定義する
			String[] janken = { "グー", "チョキ", "パー" };
			// 乱数で決まったユーザーの手を表示する
			System.out.println(userName + "の手は「" + janken[us] + "」");
			// 乱数で決まったコンピュータの手を表示する
			System.out.println("相手の手は「" + janken[pc] + "」");
			// checkResulteメソッドの戻り値を代入する(trueかfalseが戻り値のためboolean型)
			boolean rtn2 = checkResult(us, pc);
			// checkResultメソッドでtrueが返ってきたらループを抜ける処理
			if (rtn2 == true) {
				// whileでのループ処理を抜ける
				break;
			}
		}
		// 勝つまでにかかった回数を表示する
		System.out.println("勝つまでにかかった合計回数は" + count + "回です");

	}

	// [概要]ログイン時の入力チェックシステム
	public static boolean checkName(String userName) {
		// boolean型でフラグ管理をする
		boolean rtn = false;
		// 半角数字を判定するパターンを生成
		// 指定された正規表現(半角英数字)をパターンにコンパイルする
		Pattern p = Pattern.compile("^[0-9a-zA-Z]*$");
		// Patternクラスのmatcherメソッドの引数にパターンとマッチさせる文字列(name)を指定する
		Matcher m = p.matcher(userName);
		// length()メソッドで文字列の文字数（桁数）を取得し、文字数が10以内であればエラー文を出す処理
		if (userName.length() > 10) {
			// エラー文「名前を10文字以内にしてください」を表示する
			System.out.println("名前を10文字以内にしてください\r\n");
			// 文字数が0文字もしくはnullであればエラー文を出す処理
		} else if (userName.length() == 0 || userName == null) {
			// エラー文「名前を入力してください」を表示する
			System.out.println("名前を入力してください\r\n");
			// matcherインスタンスのfindメソッドにfalseが返ってきたらエラー文を出す処理
		} else if (m.find() != true) {
			// エラー文「半角英数字のみで名前を入力してください」を表示する
			System.out.println("半角英数字のみで名前を入力してください\r\n");
		} else {
			// ユーザー名が正常な値であればループを抜ける処理
			// 「ユーザー名「userName」を登録しました」を表示する
			System.out.println("ユーザー名「" + userName + "」を登録しました");
			// フラグをtrueにし、mainメソッドでループを抜ける処理をする
			rtn = true;
		}
		// checkNameに戻り値(フラグ)を返す処理
		return rtn;
	}

	// [概要]じゃんけんの勝敗を決めるシステム
	public static boolean checkResult(int us, int pc) {
		// boolean型でフラグ管理をする
		boolean rtn2 = false;
		// パーに負けた時の処理
		if (us == 0 && pc == 2) {
			// 改行して「俺の勝ち！」と表示する
			System.out.println("\r\n俺の勝ち！");
			// 「なんで負けたか、明日まで考えといてください。」と表示する
			System.out.println("なんで負けたか、明日まで考えといてください。");
			// 「そしたら何かが見えてくるはずです」と表示する
			System.out.println("そしたら何かが見えてくるはずです\r\n");
			// グーに負けた時の処理
		} else if (us == 1 && pc == 0) {
			// 改行して「俺の勝ち！」と表示する
			System.out.println("\r\n俺の勝ち！");
			// 「負けは次につながるチャンスです！」と表示する
			System.out.println("負けは次につながるチャンスです！");
			// 「ネバーギブアップ！」と表示する
			System.out.println("ネバーギブアップ！\r\n");
			// チョキに負けた時の処理
		} else if (us == 2 && pc == 1) {
			// 改行して「俺の勝ち！」と表示する
			System.out.println("\r\n俺の勝ち！");
			// 「たかがじゃんけん、そう思ってないですか？」と表示する
			System.out.println("たかがじゃんけん、そう思ってないですか？");
			// 「それやったら次も、俺が勝ちますよ」と表示する
			System.out.println("それやったら次も、俺が勝ちますよ\r\n");
			// あいこになった時の処理
		} else if ((us == 0 && pc == 0) || (us == 1 && pc == 1) || (us == 2 && pc == 2)) {
			// 改行して「DRAW あいこ もう一回しましょう！」と表示する
			System.out.println("\r\nDRAW あいこ もう一回しましょう！\r\n");
			// じゃんけんに勝った時の処理
		} else {
			// 改行して「やるやん。」と表示する
			System.out.println("\r\nやるやん。");
			// 「次は俺にリベンジさせて」と表示する
			System.out.println("次は俺にリベンジさせて\r\n");
			// フラグをtrueにし、mainメソッドでループを抜ける処理をする
			rtn2 = true;
		}
		// checkResultに戻り値(フラグ)を返す処理
		return rtn2;
	}
}
