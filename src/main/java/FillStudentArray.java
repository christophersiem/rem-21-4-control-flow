public class FillStudentArray {

    public static String[] generateStudentNames(int numberOfStudents){

        String[] studentNames = new String[numberOfStudents];

        for(int i = 0; i < studentNames.length; i++){
            studentNames[i] = "Student " + (i + 1);
        }

        return studentNames;
    }

}
