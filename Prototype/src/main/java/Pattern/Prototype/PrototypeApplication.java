package Pattern.Prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrototypeApplication {

	public static void main(String[] args) throws CloneNotSupportedException {
		SpringApplication.run(PrototypeApplication.class, args);
		
		System.out.println("\r\n" );
		
		
		long start;
		long end ;
		long elapsedTime ;
		
start = System.currentTimeMillis();
		
		BookShop shop1 = new BookShop() ;
		shop1.setShopName("Aryan Book store");
	    shop1.databaseFetch();             // data base fetching costly process in terms of time 
		System.out.println(shop1);
		
end = System.currentTimeMillis();
		
elapsedTime = end - start;
		
        System.out.println("\r\n" );
		System.out.println( " Time take without using prototype pattern-> " + elapsedTime + " millisec");
		
		
        // BookShop shop2 = new BookShop();
		
		
		// here we dont want to load data from database it will take time 
		// what we can do is using prototype pattern we can clone the books from shop1 and updtae the books accordingly
		// keep in mind whether to use shallow copy or Deep Copy
		
		
		
		
		System.out.println("\r\n" );
		
		
		
start = System.currentTimeMillis();
		
           BookShop shop2 = shop1.clone();
           shop2.setShopName("Aditya Book store");
           System.out.println(shop2);

end = System.currentTimeMillis();
elapsedTime = end - start;
		
           System.out.println("\r\n" );
           System.out.println( " Time taken after using prototype desingn pattern -> " + elapsedTime + " millisec");
		
		
	}

}
