//java custome exception

class InvalidAgeExeption extends Exception{
    InvalidAgeExeption(String s){
        super (s);
    }

}
class TestCustomException1{
    static void validate(int age) throws InvalidAgeExeption{
        if (age<18)
        throw new InvalidAgeExeption("not valid");
        else
        System.out.println("Welcome to vote");
    }
    public static void 
}
