package top10calculadoras.factory;

import java.lang.reflect.*;
import top10calculadoras.models.Operadores;

public class Factory {

    Object classeInstanciada;

    public Operadores factory(String nome) {
        try {
            classeInstanciada = Class.forName("top10calculadoras.models." + nome).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.out.println("Deu ruim, se vira ae!");
        }
    }
}
