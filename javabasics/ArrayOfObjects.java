class Students {
    String name;
    int marks;
    int rollNo;
}

public class ArrayOfObjects {
    public static void main(String args[]) {
        Students s1 = new Students();
        s1.name = "Kundan";
        s1.marks = 78;
        s1.rollNo = 2;

        Students s2 = new Students();
        s2.name = "Ram";
        s2.marks = 67;
        s2.rollNo = 5;

        Students s3 = new Students();
        // String r3 = s3.name = "Sam";
        s3.name = "Sam";
        s3.marks = 66;
        s3.rollNo = 8;
        // System.out.println("This is name of student " + r3); // normally we can print
        // values like these

        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for (int i = 0; i < students.length; i++) {
        System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}
