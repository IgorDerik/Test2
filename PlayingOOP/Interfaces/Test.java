package PlayingOOP.Interfaces;

public class Test {

    public static void main(String[] args) {

        Component[] components = new Component[20];

        for (int i=0; i<20; i=i+2) {

            components[i] = new Asso();
            components[i+1] = new Event();

        }

        for (Component component : components) {

            System.out.println(component.getInfo());

        }

    }

}
