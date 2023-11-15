package tu.ac.th.cs264group1.Model;

public class Student {
    private String date;

    private String nameTitle;
    private String studentFirstName;
    private String studentLastName;
    private String studentId;
    private String studentYear;
    private String studentField;
    private String addressNumber;
    private String moo;
    private String tumbol;
    private String amphur;
    private String province;
    private String postalcode;
    private String mobilePhone;
    private String phone;
    private String advisor;
    private String subject;
    private String teacher;
    private String center;
    private String cause;


    public Student(String date, String nameTitle, String studentFirstName, String studentLastName,
                   String studentId, String studentYear, String studentField, String addressNumber,
                   String moo, String tumbol, String amphur, String province, String postalcode,
                   String mobilePhone, String phone, String advisor, String subject, String teacher, String center, String cause) {
        this.date = date;
        this.nameTitle = nameTitle;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentId = studentId;
        this.studentYear = studentYear;
        this.studentField = studentField;
        this.addressNumber = addressNumber;
        this.moo = moo;
        this.tumbol = tumbol;
        this.amphur = amphur;
        this.province = province;
        this.postalcode = postalcode;
        this.mobilePhone = mobilePhone;
        this.phone = phone;
        this.advisor = advisor;
        this.subject = subject;
        this.teacher = teacher;
        this.center = center;
        this.cause = cause;
    }

    // Default constructor
    public Student(){

    }

    public String getCause() {return cause;}

    public void setCause(String cause) {this.cause = cause;}

    public String getCenter() {return center;}

    public void setCenter(String center) {this.center = center;}

    public String getTeacher() {return teacher;}

    public void setTeacher(String teacher) {this.teacher = teacher;}

    public String getSubject() {return subject;}

    public void setSubject(String subject) {this.subject = subject;}

    public String getAdvisor() {return advisor;}

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPostalCode() {
        return postalcode;
    }

    public void setPostalCode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAmphur() {
        return amphur;
    }

    public void setAmphur(String amphur) {
        this.amphur = amphur;
    }

    public String getTumbol() {
        return tumbol;
    }

    public void setTumbol(String tumbol) {
        this.tumbol = tumbol;
    }

    public String getMoo() {
        return moo;
    }

    public void setMoo(String moo) {
        this.moo = moo;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getStudentField() {
        return studentField;
    }

    public void setStudentField(String studentField) {
        this.studentField = studentField;
    }

    public String getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(String studentYear) {
        this.studentYear = studentYear;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getNameTitle() {
        return nameTitle;
    }

    public void setNameTitle(String nameTitle) {
        this.nameTitle = nameTitle;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
