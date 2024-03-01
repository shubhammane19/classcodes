class MyThread extends Thread{
	
	public void run(){
		
		System.out.println("In run");
	}
}


class ThreadDemo{
	
	public static void main(String[] args)throws InterruptedException{
		
		MyThread obj = new MyThread();
		obj.start();
		
		//Thread.sleep(2000);
		
		System.out.println("In main");
	}
}