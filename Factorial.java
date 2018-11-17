public class Factorial{
	public static int compute(int num){
		if(num == 1) {
			return num;
		}
		return num * compute(num - 1);
	}
}
