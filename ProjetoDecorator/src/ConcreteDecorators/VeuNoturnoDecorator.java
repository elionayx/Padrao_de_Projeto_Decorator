package ConcreteDecorators;

import BaseDecorator.PersonagemDecorator;
import Interface.Personagem;

public class VeuNoturnoDecorator extends PersonagemDecorator {

    public VeuNoturnoDecorator(Personagem personagem) {
        super(personagem);
    }

    @Override
    public String getDescricao() {
        return personagem.getDescricao() + "/ Habilidade Véu Noturno";
    }

    @Override
    public int getPoder() {
        return Math.max(0, personagem.getPoder() + 5);
    }
}
