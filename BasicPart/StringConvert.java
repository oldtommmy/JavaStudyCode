//String 类型与其他基本类型的转换
public class StringConvert{

	public static void main(String[] args){

		//Basic->String
		int i1 = 1;
		float f1 = 2f;
		boolean b1 = true;
		double d1 = 3.14;
		String s1 = i1 + "";
		String s2 = f1 + "";
		String s3 = b1 + "";
		String s4 = d1 + "";

		System.out.println(s1+" "+s2+" "+s3+" "+s4);
		System.out.println("=====================");

		//String->Basic
		String s5 = "123";
		int n1 = Integer.parseInt(s5);
		float n2 = Float.parseFloat(s5);
		double n3 = Double.parseDouble(s5);
		boolean b = Boolean.parseBoolean("true");

		if(b){
			System.out.println(n1+" "+n2+" "+n3);
		}
		System.out.println("=====================");

		//提取String里面的第x个字符并转换为char类型
		String s6 = "hello";
		int x1 = 0;
		int x2 = 1;
		char c1 = s6.charAt(x1);
		char c2 = s6.charAt(x2);
		System.out.println(c1+" "+c2);
	}
}