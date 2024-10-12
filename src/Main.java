//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
        int age = 18;
        if (age >= 18){
            System.out.println("Вам 18 или более лет.");
        }
        else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно еще немного подождать.");
        }

        //2
        int temperature = -15;
        if (temperature < 5){
            System.out.println("На улице холодно, нужно надеть шапку.");
        }
        else{
            System.out.println("Сегодня тепло, можно идти без шапки.");
        }

        //3
        int speed = 20;
        if (speed > 60){
            System.out.println("Если скорость "+speed+", то придется заплатить штраф.");
        }
        else{
            System.out.println("Если скорость "+speed+", то можно ездить спокойно.");
        }

        //4
        if (age>=2&&age<=6){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад.");

        }
        if (age>=7&&age<=17){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить ходить в школу.");
        }
        if (age>=18&&age<=24){
            System.out.println("Если возраст человека равен "+age+", то его место в университете.");
        }
        else {
            System.out.println("Если возраст человека равен "+age+", то ему ему пора ходить на работу.");
        }

        //5
        if (age<=5){
            System.out.println("Если возраст ребенка равен "+age+", то ему нельзя кататься на аттракционе.");

        }
        if (age>5&&age<14){
            System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе в сопровождении.");
        }
        else {
            System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        //6
        int trainCapacity = 102;
        int sittingPlaces = 60;
        int otherPlaces =  trainCapacity-sittingPlaces;
        int passengers = 38;

        if (passengers<=102){
            if (passengers<60){
                int freeSittingPlaces=60-passengers;
                System.out.println("В вагоне "+freeSittingPlaces+ " сидячих и "+otherPlaces +" стоячих места.");
            }
            else {
                int freeOtherPlaces= 102-passengers;
                System.out.println("В вагоне "+freeOtherPlaces+" стоячих мест.");
            }
        }
        else {
            System.out.println("В вагоне мест нет.");
        }

        //7
        int one=5000;
        int two=16;
        int three=99;
        //вар1
        if (one>two){
            if (one>three){
                System.out.println("Число "+one+" - большее из трех.");
            }
            else{
                System.out.println("Число "+three+" - большее из трех.");
            }
        }
        else{
            if (two>three){
                System.out.println("Число "+two+" - большее из трех.");
            }
            else{
                System.out.println("Число "+three+" - большее из трех.");
            }
        }
        //вар2
        if (one>two&&one>three){
            System.out.println("Число "+one+" - большее из трех.");
        }
        if (two>three&&two>one){
            System.out.println("Число "+two+" - большее из трех.");
        }
        if (three>two&&three>one){
            System.out.println("Число "+three+" - большее из трех.");
        }
    }
}