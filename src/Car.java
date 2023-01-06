public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car (String brand, String model, String color, String country, double engineVolume, int year) {
        if (brand==null || brand == "" || model==null || model=="" || country == null || country == "") {
                this.brand = "default";
                this.model = "default";
                this.country = "default";
        } else {
            this.brand = brand;
            this.model = model;
            this.country = country;
        }
        if (color == null || color == "") {
            this.color = "белый";
        } else {
        this.color = color;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (year <=0) {
            this.year = 2000;
        } else {
        this.year = year;}
    }

    void characteristics () {
        System.out.println("Марка автомобиля: " + brand + ". Модель: " + model + ". Объем двигателя: " + engineVolume + " л. Цвет кузова: " + color + ". Год производства: " + year + ". Страна сборки: " + country + ". " );
    }
}
