class Oops1_class_Methode {
public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        Student s1 = new Student();
        s1.calpersentage(1, 3, 8);
        System.out.println(s1.percentage);
    }

}

class Pen {
String color;
int tip;

void setcolor(String newcolor) {
color = newcolor;

// this.color = newcolor;
    }

void setTip(int newtip) {
    tip = newtip;

    // this.tip = newtip;
    }
}

class Student {
String name;
int age;
float percentage;

    void calpersentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }

}
