import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class HelloWorld {

	public static void main(String[] args) throws IOException, FileNotFoundException{

	    LineNumberReader lnr = new LineNumberReader(new FileReader(args[2]));
	    
	    int amount = Integer.valueOf(args[1]);
		int start = Integer.valueOf(args[0]);

	    
	    for(Object s : lnr.lines().skip(start - 1).toArray())
	    {
	    	System.out.println(s.toString());

	    	if(--amount == 0)
	    		break;
	    }

	    lnr.close();
	}

}
