public class HW02_Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Sean");
        student1.setGrade("1");
        student1.setId("108021004");
        student1.setDepartment("CSIE");
        student1.setGender("Male");
        System.out.println("Name\t:" + student1.getName());
        System.out.println("Grade\t:" + student1.getGrade());
        System.out.println("Id\t:" + student1.getId());
        System.out.println("Department\t:" + student1.getDepartment());
        System.out.println("Gender\t:" + student1.getGender());
    }    
}