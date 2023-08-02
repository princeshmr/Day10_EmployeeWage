class EmpWageBuilderUC7 
{
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;

	public EmpWageBuilderUC7(String company,int empRatePerHour,int numOfWorkingDays,
		                         int maxHoursPerMonth)
	{
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
	}
    private int computeEmpWage()
	{
        int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;

		while (totalEmpHrs<=maxHoursPerMonth && totalWorkingDays <numOfWorkingDays)
		{
			totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			switch (empCheck)
			{
			case IS_PART_TIME:
				empHrs=4;
			    break;
			case IS_FULL_TIME:
				empHrs=8;
			default:
				empHrs=0;
			}
			totalEmpHrs +=empHrs;
			System.out.println("Day#: "+totalWorkingDays+" Emp Hrs: "+empHrs);
		}
		return totalEmpHrs * empRatePerHour ;
	}
	public static void main(String[] args) 
	{
        EmpWageBuilderUC7 dMart=new EmpWageBuilderUC7("DMArt",20,20,100);

		
		System.out.println("Total Emp Wage for company "+dMart.company+" is "+dMart.computeEmpWage());
	}
}




