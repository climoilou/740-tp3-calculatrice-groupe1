package org.example;

public class Calculateur {
    public int calculerExponentiation(int operande1, int operande2)
    {
        int resultat;

        if (operande1 == 0 && operande2 <= 0)
        {
            resultat = -operande2 / operande1;
        }
        else
        {
            resultat = (int)Math.pow(operande1, operande2);
        }

        return resultat;
    }
}
