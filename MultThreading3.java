class MyThread extends Thread{
	
	public void run(){
		
		Thread.currentThread().setName("Employee");
		System.out.println(Thread.currentThread());
	}
}

class ThreadDemo2{
	
	public static void main(String[] args)throws InterruptedException{
		
		MyThread obj = new MyThread();
		obj.start();
		
		Thread.sleep(100);
		
		Thread.currentThread().setName("Testing");
		System.out.println(Thread.currentThread());
	}
}