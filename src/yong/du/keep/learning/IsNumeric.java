package yong.du.keep.learning;

public class IsNumeric implements ValidateStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}
