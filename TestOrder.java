public class TestOrder{
    public static void main(String[] args){

        Order myOrder = new Order();
        StudentInfo myStudentInfo = new StudentInfo();
        myStudentInfo.setStudentName("John Doe");
        
        myOrder.setTitle("Harry Potter");
        myOrder.setStudentInfo(myStudentInfo);

        BorrowProcessor borrowProcessor = new BookBorrowGateway();

        OrderProcessor orderProcessor = new OrderProcessor(borrowProcessor);

        orderProcessor.processOrder(myOrder);
    
    }
}