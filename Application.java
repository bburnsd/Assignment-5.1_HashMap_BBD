import java.io.*;
public class Application {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
ArchaicDictionary dict = new ArchaicDictionary();

dict.searchDict("appetency");
dict.searchDict("mooncalf");
dict.searchDict("saddle-bow");
dict.searchDict("commend");
dict.searchDict("love apple");

dict.printDict();
	}

}
