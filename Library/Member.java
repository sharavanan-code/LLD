package Library;
import java.util.*;

public class Member{
    private int memberId;
    private String name;
    private List<String> borrowbooks;

    public Member(int memberId, String name){
        this.memberId = memberId;
        this.name =name;
        this.borrowbooks = new ArrayList<>();

    }
    public int getMemberId(){
        return memberId;
    }

    public String getName(){
        return name;
    }

    public List<String> getborrowbooks(){
        return borrowbooks;

    }

    public void borrowbook(String bookname){
        borrowbooks.add(bookname);
    }

    public void returnbook(String bookname){
        borrowbooks.remove(bookname);
    }

     public boolean hasbook(String name){
        return borrowbooks.contains(name);

    }

    public void showbooks(){
        if(borrowbooks.isEmpty()){
            System.out.println("None of the books");
        }else{
            for(String book : borrowbooks){
                int i = 1;
                System.out.println(i+". "+book);
                i++;
            }
        }
    }


}