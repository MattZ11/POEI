package poe.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class TestPoeType {

    @Test
    void testLitteralPOEI(){
        PoeType poeType = PoeType.POEI; // dans la variable PoeType du type enum poeType, j'injecte la possibilité POEI de la classe PoeType
        System.out.println(poeType);
    }

    @ParameterizedTest
    @EnumSource(PoeType.class) //utilité ?
    void testAllLiterals(PoeType poeType){
        System.out.println(poeType);
    }

}