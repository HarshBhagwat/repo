package practice;

public class X {

	public static void main(String[] args) {
		String s="hello world hello";
		String[]s1=s.split(" ");
	
		int count;
		for(int i=0;i<s1.length;i++){
	
		count=0;
		for(int j=i+1;j<s1.length;j++){
		if(s1[i].equalsIgnoreCase(s1[j])){
		 count++;
	s1[j]="0";
		}
	
			}
		if(count>0){
			System.out.print(s1[i]);
		}
	
		}
	}

}
