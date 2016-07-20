public class cAssignment1 
{

	public int mGetAnswer(int pNum1, float pNum2) 
	{
		int lAnswer = (int) (pNum1 + pNum2);
		return lAnswer;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		cAssignment1 lAssignment = new cAssignment1();
		int lAnswer = lAssignment.mGetAnswer(0, 2);
		System.out.println(lAnswer);
	}

}
