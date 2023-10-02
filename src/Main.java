public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);

        System.out.println("Task2");
        dog = dog+4;
        cat = cat+4;
        paper = paper+4;
        System.out.println("dog+4="+dog);
        System.out.println("cat+4="+cat);
        System.out.println("paper+4="+paper);

        System.out.println("Task3");
        dog = dog-3.5;
        cat = cat-1.6;
        paper = paper-7639;
        System.out.println("dog-3.5="+dog);
        System.out.println("cat-1.6="+cat);
        System.out.println("paper-7639="+paper);

        System.out.println("Task4");
        var friend = 19;
        System.out.println("friend="+friend);
        friend = friend+2;
        System.out.println("friend+2="+friend);
        friend = friend/7;
        System.out.println("friend/7="+friend);

        System.out.println("Task5");
        var frog = 3.5;
        System.out.println("frog="+frog);
        frog = frog*10;
        System.out.println("frog*10="+frog);
        frog = frog/3.5;
        System.out.println("frog/3.5="+frog);
        frog = frog+4;
        System.out.println("frog+4="+frog);

        System.out.println("Task6");
        var boxerMass1 = 78.2;
        var boxerMass2 = 82.7;
        System.out.println("sum="+(boxerMass1+boxerMass2)+"kg");
        System.out.println("difference="+(boxerMass1-boxerMass2)+"kg");

        System.out.println("Task7");
        System.out.println("difference="+(boxerMass2-boxerMass1)+"kg");
        System.out.println("difference="+(boxerMass2%boxerMass1)+"kg");

        System.out.println("Task8");
        var hourAll = 640;
        var hourOne = 8;
        var workersAll = hourAll/hourOne;
        System.out.println("Всего работников в компании - "+workersAll+" человек");
        workersAll = workersAll+94;
        hourOne = hourAll/workersAll;
        System.out.println("Если в компании работает "+workersAll+" человека, то всего "+hourOne+" часа работы может быть поделено между сотрудниками");

    }
}