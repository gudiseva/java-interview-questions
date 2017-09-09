package nag.arvind.gudiseva;

public class StringReverse {
	
	// Current Roles and Responsibilities, Scala, Spark, HBase, Core Java
	
	public StringReverse() {}

	public static void main(String[] args) {

		StringReverse strRev = new StringReverse();
		
		String original = "SECUNDERABAD";
		String modified1 = strRev.testReverse(original);
		System.out.println("Reverse String: " + modified1);
		
		String modified2 = strRev.testCharArray(original);
		System.out.println("Reverse String: " + modified2);
	}

	private String testReverse(String str){
	
		StringBuffer sb = new StringBuffer(str);
		String reverse = sb.reverse().toString();
		return reverse;
	}

	private String testCharArray(String str){
		
		char[] orgArr = str.toCharArray();
		StringBuffer buff = new StringBuffer();
		for(int i = orgArr.length - 1; i >= 0;  i--){
			buff.append(orgArr[i]);
		}
		return buff.toString();
	}

	
}
