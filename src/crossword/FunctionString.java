package crossword;

import java.util.*;

public class FunctionString {
	
	// 文字列のカタカナ小文字を大文字に変換する
	public static String toUpperCaseJpString(String str) {
		// テーブル駆動にしたい
		String strReturn = str;
		strReturn = strReturn.replace("ァ", "ア");
		strReturn = strReturn.replace("ィ", "イ");
		strReturn = strReturn.replace("ゥ", "ウ");
		strReturn = strReturn.replace("ェ", "エ");
		strReturn = strReturn.replace("ォ", "オ");
		strReturn = strReturn.replace("ッ", "ツ");
		strReturn = strReturn.replace("ャ", "ヤ");
		strReturn = strReturn.replace("ュ", "ユ");
		strReturn = strReturn.replace("ョ", "ヨ");
		return strReturn;
	}

	// リストのカタカナ小文字を大文字に変換する
	public static List<String> toUpperCaseJpList(List<String> list) {
		List<String> listOut = new ArrayList<String>();
		for(int i=0; i<list.size(); i++) {
			listOut.add(toUpperCaseJpString(list.get(i)));
		}
		return listOut;
	}
}
