package practice;

//palindrop substring from given string 
public class Palindrom{
int resultStart;
int resultEnd;
public String subStr(String s){
if(s.length()<2){
return s;
}
for(int i=0;i<s.length();i++){
	//for odd length
find(s,i,i);
//for even length
find(s,i,i+1);

}
return s.substring(resultStart,resultStart+resultEnd);
}
public void find(String h, int start,int end){
while(start>=0&&end<h.length()&&h.charAt(start)==h.charAt(end)){
start--;
end++;
}
if(resultEnd<end-start){
resultStart=start+1;
resultEnd=end-(start+1);
}



}
public static void main(String[] args) {

Palindrom p=new Palindrom();
String x=p.subStr("abcdcbdddddd");
System.out.println(x);
}

}