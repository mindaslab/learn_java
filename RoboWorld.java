/*
 * Program explaining about class attributes
 */

class Robot {

    String name; //attribute

    public void tellAboutYou() {
        System.out.println("Hello! I  am " + name);
    }
}

public class RoboWorld {

    public static void main(String[] args) {
        Robot robo = new Robot();
        robo.name = "R2D2";
        robo.tellAboutYou();
    }
}
