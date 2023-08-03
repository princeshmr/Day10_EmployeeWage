package com.Day10_EmployeeWage;

public class EmpWageBuilderArrayUC10 {
	
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	
	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmpWageBuilderArrayUC10() {
		companyEmpWageArray = new CompanyEmpWage[4];  //my array is fixed 
	}
	
	private void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,
			                       int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,
				                                    numOfWorkingDays,maxHoursPerMonth);
		numOfCompany++;
	}
	
	private void computeEmpWage() {
		for(int i=0; i<numOfCompany ; i++) {
			int totalEmpWage=this.computeEmpWage(companyEmpWageArray[i]);
			System.out.println("Total Emp Wage for company "+companyEmpWageArray[i].company +
					            " is "+totalEmpWage);
		}
	}
	
	 private int computeEmpWage(CompanyEmpWage companyEmpWage)
		{
	        int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;

			while (totalEmpHrs<=companyEmpWage.maxHoursPerMonth && 
					totalWorkingDays <companyEmpWage.numOfWorkingDays)
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
			return totalEmpHrs * companyEmpWage.empRatePerHour ;
		}
	public static void main(String[] args) {
		 
		EmpWageBuilderArrayUC10 empWageBuilder=new EmpWageBuilderArrayUC10();
		empWageBuilder.addCompanyEmpWage("DMart",20,2,10);
		empWageBuilder.addCompanyEmpWage("BigBasket",30,2,20);
		empWageBuilder.computeEmpWage();

	}

}
