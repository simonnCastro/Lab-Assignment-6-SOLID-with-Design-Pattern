public class Order{
    private String orderNumber;
    private String item;
    private StudentInfo studentInfo;
    private String title;

    public String getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }
    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }
    
}