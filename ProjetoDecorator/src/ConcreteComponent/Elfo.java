package ConcreteComponent;

import Interface.Personagem;

public class Elfo implements Personagem {

    @Override
    public String getDescricao() {
        return "Elfo -";
    }

    @Override
    public int getPoder() {
        return 25;
    }
}
