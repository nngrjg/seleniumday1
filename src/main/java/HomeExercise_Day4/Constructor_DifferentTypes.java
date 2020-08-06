package HomeExercise_Day4;

public class Constructor_DifferentTypes {

    Constructor_DifferentTypes(){
        System.out.println("no-args Constructor in Different Types");
    }

    Constructor_DifferentTypes(int no, String name){
        this();
        System.out.println("Int= "+no+" and String= "+name+" Constructor");
    }

    public static void main(String[] args) {
        Constructor_PG1 C1 = new Constructor_PG1();
        Constructor_DifferentTypes C2 = new Constructor_DifferentTypes();
        Constructor_DifferentTypes C3 = new Constructor_DifferentTypes(8,"NAG");

    }
}
