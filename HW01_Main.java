/**
 * Main
 */
public class HW01_Main {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        book1.setName("Java7");
        book1.setAuthor("洪維恩");
        book1.setPublisher("旗標");
        book1.setDate("2018/3/五版/17刷");
        book1.setISBN("978-986-312-054-4");
        System.out.println("書名\t:" + book1.getName());
        System.out.println("作者\t:" + book1.getAuthor());
        System.out.println("出版所\t:" + book1.getPublisher());
        System.out.println("出版日\t:" + book1.getDate());
        System.out.println("ISBN\t:" + book1.getISBN());
    }
}