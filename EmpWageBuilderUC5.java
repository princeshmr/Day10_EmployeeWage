class EmpWageBuilderUC5 
{
    public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;

	public EmpWageBuilderUC5(String company,int empRatePerHour,int numOfWorkingDays)
	{
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
	}

	public static void main(String[] args) 
	{
        EmpWageBuilderUC5 dMart=new EmpWageBuilderUC5("DMArt",20,20);

		int empHrs=0, empWage=0, totalEmpWage=0;
		for (int day=0;day<dMart.numOfWorkingDays ;day++ )
		{
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
			empWage=empHrs * dMart.empRatePerHour;
			totalEmpWage +=empWage;
			System.out.println("EMP WAGE for company: "+dMart.company+" is "+empWage);
		}
		System.out.println("Total Emp Wage for company "+dMart.company+" is "+totalEmpWage);
	}
}


