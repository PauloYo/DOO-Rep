package singleton.factory;

import java.lang.reflect.*;

import singleton.models.Operadores;

// Aplicando o Singleton no Factory
public class Factory {

    private static Factory instance;
    public int value;

    private Factory() {
        // Construtor privado para impedir instâncias
    }

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public Operadores factory(String nome) {
        try {
            Object classeInstanciada = Class.forName("singleton.models." + nome).getDeclaredConstructor().newInstance();
            return (Operadores) classeInstanciada;
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            return null;
        }
    }
}
