public class Hello {
    public static void main(String [] args){
        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I'm scared of Aliooons");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score dood");
        }


        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <=90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is trooooo");
        }

        boolean isCar = false;
        if(!isCar){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true;

        //Ternary Operator structure:
        //operand 1 ? operand 2 : operand 3
        //Test if operand 1 is true. If it is, it will return operand 2.
        //Otherwise, it will return operand 3.
        //First operand is always boolean, other two do not have to be.

        //Operand 1 true? Return operand 2 : Otherwise return 3.

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);
    }
}
