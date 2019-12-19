package utillity;

public class Element {
	//top menu my account      //VERIFY PAGE
	public static final String AccMenu="//*[@id='tdb3']/span[2]";
	public static final String AccEdit="//*[@id='bodyContent']/div/div[1]/ul/li[1]/a";
	public static final String AccfirstNmae="firstname";
	public static final String AccContinueButton="tdb5";
	
	//PRODUCT SEARCH
	public static final String searchFild="keywords";
	//public static final String searchFild="//*[@id='columnLeft']/div[3]/div[2]/form/input[1]";
	//public static final String searchFild="//html/body/div[1]/div[4]/div[3]/div[2]/form/input[1]";
	public static final String clikToSearch= "input[type=\"image\"]";             //"//*[@id='columnLeft']/div[3]/div[2]/form/input[1]";
    public static final String prodName= "Courage Under Fire";                                 //"//*[@id='bodyContent']/div/div[1]/div[1]/div[2]/table/tbody/tr/td[2]/a";
	public static final String prodImage= "img[title=\"Courage Under Fire ... Shift+R improves the quality of this image. Shift+A improves the quality of all images on this page.\"]";                                //"//*[@id='bodyContent']/div/div[1]/div[1]/div[2]/table/tbody/tr/td[1]/a/img";
	//public static final String addProdChart= "//*[@id='tdb5']/span[2]";
		

	//EDIT MY PASSWORD CLASS
	public static final String EditCurrentPasswrd="//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input";
	public static final String EditNewPasswrd="//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[2]/td[2]/input";
	public static final String EditConfirmPasswrd="//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[3]/td[2]/input";
	public static final String EditPasswrdButton="//*[@id='tdb5']";
    public static final String VerifyPasswrdUpdate="//*[@id='bodyContent']/table/tbody/tr/td";
    
    
  //CHANGE PASSWORD CLASS.
	   // public static final String AccMenu="//*[@id='tdb3']/span[2]"; 
	public static final String XAccMenu="//*[@id='tdb3']/span[1]";
	// public static final String AccMenu="html/body/div[1]/div[1]/div[2]/span[3]/a/span[1]";
	//public static final String AccMenu="html/body/div[1]/div[1]/div[2]/span[3]/a/span[2]";
	public static final String changePasswdLink="//*[@id='bodyContent']/div/div[1]/ul/li[3]/a";

	


}
