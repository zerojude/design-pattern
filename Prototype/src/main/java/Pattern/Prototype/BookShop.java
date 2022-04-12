package Pattern.Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

	private String ShopName ;
	List< Book > books = new ArrayList<>();
	
	
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "BookShop [ShopName=" + ShopName + ", books=" + books + "]";
	} 
	
	
	public void databaseFetch()
	{
		for( int i = 1 ; i <= 10 ; i++ )
		{
			/////////////////////////////
			// simulating the data base fetching
			   int j = 0 ;
			   while( j < 500000 )
				   j++; 
			/////////////////////////////
			 
			Book newbook = new Book();
		    newbook.setBookId(i);
		    newbook.setBookName("Book-"+i);   
		    getBooks().add(newbook);
		}
	}
	
	
	
	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		
		BookShop shop = new BookShop(); 
			
		for( Book book : this.getBooks())
		{
			shop.getBooks().add(book);
		}
		
		return shop ;
		
	}
	
	
	
}
