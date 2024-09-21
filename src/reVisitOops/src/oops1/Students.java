package oops1;

public class Students {
    private static int numOfStudent ;    //  since number of student is not the property of
    // student rather it may be of any batch , so lets keep this as static
   private String name ;
   private int roll_num;
   public Students(String name, int roll_num){
       this.name = name;
       this.roll_num = roll_num;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_num() {
        return roll_num;
    }

    public void setRoll_num(int roll_num) {
        this.roll_num = roll_num;
    }
}


class student{
    public static void main(String[] args) {
        Students student1 = new Students("kuar", 4);
        System.out.println(student1.getRoll_num());
        student1.setName("pintu");
        student1.setName("3");

        System.out.println(student1.getName());
    }
}

