public class OrderProcessor {
    private BorrowProcessor borrowProcessor;
  
    public OrderProcessor(BorrowProcessor borrowProcessor) {
      this.borrowProcessor = borrowProcessor;
    }
  
  
    public void processOrder(Order order) {
      if (borrowProcessor.authorizeBorrow(order.getTitle(), order.getStudentInfo())) {
        // ... fulfill order
        processBorrow();
      } else {
        // Handle payment failure
      }
    }

    public void processBorrow(){
        System.out.println("I processed the borrow!");
    }
  }
  