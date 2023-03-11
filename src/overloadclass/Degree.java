package overloadclass;

public class Degree {
    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }

}
    class Bachelors extends Degree {
        @Override
        void getPrerequisite() {  // use word "get" to copy method from parent class
            System.out.println("To get a degree you need high school diploma");
        }
    }

        class Masters extends Degree {

            void getPrerequisite() {
                System.out.println("To get a degree you need high Bachelors");
            }
        }



