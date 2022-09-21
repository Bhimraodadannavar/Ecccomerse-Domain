package Generic_Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Generic_PropertyFile
{
	@Test
	public void test2(String Path, String key) throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream(Path));
		String a1 = p.getProperty(key);
		System.out.println(a1);

}
}