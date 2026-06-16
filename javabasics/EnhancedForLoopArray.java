class Students {
    String name;
    int marks;
    int rollNo;
}

public class EnhancedForLoopArray {
    public static void main(String args[]) {
        Students s1 = new Students();
        s1.name = "Kundan";
        s1.marks = 88;
        s1.rollNo = 18;

        Students s2 = new Students();
        s2.name = "Ram";
        s2.marks = 83;
        s2.rollNo = 32;

        Students s3 = new Students();
        s3.name = "Sam";
        s3.marks = 78;
        s3.rollNo = 12;

        Students student[] = new Students[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for (Students stud : student) {
            System.out.println(stud.name + " : " + stud.marks);
        }

    }
}
