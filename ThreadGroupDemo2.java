class MyThread extends Thread{
	
	MyThread(ThreadGroup tg, String str){
		
		super(tg,str);
	}
	public void run(){
		
		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadGroupDemo2{
	
	public static void main(String[] args){
		
		ThreadGroup pthreadGP = new ThreadGroup("Core2web");
		
		MyThread obj1 = new MyThread(pthreadGP, "C");
		MyThread obj2 = new MyThread(pthreadGP, "Java");
		MyThread obj3 = new MyThread(pthreadGP, "Python");
		
		obj1.start();
		obj2.start();
		obj3.start();
		
	}
}