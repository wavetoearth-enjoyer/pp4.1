// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class GoodStudentDriver
    {
    public static void main(String[] args)
        {
            GoodStudent Alan = new GoodStudent("Alan", "Turing", "Big Al", 191254, 3.56, true );
            GoodStudent Florence = new GoodStudent("Florence", "Nightingale", 182010, 3.89, false );
            GoodStudent Grace = new GoodStudent("Grace", "Hopper", "Queen Bee", 190692, 3.99, true );

            System.out.println(Alan.toString());
            Florence.setNickname("Flo-No");
            Florence.setGpa(3.92);
            System.out.println("nickname: " + Florence.getNickname());
            System.out.println("gpa: " + Florence.getGpa());
            System.out.println(Grace.getFirstName());
            System.out.println(Grace.getDoesCS());


            System.out.println("Alan's id: " + Alan.createID());
            System.out.println("Florence's id: " + Florence.createID());
            System.out.println("Grace's id: " + Grace.createID());


            System.out.println("Alan's gpa: " + Alan.CSGPA());
            System.out.println("Florence's gpa: " + Florence.CSGPA());
            System.out.println("Grace's gpa: " + Grace.CSGPA());


        }
    }
