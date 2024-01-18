package basicClass;

// SimpleDateFormatクラスを使用
import java.text.SimpleDateFormat;
//Calendarクラスを使用
import java.util.Calendar;

public class Animal {

	public static void main(String[] args) {
		// Dogクラスを呼び出して変数dogClassに代入する
		Dog dogClass = new Dog();
		// 結果をコンソールに出力する
		System.out.println(dogClass.animalNamu);
		// Dogクラスを呼び出して変数dogIntに代入する
		Dog dogInt = new Dog(3);
		// 結果をコンソールに出力する
		System.out.println(dogInt.animals);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入してコンソールに出力する
		// Calendarクラスのオブジェクトを生成する
		Calendar cl = Calendar.getInstance();
		// SimpleDateFormatクラスでフォーマットパターン「yyyy-MM-dd H:m:s」を設定する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		// 現在の日時をコンソールに出力する
		System.out.println(sdf.format(cl.getTime()));
	}
}