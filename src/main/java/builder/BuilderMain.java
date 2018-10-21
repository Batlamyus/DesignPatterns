package builder;

public class BuilderMain {
    public static void main(String[] args) {
        Car car = FluentBuilder.startBuilding()
                .setModel(new Model())
                .setMark(new Mark())
                .setColor("Blue")
                .setPs("150")
                .build();

        System.out.println(car.getColor());
    }
}
