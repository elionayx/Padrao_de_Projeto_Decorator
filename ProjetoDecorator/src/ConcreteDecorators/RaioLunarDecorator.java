package ConcreteDecorators;

import BaseDecorator.PersonagemDecorator;
import Interface.Personagem;

public class RaioLunarDecorator extends PersonagemDecorator {

    public RaioLunarDecorator(Personagem personagem) {
        super(personagem);
    }

    @Override
    public String getDescricao() {
        return personagem.getDescricao() + " Habilidade Raio Lunar ";
    }

    @Override
    public int getPoder() {
        return Math.max(0, personagem.getPoder() + 15);
    }
}
