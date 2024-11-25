package com.campusdual.classroom;

public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {

        if (divisor == 0){
            throw  new DivisionByZeroException("No se puede dividir por cero");
        }

        return divisor / dividend;

    }

    public static void main(String[] args) {

    }
}
