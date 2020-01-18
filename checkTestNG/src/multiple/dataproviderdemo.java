package multiple;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderdemo {
				
			
							@Test(dataProvider="newdata")
							public void Login(String uname, String paswd)
							{
							System.out.println(uname + paswd);
							
							}
							
							@DataProvider							
							public Object[][] newdata()
							{
							Object arr[][]= new Object[2][2];
							arr[0][0]="newpass@1234";
							arr[0][1]="abhishek";
							
							arr[1][0]="ashish";
							arr[1][1]="pass#456";
							
							return arr;
			
			}
			
			
}
