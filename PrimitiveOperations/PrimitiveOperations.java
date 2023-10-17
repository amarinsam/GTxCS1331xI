public class PrimitiveOperations{
	public static void main(String[] args){
		int iNum = 5;
		double fNum = 5.0;
		System.out.println(iNum);
		System.out.println(fNum);
		double newNum = iNum * fNum;
		System.out.println(newNum);
		double intToFloat = (double)iNum;
		System.out.println(intToFloat);
		int floatToInt = (int)fNum;
		System.out.println(floatToInt);
		char charEx = 'A';
		System.out.println((char)(charEx + 32));
		

		}
}