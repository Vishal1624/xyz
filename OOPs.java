public class OOPs {
    public static void main(String args[]){
        pen p1 = new pen();
        p1.setColor("red");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        Student p2 = new Student();
        p2.calcPercentage(5 ,8 ,9);
        System.out.println(p2.percentage);
    }
}

class pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(float phy, float chem, float math){
        percentage = (phy + chem + math) / 3;
    }

}