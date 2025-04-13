public interface BorrowProcessor{
    boolean authorizeBorrow(String title, StudentInfo studentInfo);
}