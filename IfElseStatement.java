public class IfElseStatement {
    
    public static void main(String args[]) {
        //int age = 21;
        //int age = 16;
        int age = 13;
    if(age >= 18) {
        System.out.println("adult = eligible for vote, drive");
    }
    if(age > 14 && age < 18) {
        System.out.println("not adult = not eligible for vote, drive");
    }
    else {
        System.out.println("teeneger");
    }
    }
}