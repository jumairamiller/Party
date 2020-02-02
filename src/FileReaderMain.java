import java.util.Scanner;

public class FileReaderMain {

	public static void main(String[] args) {
		BST tree = new BST();
		tree = FileReader.readProfileSet("src/data/data.txt");
	}
}
