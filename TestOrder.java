public class TestOrder{
    public static void main(String[] args){
        StudentInfo myStudentInfo1 = new StudentInfo();
        myStudentInfo1.setStudentName("John Doe");
        StudentInfo myStudentInfo2 = new StudentInfo();
        myStudentInfo2.setStudentName("Jane Doe");

        Order myOrder1 = new Order();
        myOrder1.setTitle("Book1");
        myOrder1.setStudentInfo(myStudentInfo1);

        Order myOrder2 = new Order();
    
        myOrder2.setTitle("Journal1");
        myOrder2.setStudentInfo(myStudentInfo1);

        Order myOrder3 = new Order();
        myOrder3.setTitle("Book2");
        myOrder3.setStudentInfo(myStudentInfo2);

        BorrowProcessor bookBorrowProcessor = new BookBorrowGateway();
        BorrowProcessor journalBorrowProcessor = new JournalBorrowGateway();

        OrderProcessor bookOrderProcessor = new OrderProcessor(bookBorrowProcessor);
        OrderProcessor journalOrderProcessor = new OrderProcessor(journalBorrowProcessor);

        bookOrderProcessor.processOrder(myOrder1);
        journalOrderProcessor.processOrder(myOrder2);
        bookOrderProcessor.processOrder(myOrder3);
    }
}