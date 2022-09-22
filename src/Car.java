public class Car {
    public static void main(String[] args) {
        Auto grande = new Auto("Lada", "Granta", 1.7,"Желтый", 2015, "Россия");
        //grande.marca = "Lada";
        //grande.engineCapacity = 1.7;
        //grande.bodyColor = "Желтый";
        //grande.yearOfProduction = 2015;
        //grande.countryOfAssembly = "Россия";
        //grande.model = "Granta";
        System.out.println("Марка авто "+grande.marca+", модель "+ grande.model+", год выпуска " + grande.yearOfProduction +
                ", страна сборки " +grande.countryOfAssembly+ ", цвет кузова " + grande.bodyColor + ", объем двигателя - " + grande.engineCapacity);

    }
}
