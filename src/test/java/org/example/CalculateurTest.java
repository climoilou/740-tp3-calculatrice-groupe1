package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculateurTest {
    @Test
    public void etantDonneUnPremierOperandeNulEtUnDeuxiemeOperandeNonPositif_QuandCalculerExponentiation_AlorsCalculImpossible() {
        // Acteurs
        int operande1Nul = 0;
        int operande2Nul = 0;
        int operande2Negatif = -4;
        Calculateur calculateur = new Calculateur();

        // Action
        Executable exponentiationPremierOperandeNulDeuxiemeNul = new Executable() {
            @Override
            public void execute() {
                calculateur.CalculerExponentiation(operande2Nul, operande2Negatif);
            }
        };
        Executable exponentiationPremierOperandeNulDeuxiemeNegatif = new Executable() {
            @Override
            public void execute() {
                calculateur.CalculerExponentiation(operande1Nul, operande2Negatif);
            }
        };

        // Assertion
        assertThrows(ArithmeticException.class, exponentiationPremierOperandeNulDeuxiemeNul); // Pour augmenter le niveau de confiance des tests (optionnel).
        assertThrows(ArithmeticException.class, exponentiationPremierOperandeNulDeuxiemeNegatif);
    }
}