package vo;

public class Book {
	//书编号ID
	private String bookID;
	//书名，汉字
	private String bookName;
	//书籍分类
	private String bookCategory;
	//书籍简介
	private String bookIntroduction;
	
	
	//自动生成get和set方法
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public String getBookIntroduction() {
		return bookIntroduction;
	}
	public void setBookIntroduction(String bookIntroduction) {
		this.bookIntroduction = bookIntroduction;
	}
	
	public Book(){
		super();
	}
	public Book(String bookID, String bookName, String bookCategory,
			String bookIntroduction) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookCategory = bookCategory;
		this.bookIntroduction = bookIntroduction;
	}
	
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName
				+ ", bookCategory=" + bookCategory + ", bookIntroduction="
				+ bookIntroduction + "]";
	}
	

}
