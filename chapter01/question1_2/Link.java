package question1_2;

public class Link {
	// (1) 引数がfolder, fileとなるメソッドを作成
	String concatPath(String folder, String file) {
		// (2) if文でfolderの末尾に\記号が付いて"いない"場合、末尾に\記号を付ける
		if(!folder.endsWith("\\")) {
			folder += "\\";
		}
		// (3) folderとfileを連結した文字列を返す
		return folder + file;
	}
}
