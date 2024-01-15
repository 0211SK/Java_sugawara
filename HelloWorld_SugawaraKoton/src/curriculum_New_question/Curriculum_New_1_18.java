package curriculum_New_question;

import java.util.ArrayList;
//Randomクラス
import java.util.Random;

public class Curriculum_New_1_18 {
	//【概要】引数に値をわたし、コンソールに出力するメソッド
	// helloメソッドに文字列arg1と整数arg2の引数を作成
	public static void hello(String arg1, int arg2) {
		// mainメソッドで渡された値をコンソールに出力する
		System.out.println(arg1 + " " + arg2);
	}

	//【概要】引数に渡された整数同士を足してコンソールに出力するメソッド
	// additionメソッドに整数num1と整数num2の引数を作成
	public static void addition(int num1, int num2) {
		// mainメソッドで渡された値を乗算し、コンソールに出力する
		System.out.println(num1 + num2);
	}

	//【概要】引数に渡された配列の値を一つずつコンソールに出力するメソッド
	// arrayメソッドに整数の配列argの引数を作成
	public static void array(int ary[]) {
		// mainメソッドで渡された値の数だけループする処理
		for (int i = 0; i < ary.length; i++) {
			// コンソールに出力する
			System.out.println(ary[i]);
		}
	}

	//【概要】引数に渡された小数同士を乗算し、コンソールに出力するメソッド
	// additionメソッドをオーバーロードし、引数に小数を渡せるようにする
	public static void addition(double num3, double num4) {
		// mainメソッドで渡された値を乗算し、コンソールに出力する
		System.out.println(num3 + num4);
	}

	//【概要】引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して格納した値を順番にコンソールで出力するメソッド
	// storeメソッドに整数num5の引数を作成し、返り値の型をArrayList<Integer>にする
	public static ArrayList<Integer> store(int num5) {
		// Randomクラスを初期化する
		Random r = new Random();
		// ArrayList配列を初期化する
		ArrayList<Integer> numStore = new ArrayList<Integer>();
		// 引数num5に渡された数字分繰り返す処理
		for (int j = 0; j < num5; j++) {
			// 1～100までのランダムな数字を変数rndmに格納する
			int rndm = r.nextInt(101);
			// rndmに格納された数字が0以外の場合の処理
			if (rndm != 0) {
				// rndmに格納された数字をコンソールに出力する
				System.out.println(rndm);
				// ArrayList配列にrndmに格納された数字を追加する
				numStore.add(rndm);
			}
		}
		// ArrayList配列に格納された数字を返す
		return numStore;
	}

	//【概要】storeメソッドから受け取った配列の要素の平均値をコンソールに出力するメソッド
	// averageメソッドにArrayList配列の引数averageNumを作成する
	public static double average(ArrayList<Integer> averageNum) {
		// 合計値を求めるため、double型を初期化する(小数点以下を表示させるため、0.0にしている)
		double sum = 0.0;
		// forEachメソッドを使用して平均値を求める処理
		for (int k : averageNum)
			// 配列averageNumに格納されている値を一つずつ足す
			sum += k;
		// 合計値をArrayListクラスで用意されている"size"メソッド(ArrayList配列の要素数)で割る
		double aNum = sum / averageNum.size();
		// 結果をコンソールに出力する
		System.out.println(aNum);
		// 計算結果を返す
		return aNum;
	}

	//【概要】averageメソッドから受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力するメソッド
	// halfメソッドにdouble型の引数halfNumを作成する
	public static boolean half(double halfNum) {
		// boolean型を初期化する
		boolean rtn = true;
		// averageメソッドから受け取った値が50以上の場合の処理
		if (halfNum >= 50) {
			// 変数rtnの初期値(true)をコンソールに出力する
			System.out.println(rtn);
			// averageメソッドから受け取った値が50未満の場合の処理
		} else {
			// rtnをfalseに変える
			rtn = false;
			// 結果をコンソールに出力する
			System.out.println(rtn);
		}
		// 結果を返す
		return rtn;
	}

	public static void main(String[] args) {
		// 文字列Hello JavaSEを変数argに格納する
		String arg = "Hello JavaSE";
		// 整数11を変数intArgに格納する
		int intArg = 11;
		// helloメソッドの引数arg1・arg2にそれぞれの値を渡す
		hello(arg, intArg);
		// 整数3を変数add1に格納する
		int add1 = 3;
		// 整数6を変数add2に格納する
		int add2 = 6;
		// additionメソッドの引数num1・num2にそれぞれの値を渡す
		addition(add1, add2);
		// 整数の配列arrayOutputに値を格納する
		int arrayOutput[] = { 10, 3, 4, 6, 76 };
		// arrayメソッドの引数の配列argに値を渡す
		array(arrayOutput);
		// double型の変数add3に1.25を格納する
		double add3 = 1.25;
		// double型の変数add4に5.21を格納する
		double add4 = 5.21;
		// additionメソッドの引数num3・num4にそれぞれの値を渡す
		addition(add3, add4);
		// 整数3を変数storeNumに格納する
		int storeNum = 3;
		// ArrayList配列の変数sにstoreメソッドの引数num5に変数storeNumの値を渡した結果を格納する
		ArrayList<Integer> s = store(storeNum);
		// double型の変数aにaverageメソッドの引数averageNumにArrayList配列の変数sに格納されている値を渡す
		double a = average(s);
		// halfメソッドの引数halfNumにdouble型の変数aを渡す
		half(a);
	}

}
