package crossword;

import java.util.*;

public class CrosswordMain {

	public static void main(String[] args) {
		
		// 単語リスト読み込み
		List<String> rawWordList = new ArrayList<String>();
		List<String> formattedWordList = new ArrayList<String>();
		rawWordList = FunctionFile.fileToList(Const.dictionaryName);
		formattedWordList = FunctionString.toUpperCaseJpList(rawWordList);
		
		// 盤面作成
		String[][] board = new String[Const.boardHeight][Const.boardWidth];
	}

}
