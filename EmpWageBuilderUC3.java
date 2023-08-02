class EmpWageBuilderUC3 
{
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

    private final String company;
	private final int empRatePerHour;

	public EmpWageBuilderUC3(String company,int empRatePerHour)
	{
		this.company=company;
		this.empRatePerHour=empRatePerHour;
	}
	public static void main(String[] args) 
	{
		EmpWageBuilderUC3 dMart=new EmpWageBuilderUC3("DMArt",20);
		int empHrs=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random()*10)%3;
		if (empCheck==IS_FULL_TIME)
		{
			empHrs=8;
		}
		else if (empCheck==IS_PART_TIME)
		{
			empHrs=4;
		}
		else
		{
			empHrs=0;
		}
		empWage=empHrs*dMart.empRatePerHour;
		System.out.println("EMP WAGE for company: "+dMart.company+" is "+empWage);
	}
}


