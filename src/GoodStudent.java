public class GoodStudent
{
    private String firstName;
    private String lastName;
    private int idNum;
    private double gpa;
    private boolean doesCS;
    private String nickname;


    // constructors
    public GoodStudent ()
    {
        firstName = "";
        lastName = "";
        idNum = 0;
        gpa = 0.0;
        doesCS = false;
        nickname = "";
    }

    public GoodStudent (String firstName, String lastName, String nickname, int idNum, double gpa, boolean doesCS)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;
        this.gpa = gpa;
        this.doesCS = doesCS;
        this.nickname = nickname;
    }
    public GoodStudent (String firstName, String lastName, int idNum, double gpa, boolean doesCS)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;
        this.gpa = gpa;
        this.doesCS = doesCS;
    }





    // getter
    public String getFirstName(){ return firstName;}
    public String getLastName(){ return lastName;}
    public int getIdNum(){ return idNum;}
    public double getGpa(){ return gpa;}
    public boolean getDoesCS(){ return doesCS;}
    public String getNickname(){ return nickname;}

    // setter
    public void setGpa(double csGPA){ gpa = csGPA;}
    public void setNickname(String myNickname){ nickname = myNickname;}


    // brain methods
    public String createID()
    {
        String stringId = "" + idNum;
        return firstName.substring(0,1) + lastName + stringId.substring(stringId.length()-3);
    }

    public double CSGPA ()
    {
        if (doesCS)
            return gpa+(gpa*.15);
        else
            return gpa;
    }

    //toString

    public String toString()
    {
        String result = "";
        result += "Firstname: " + firstName;
        result +="\nLastname: " + lastName;
        result +="\nNickname: " + nickname;
        result +="\nid number:  " + idNum;
        result +="\ngpa: " + gpa;
        result +="\ndoes cs? " + doesCS;

        return result;
    }

}


