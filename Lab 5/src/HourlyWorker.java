class HourlyWorker extends Worker{
	private int hours_worked;

	HourlyWorker(String name, double salary_rate, int hours_worked) {
		super(name, salary_rate);
		this.hours_worked = hours_worked;
	}
	
	public double computePay() {
		if(hours_worked<60) return hours_worked*super.getSalary_rate();
		else return 60*super.getSalary_rate();
	}
}
