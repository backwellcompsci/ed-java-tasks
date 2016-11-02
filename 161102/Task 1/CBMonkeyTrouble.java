/*
 * CB monkey trouble task
 * Edward Callow
 * 161102
 */

public class CBMonkeyTrouble{
	public static void main(String[] args){
		boolean apeA = true;
		boolean apeB = false;

		System.out.println("Monkey A is smiling and Monkey B is not. ");
		if(monkeyCheck(apeA,apeB)){
			System.out.println("trouble");
		}
		System.out.println("no trouble");
	}

	public static boolean monkeyCheck(boolean monkeyA, boolean monkeyB){
		if ((monkeyA && monkeyB || !monkeyA && !monkeyB)){
			return true;
		}
		return false;
	}
}