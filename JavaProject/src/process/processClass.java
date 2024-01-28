package process;

//SimpleDateFormatクラスを使用
import java.text.SimpleDateFormat;
//Calendarクラスを使用
import java.util.Calendar;

public class processClass {
	// フィールドに文字列型の変数helloを定義する
	public String hello;
	// フィールドに文字列型の変数deliciousを定義する
	public String delicious;
	// フィールドに文字列型の変数sushiを定義する
	public String sushi;
	// フィールドにCalendarクラスの変数clを定義する
	Calendar cl;
	// フィールドにSimpleDateFormatクラスの変数sdfを定義する
	SimpleDateFormat sdf;
	// フィールドに文字列型の変数nowTimeを定義する
	public String nowTime;

	// それぞれの変数に初期値を代入するコンストラクタを作成する
	public processClass() {
		// 変数helloに「こんにちは！ここは日本です！」を代入する
		this.hello = "こんにちは！ここは日本です！";
		// 変数deliciousに「この寿司はうまい」を代入する
		this.delicious = "この寿司はうまい";
		// 変数sushiに「寿司は和食です」を代入する
		this.sushi = "寿司は和食です";
		// 変数clにCalendarクラスのオブジェクトを生成する
		this.cl = Calendar.getInstance();
		// 変数sdfにSimpleDateFormatクラスでフォーマットパターン「yyyy-MM-dd H:m:s」を設定する
		this.sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		// 変数nowTimeに現在の日時を設定する
		this.nowTime = sdf.format(cl.getTime());
	}
}