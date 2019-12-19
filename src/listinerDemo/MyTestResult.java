package listinerDemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyTestResult {
	int testPassed;
	int testFailed;
	int testSkipped;


public int  getTestPassed(){
	return this.testPassed;

}
public int getTestFailed(){
	return this.testFailed;
	
}
public int getTestSkipped(){
	return this.testSkipped;
	
	
	
	
}
public int totalTestsRun(){
	return this.testSkipped + this.testFailed + this.testSkipped;
	
}
public void increamentTestPassed(){
	this.testPassed++;
	
}
public void increamentTestFailed(){
	this.testPassed++;
	
}
public void increamentTestSkipped(){
	this.testSkipped++;
}

public void write() throws IOException{
	File file = new File("MyTestResult.txt");
	FileWriter fw = new FileWriter(file);
	
	BufferedWriter bWriter= new BufferedWriter(fw);
	bWriter.write("PASSED ="+ this.testPassed +"\n");
	bWriter.write("SKIPPED ="+ this.testSkipped +"\n");
	bWriter.write("FAILLED ="+ this.testFailed +"\n");
	bWriter.write("TOTALL ="+ this.totalTestsRun() +"\n");
	
}

	
}
	