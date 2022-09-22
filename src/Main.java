public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;


        Human maksim = new Human(35,"Максим","Минск", "бренд-менеджера");
        //maksim.name = "Максим";
        //maksim.yearOfBirth = 35;
        //maksim.town = "Минск";
        //maksim.incarico = "бренд-менеджера";

        Human anya = new Human(29, "Аня", "Москва", "методиста образовательных программ");
        //anya.name = "Аня";
        //anya.yearOfBirth = 29;
        //anya.town = "Москва";
        //anya.incarico = "методиста образовательных программ";

        Human katya = new Human(28, "Катя", "Калининград", "продакт-менеджера");
        //katya.name = "Катя";
        //katya.yearOfBirth = 28;
        //katya.town = "Калининград";
        //katya.incarico = "продакт-менеджера";

        Human artem = new Human(27, "Артем","Москва", "диретора по развитию бтзнеса"  );
        //artem.name = "Артем";
        //artem.yearOfBirth = 27;
        //artem.town = "Москва";
        //artem.incarico = "диретора по развитию бтзнеса";


        System.out.println(" Привет! Меня зовут "+ maksim.name +". Я из города "+ maksim.town +". " +
                "Я родился в " + (currentYear - maksim.yearOfBirth) + " году. Я работаю на должности "+ maksim.incarico +". Будем знакомы!");

        System.out.println(" Привет! Меня зовут " + anya.name + ". Я из города " + anya.town + ". " +
                "Я родился в " + (currentYear - anya.yearOfBirth) + " году. Я работаю на должност "+ anya.incarico +". Будем знакомы!");

        System.out.println(" Привет! Меня зовут " + katya.name + ". Я из города " + katya.town + ". " +
                "Я родился в " + (currentYear - katya.yearOfBirth) + " году. Я работаю на должности "+ katya.incarico +". Будем знакомы!");

        System.out.println(" Привет! Меня зовут " + artem.name + ". Я из города " + artem.town + ". " +
                "Я родился в " + (currentYear - artem.yearOfBirth) + " году. Я работаю на должности "+ artem.incarico +". Будем знакомы!");

    }
}