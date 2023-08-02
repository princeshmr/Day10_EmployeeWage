class EmpWageBuilderUC2 
{
	public static final int IS_FULL_TIME=1;

    private final String company;
	private final int empRatePerHour;
	public EmpWageBuilderUC2(String company,int empRatePerHour)
	{
		this.company=company;
		this.empRatePerHour=empRatePerHour;
	}
	public static void main(String[] args) 
	{
	    
	    EmpWageBuilderUC2 dMart=new EmpWageBuilderUC2("DMArt",20);
		int empHrs=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random()*10)%2;
		if (empCheck==IS_FULL_TIME)
		{
			empHrs=8;
		}
		else
		{
			empHrs=0;
		}
		empWage=empHrs*dMart.empRatePerHour;
		System.out.println("EMP WAGE for company: "+dMart.company+" is "+empWage);
	}
}



