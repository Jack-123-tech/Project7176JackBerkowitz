
public class ShortStory extends WrittenWork {

int paraNum;
boolean pics;



public ShortStory(String title,String author,int year,int paraNum,boolean pics) {
	super(title,author,year);
	this.paraNum=paraNum;
	this.pics=pics;
}




public int getParaNum() {
	return paraNum;
}
public void setParaNum(int paraNum) {
	this.paraNum = paraNum;
}
public boolean isPics() {
	return pics;
}
public void setPics(boolean pics) {
	this.pics = pics;
}
public String toString() {
	String s= super.toString();
	return s+ ","+pics+","+paraNum ;
}






}
