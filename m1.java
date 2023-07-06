class m1 implements Runnable{
public void run(){
synchronized(m1.class){
System.out.println("in block"+Thread.currentThread().getName());
System.out.println("in block"+Thread.currentThread().getName());
	}
}
public static void main(String args[]){
m1 s=new m1();
Thread r=new Thread(s);
Thread r1=new Thread(s);
r.setName("vijay");
r1.setName("saurab");
r.start();
r1.start();
		}
	}