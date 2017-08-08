package crossword;

import java.io.*;
import java.nio.file.*;
import java.util.*;

// ファイル入出力関係のメソッド群
public class FunctionFile {

	// 単語リストファイルを指定して、内容を文字列の配列で出力
	public static List<String> fileToList(String filename){
		FileSystem fs = FileSystems.getDefault();
		Path src = fs.getPath("./src/", filename + ".txt");	
		List<String> list = new ArrayList<String>();
		try {
			list = Files.readAllLines(src);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return list;
	}
	
	// 単語のリストをテキストファイルに出力
	public static void listToFile(List<String> list, String filename) {
		FileSystem fs = FileSystems.getDefault();
		Path dst = fs.getPath("./src/", filename + ".txt");	
		try {
			Files.write(dst, list, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

}
