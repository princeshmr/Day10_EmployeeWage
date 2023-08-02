class EmpWageBuilderUC1 
{
	public static final int IS_FULL_TIME=1;
	public static boolean isEmpCheck()
	{
        double empCheck=Math.floor(Math.random()*10)%2;
		if (empCheck==IS_FULL_TIME)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		boolean res=isEmpCheck();
		
		if (res)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is not present");
		}
	}
}


