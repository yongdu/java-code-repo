package yong.du.keep.learning;

public class IsAllLowerCase implements ValidateStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
