package com.crm.vtiger;

import org.testng.annotations.Test;
import fileutilitytest.Baseclass;
import fileutilitytest.HomePage;
import fileutilitytest.OrganistationPOM;
import fileutilitytest.propertyutilityfile;

public class CreateOrgTest extends Baseclass {
	
//WebDriverUtilities we = new WebDriverUtilities();
@Test
public void createOrg() throws Exception
    {
	HomePage hp=new HomePage(driver);
	System.out.println("successfulll");
	hp.getOrganizationLink();
	
	
	OrganistationPOM org =new OrganistationPOM(driver);
	org.ClickPlus();
	propertyutilityfile pfile = new propertyutilityfile();
	String name =pfile.readdata("organisationname");
	org.getOrgName(name);
	Thread.sleep(0);
	
		
	
    }
	
}

