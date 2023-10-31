
public class Flows {

    public void methodA(String input) {
        System.out.print("J");
        System.out.print("a");
        if (!input.equals("start")) {

            methodB("start");
        } else {
            System.out.print(methodC(input));
        }
    }

    public void methodB(String start) {
        System.out.print("a");
    }

    public String methodC(String input) {
        System.out.print("v");
        return "a er sjovt";
    }
}