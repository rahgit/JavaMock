package rahul.java.example;



public class BubbleSort  extends Thread {

	public static int[] bubbleSort(int[] numbers) {
		boolean swapped = true;
		int count = 0;
		for (int i = numbers.length - 1; i > 0 && swapped; i--) {
			swapped = false;
			for (int j = 0; j < i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					swapped = true;
					System.out.println("Count : " + ++count);
				}
			}
		}
		return numbers;
	}
	
	public static int[] insertionSort(int[] numbers) { 
		
		int i;
		int key ;
		int j;
		for(i = 1 ; i < numbers.length ; i++){
			key = numbers[i];
			j = i-1;
			
			while(j >= 0 && key < numbers[j]){
				numbers[j+1] = numbers[j];
				j--;
			}
			numbers[j+1] = key;
			
		}
		
		return numbers;
	}
	
	public void run(){
		System.out.println("Multithreading");
		try{
			Thread.sleep(10000);
		}catch(InterruptedException ie) {
			
		}
		System.out.println("Rahul");
	}

	public static void main(String[] args) {
		/*Thread th = Thread.currentThread();
		th.setName("Rahul");
		System.out.println(th);*/
		
		BubbleSort b = new BubbleSort();
		BubbleSort b1 = new BubbleSort();
		//Thread th = new Thread(b);
		b.start();
		try {
			b.join(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		b1.start();
		System.out.println(b.isAlive());
		System.out.println(b1.isAlive());
		
	}
}
