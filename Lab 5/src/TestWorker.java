
class TestWorker {

	public static void main(String[] args) {
		
		Worker w = null;
		
		double rate=50;		
		if(rate==50) w = new HourlyWorker("Ramesh",rate,100);
		else if(rate==100) w = new FullTimeWorker("Ramesh",rate,100);
		System.out.println(w.computePay());
		
		rate=100;
		if(rate==50) w = new HourlyWorker("Suresh",rate,220);
		else if(rate==100) w = new FullTimeWorker("Suresh",rate,220);
		System.out.println(w.computePay());
	}

}
