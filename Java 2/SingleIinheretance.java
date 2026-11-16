class Student {
    public int Roll;
    String Name;

}

class Result extends Student {
    float Mark;

    void GetData() {
        Roll = 10;
        Name = "Khialid";
        Mark = 60.50f;
    }

    void Display() {
        System.out.println("Roll is: " + Roll);
        System.out.println("Name is: " + Name);
        System.out.println("Mark is: " + Mark);
    }
}

public class SingleIinheretance {
    public static void main(String[] args) {
        Result obj = new Result();
        obj.GetData();
        obj.Display();
        System.out.println();

    }

}
