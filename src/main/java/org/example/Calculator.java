package org.example;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Calculator <T> {
    private T value;
    public double sum(List<? extends Number> numberList){
        double sum = 0;
        for (Number number : numberList) {
            sum += number.doubleValue();
        }
        return sum;
    }
    public double division(List<? extends Number> numberList){
        double sum = sum(numberList);
        return sum / numberList.size();
    }
    public double multiply(List<? extends Number> numberList) {
        double result = 1;
        for (Number number : numberList) {
            result *= number.doubleValue();
        }
        return result;
    }

    public String binaryConversion() {
        if (value instanceof Integer) {
            return Integer.toBinaryString((Integer) value);
        } else if (value instanceof String) {
            int intValue = Integer.parseInt((String) value);
            return Integer.toBinaryString(intValue);
        } else if (value instanceof Double || value instanceof Float) {
            assert value instanceof Double;
            int intValue = (int) Math.round((Double) value);
            return Integer.toBinaryString(intValue);
        } else {
            throw new IllegalArgumentException("Unsupported type: " + value.getClass().getSimpleName());
        }
    }
}
