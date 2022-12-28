package dev.odprz.junit5app.ejemplos.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    public void TestNombre(){
        Cuenta cuenta = new Cuenta("Daniel",new BigDecimal("1234.1"));

        String expectPersona = "Daniel";
        BigDecimal expectedSaldo = new BigDecimal("1234.1");
        String obtenido = cuenta.getPersona();

        assertEquals(expectPersona,obtenido);
        assertTrue( expectedSaldo.equals(cuenta.getSaldo()));

    }

}