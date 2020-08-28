
 class HelloRunner implements Runnable{
	
	int i ;
	public void run() {
		i = 5;
		while(true) {
			System.out.println("Hi" + i++);
			if(i == 30) {
				break;
			}
		}
	}

}

