class Bike{
	public void run() {
		System.out.println("the bike is running");
	}
	public void horn() {
		System.out.println("the bike is horing");
	}
	public void stop() {
		System.out.println("the bike is stoping");
	}
}
class Example{
	public static void main(String args[]) {
		Bike obj=new Bike();
		obj.run();
		obj.horn();
		obj.stop();
		
	}
}
