package utillity;


public class ReadExcelData {
	public static void main(String[] args) {
	ExcelLiabary ReadData= new ExcelLiabary("C://SoftwareTesting//ExcelData//TestData.xlsx");
	
	System.out.println(ReadData.getData(1, 0, 0));
	

}
}

	