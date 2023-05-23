public class Main {
    public static void main(String[] args) {
        UniversityGroup groupGrifindor = new UniversityGroup("Grifindor", 2010); //изменить
        String[] studentsGrifindor =  new String[]{"Alex Smith","Jennie Kim","Jennifer Lopez"};
        groupGrifindor.addStudents(studentsGrifindor);
        String[] studentsSlizerin =  new String[]{"Nicki Minaj ","Doja Cat","Ariana Grande"};
        UniversityGroup groupSlizerin = new UniversityGroup("Slizerin", 2015, studentsSlizerin);
        groupSlizerin.addStudents(studentsSlizerin);
        groupSlizerin.getGroupDescription();
        groupGrifindor.addStudents(studentsSlizerin);
        groupGrifindor.getGroupDescription();
    }
}


