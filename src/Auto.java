public class Auto {

    String marca;
    String model;
    double engineCapacity;
    String bodyColor;
    int yearOfProduction;
    String countryOfAssembly;

    public Auto(String marca, String model, double engineCapacity, String bodyColor, int yearOfProduction, String countryOfAssembly) {
        if(this.marca == null){
            this.marca = "default";
        }else{
            this.marca = marca;
        }

        if(this.model == null){
            this.model = "default";
        }else{
            this.model = model;
        }

        if(Double.compare(engineCapacity,0)==0){
            this.engineCapacity = 1.5;
        }else{
            this.engineCapacity = engineCapacity;
        }

        if(this.bodyColor == null){
            this.bodyColor = "белый";
        }else{
            this.bodyColor = bodyColor;
        }

        if(Integer.compare(yearOfProduction,0)==0){
            this.yearOfProduction = 2000;
        }else{
            this.yearOfProduction = yearOfProduction;
        }

        if(this.countryOfAssembly == null){
            this.countryOfAssembly = "default";
        }else{
            this.countryOfAssembly = countryOfAssembly;
        }
    }
}
