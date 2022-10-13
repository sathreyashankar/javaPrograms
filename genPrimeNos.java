public class genPrimeNos{
    public static void main(String[] args) {
        for(int no =2; no<1000; no++) {
			boolean isPrime = true;
		
			
			for(int div = 2; div < no; div++) {					// div*div <= no !forLargeNumber
				if(no % div == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(no);
			}
		}

        
    }
}