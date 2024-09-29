/*
 * package utilities;
 * 
 * import java.io.IOException;
 * 
 * import org.testng.annotations.DataProvider;
 * 
 * public class DataProviders {
 * 
 * @DataProvider(name="LoginData") public String [][] getData() throws
 * IOException {
 * 
 * String path= ".//testData//write.xlsx";
 * 
 * excelUtiles ex=new excelUtiles(path);
 * 
 * int totalrows= ex.getRowCount("Sheet1"); int totalcell=
 * ex.getCellCount(Sheet1,1);
 * 
 * String loginData[][]=new String [totalrows][totalcell]; for(int
 * i=1;i<totalrows;i++) { for(int j=0;j<totalcell;j++) {
 * loginData[i-1][j]=ex.getcellData("Sheet1", i, j); } }
 * 
 * 
 * return loginData; } }
 */