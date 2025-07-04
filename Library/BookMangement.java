package Library;
import java.util.*;

public class BookMangement {

    private Book_List BookList;
    private List<Member> members;
    int memberId = 1;

    public BookMangement() {
        this.BookList = new Book_List(); 
        this.members = new ArrayList<>();

        BookList.addbook("HARRY POTTER", 3);
        BookList.addbook("1984", 2);
        BookList.addbook("THE HOBBIT", 1);
    }

    public void register(String name){
        Member newMember = new Member(memberId++, name.toLowerCase());
        members.add(newMember);
        System.out.println("New member added: ID = " + newMember.getMemberId() + ", Name = " + newMember.getName());
    }

    private Member getMembername(String name){
        for (Member m : members) {
            if (name.equals(m.getName().toLowerCase())) {
                return m;
            }
        }
        return null;
    }

    public void addbook(String name, int count){
        BookList.addbook(name, count);
        System.out.println("Book successfully saved.");
    }

    public void takebook(String memberName, String bookName){
        Member member = getMembername(memberName);
        if (member == null) {
            System.out.println("Sorry, member not found.");
            return;
        }

        if (BookList.isAvaliable(bookName)) {
            BookList.takebook(bookName);
            member.borrowbook(bookName); // ✅ actually assign book to member
            System.out.println("You borrowed the book successfully.");
        } else {
            System.out.println("Sorry, the book is out of stock.");
        }
    }

    public void returnbook(String memberName, String bookName){
        Member member = getMembername(memberName);
        if (member == null || !member.hasbook(bookName)) {
            System.out.println("Invalid return.");
            return;
        }

        BookList.returnbook(bookName);
        member.returnbook(bookName);
        System.out.println("Member " + member.getName() + " returned book: " + bookName);
    }

    public void getAvailableCopies(String name){
        int copies = BookList.getAvailableCopies(name);
        System.out.println("This book has " + copies + " available copies.");
    }

    public void showAvaliable(){
        System.out.println("Available books:");
        BookList.printAvaliableBooks();
    }

    public void showMemberBooks(String memberName) {
        Member member = getMembername(memberName);
        if (member != null) {
            member.showbooks();
        } else {
            System.out.println("Member not found.");
        }
    }
}
