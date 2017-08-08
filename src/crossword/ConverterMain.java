package crossword;

import java.util.ArrayList;
import java.util.List;

// 小文字を含む辞書ファイルを全部大文字に変換するプログラム
public class ConverterMain {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> listCw = new ArrayList<String>();
		list = FunctionFile.fileToList(Const.dictionaryName);
		listCw = FunctionString.toUpperCaseJpList(list);
		FunctionFile.listToFile(listCw, Const.dictionaryName + "Cw.txt");
	}

}
