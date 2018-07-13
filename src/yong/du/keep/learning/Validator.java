package yong.du.keep.learning;

public class Validator {
    private final ValidateStrategy strategy;

    public Validator(ValidateStrategy v){
        this.strategy = v;
    }
    public boolean validate(String s){
        return strategy.execute(s);
    }

    public static  void main(String[] args){
        // old school way
        Validator numericValidator = new Validator(new IsNumeric());
        boolean b1 = numericValidator.validate("asas");
        System.out.println("Is this a numeric value: " + b1);

        Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
        boolean b2 = lowerCaseValidator.validate("boisamaster");
        System.out.println("Is this a lower case string: " + b2);

        // lambda way
        Validator v3 = new Validator((String s) -> s.matches("\\d+"));
        System.out.println("Is this a numeric value: " + v3.validate("aaaa"));
        Validator v4 = new Validator((String s) -> s.matches("[a-z]+"));
        System.out.println("Is this a lower case string: " + v4.validate("bbbb"));

    }
}
