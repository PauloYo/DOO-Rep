package top10calculadoras.factory;

import java.lang.reflect.*;
import top10calculadoras.models.Operadores;

public class Factory {

    public static Operadores factory(String nome) {
        try {
            Object classeInstanciada = Class.forName("top10calculadoras.models." + nome).getDeclaredConstructor().newInstance();
            return (Operadores) classeInstanciada;
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
