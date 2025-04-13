public class JournalBorrowGateway implements BorrowProcessor{
    @Override
    public boolean authorizeBorrow(String title, StudentInfo studentInfo) {
        // Example implementation: Check if the student and title are valid
        if (studentInfo != null 
            && studentInfo.getStudentName() != null && !studentInfo.getStudentName().isEmpty() 
            && title != null && !title.isEmpty()){
            System.out.println("Journal Borrow authorized for student: " + studentInfo.getStudentName() + " and book: " + title);
            return true;
        } else{
            System.out.println("Journal Borrow not authorized. Invalid student or book title.");
            return false;
        }

    }
}