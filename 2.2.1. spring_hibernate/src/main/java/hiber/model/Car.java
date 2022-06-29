package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "series")
    private int series;

    @Column(name = "model")
    private String model;

    public Car() {}

    public Car(int series, String model) {
        this.series = series;
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "usersCar: " +
                "series=" + series +
                ", model='" + model + '\'';
    }
}
