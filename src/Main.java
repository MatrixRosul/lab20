
interface Shape {
    void draw();
}


class Circle implements Shape {
    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle in " + color.fill());
    }
}


class Rectangle implements Shape {
    private Color color;

    public Rectangle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle in " + color.fill());
    }
}


interface Color {
    String fill();
}


class RedColor implements Color {
    @Override
    public String fill() {
        return "Red color";
    }
}


class BlueColor implements Color {
    @Override
    public String fill() {
        return "Blue color";
    }
}


public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(new RedColor());
        Shape rectangle = new Rectangle(new BlueColor());

        circle.draw();
        rectangle.draw();
    }
}
