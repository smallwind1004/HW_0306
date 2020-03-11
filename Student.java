public class Student {

    private String name, grade, id, department, gender;

    void setName(String setname) {
        this.name = setname;
    }

    void setGrade(String setgrade) {
        this.grade = setgrade;
    }

    void setId(String setid) {
        this.id = setid;
    }

    void setDepartment(String setdepartment) {
        this.department = setdepartment;
    }

    void setGender(String setgender) {
        this.gender = setgender;
    }
    void setAll(String sName,String sGrade,String sId,String sDepartment,String sGender){
        this.name = sName;
        this.grade = sGrade;
        this.id = sId;
        this.department = sDepartment;
        this.gender = sGender;
    }

    String getName() {
        return name;
    }
    String getGrade() {
        return grade;
    }
    String getId() {
        return id;
    }
    String getDepartment() {
        return department;
    }
    String getGender() {
        return gender;
    }
    void showAll(){
        System.out.println("Name\t:" + getName());
        System.out.println("Grade\t:" + getGrade());
        System.out.println("Id\t:" + getId());
        System.out.println("Department\t:" + getDepartment());
        System.out.println("Gender\t:" + getGender());
    }
}