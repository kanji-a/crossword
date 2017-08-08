package crossword;

import java.util.*;

public class CrosswordMain {

	public static void main(String[] args) {
		List<String> listIn = new ArrayList<String>();
		List<String> listCw = new ArrayList<String>();
		listIn = FunctionFile.fileToList(Const.dictionaryName);
		listCw = FunctionString.toUpperCaseJpList(listIn);
	}

}
