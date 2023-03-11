package overloadclass;

public class DegreeTester {
    public static void main(String[] args) {


        Degree degree = new Degree();
        degree.getPrerequisite();
        Masters masters=new Masters();
        masters.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();

    }
}