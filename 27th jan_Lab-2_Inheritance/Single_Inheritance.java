import java.util.Scanner;

class Book
{
	String title, author;
	float price;
	public Book(String title,String author,float price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void display()
	{
		System.out.println("Book details:");
		System.out.println("title:" + title);
		System.out.println("author:" + author);
		System.out.println("price:" + price);
	}
}

class EBook extends Book
{
	String format;
	int fileSize;
	public EBook(String title,String author,float price,String format,int fileSize)
	{
		super(title,author,price);
		this.fileSize=fileSize;
		this.format=format;
	}
	public void display()
	{
		super.display();
		System.out.println("fileSize:" + fileSize);
		System.out.println("format:" + format);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		String title,author,format;
		int fileSize;
		float price;
		
		System.out.println("enter the book details:");
		System.out.println("enter title:");
		title=sc.next();
		System.out.println("enter author:");
		author=sc.next();
		System.out.println("enter price:");
		price=sc.nextFloat();
		
		System.out.println("enter e if ebook and b if book:");
		ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'e': System.out.println("enter file size:");
				  fileSize=sc.nextInt();
		          System.out.println("enter format:");
		          format=sc.next();
			      EBook e = new EBook(title,author,price,format,fileSize);
			      e.display();
			      break;
		case 'b': Book b = new Book(title,author,price);
	              b.display();
	              break;
	    default: System.out.println("Invalid input");
		}
		

	}

}
