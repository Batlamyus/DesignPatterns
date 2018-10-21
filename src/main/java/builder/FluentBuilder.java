package builder;

public class FluentBuilder {

    private Car car;
    private Mark mark;
    private Model model;
    private String color;
    private String ps;

    public static FluentBuilder startBuilding(){
        return new FluentBuilder();
    }

    public FluentBuilder setCar(Car car) {
        this.car = car;
        return this;
    }

    public FluentBuilder setMark(Mark mark) {
        this.mark = mark;
        return this;
    }

    public FluentBuilder setModel(Model model) {
        this.model = model;
        return this;
    }

    public FluentBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public FluentBuilder setPs(String ps) {
        this.ps = ps;
        return this;
    }

    public Car build(){
        car = new Car();
        car.setMark(this.mark);
        car.setModel(this.model);
        car.setColor(this.color);
        car.setPs(this.ps);
        return car;
    }

}
