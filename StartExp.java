class StartExp extends Thread {  
	public void run() {  
		for(int i=1;i<=5;i++) {  
			try {  
				Thread.sleep(5000);  
			} catch(Exception e) {
				System.out.println(e);
			}  
			System.out.println(i);  
		}  
	}	  
	
	public static void main(String args[]){  
		StartExp t1=new StartExp();  
		StartExp t2=new StartExp();  
		StartExp t3=new StartExp();  
		t1.start();  
		// try{  
		// 	t1.join();  
		// }	catch(Exception e){
		// 		System.out.println(e);
		// 	}  
		t2.start();  
		t3.start();  
	}  
}