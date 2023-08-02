class EmpWageBuilderUC4 
{
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

    private final String company;
	private final int empRatePerHour;

	public EmpWageBuilderUC4(String company,int empRatePerHour)
	{
		this.company=company;
		this.empRatePerHour=empRatePerHour;
	}
	public static void main(String[] args) 
	{
		EmpWageBuilderUC4 dMart=new EmpWageBuilderUC4("DMArt",20);
		int empHrs=0;
		int empWage=0;
		int empCheck=(int)Math.floor(Math.random()*10)%3;
		switch (empCheck)
		{
		case IS_PART_TIME:
			empHrs=4;
		    break;
		case IS_FULL_TIME:
			empHrs=8;
		    break;
		default:
			empHrs=0;
		}
		empWage=empHrs*dMart.empRatePerHour;
		System.out.println("EMP WAGE for company: "+dMart.company+" is "+empWage);
	}
}



