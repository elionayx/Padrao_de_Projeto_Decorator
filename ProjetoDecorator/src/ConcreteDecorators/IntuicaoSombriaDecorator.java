package ConcreteDecorators;

import BaseDecorator.PersonagemDecorator;
import Interface.Personagem;

public class IntuicaoSombriaDecorator extends PersonagemDecorator {

    public IntuicaoSombriaDecorator(Personagem personagem) {
        super(personagem);
    }

    @Override
    public String getDescricao() {
        return personagem.getDescricao() + "/ Habilidade Intuição Sombria ";
    }

    @Override
    public int getPoder() {
        return Math.max(0, personagem.getPoder() + 15);
    }
}
