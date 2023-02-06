import angajat.Angajat;
import enumerare.Language;

public class Application {
    public static void main(String[] args){
        Angajat angajat = new Angajat();
        angajat.setSalariu(125.69);
        angajat.setAge(18);
        angajat.setName("K. Max");
        angajat.setLanguage(Language.RO);

        Angajat angajat1 = new Angajat();
        Angajat.count = 5;
        System.out.println(angajat1.getCount());


        System.out.println(angajat.getSalariu());
        System.out.println(angajat.getAge());
        System.out.println(angajat.getName());
    }
}
