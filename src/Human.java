public class Human {


    int yearOfBirth;
    String name;
    String town;

    String incarico;

    public Human(int yearOfBirth, String name, String town, String incarico) {
        if(yearOfBirth < 0){
            this.yearOfBirth = 0;
        }else {
            this.yearOfBirth = yearOfBirth;
        }

        if(this.name == null){
            this.name = "Информация не указана";
        }else{
            this.name =name;
        }
        if(this.town == null){
            this.town = "Информация не указана";
        }else{
            this.town = town;
        }

        if(this.incarico == null){
            this.incarico = "Информация не указана";
        }else{
            this.incarico = incarico;
        }
    }
}



