class MyThread extends Thread{
	
	MyThread(String str){
		
		super(str);
	}
	public void run(){
		
		System.out.println(getName());
		System.out.println(Thread.currentThread());
	}
}

class ThreadGroupDemo{
	
	public static void main(String[] args){
		
		MyThread obj = new MyThread("Zyz");
		obj.start();
	}
}