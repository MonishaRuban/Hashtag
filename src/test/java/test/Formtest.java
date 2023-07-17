package test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.Basepage;
import pages.Home;

public class Formtest extends Basepage{
	


		@DataProvider(name="form")
		public Object[][] getData(){
			return new Object[][] {
				{"name", "mail","7689","90","4",
					"C:\\Users\\MSI\\Desktop\\Once upon a time.pdf","I have attached my resume"}, 
				};
				}
		@Test(priority=1,dataProvider="form")
		public void verifyInvalidLoginCredentials(String name1, String mail1,String phone1,
				String notice1,String experience1,String resume1,String desc1) {
			Home a= new Home(driver);
			
			a.typeUsername(name1);
            System.out.println("valid name");
			a.typemail(mail1);
			 System.out.println("invalid mail");
			a.typephone(phone1);
			 System.out.println("invalid phone");
			a.typenotice(notice1);
			 System.out.println("valid notice");
			a.typeexperience(experience1);
			 System.out.println("valid experience");
			a.typeresume(resume1);
			 System.out.println("valid resume");
			a.typedesc(desc1);
			a.clickapply();
			 System.out.println("error");
		}


}
