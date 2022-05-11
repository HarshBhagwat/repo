package practice;

public class Core {
	int rStart;
	int rLength;
	public String largpal(String s) {
	
		if(s.length()<2) {
			return s;
		}
		for(int i=0;i<s.length();i++) {
			find(s,i,i);
			}
		return s.substring(rStart, rLength);
	}
	public void find(String str,int strt,int end) {
		while(strt>=0&& end<str.length()&&str.charAt(strt)==str.charAt(end)) {
strt--;
			end++;
		}
		if(rLength<end-strt) {
			rStart=strt+1;
			rLength=end;
		}}public static void main(String[] args) {
Core c= new Core();
String x=c.largpal("hzyyxxxbatabxxxyyzhzzzzzzzzfdf");
System.out.println(x);
	}

}
