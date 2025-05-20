package BaseDecorator;

import Interface.Personagem;

public abstract class PersonagemDecorator implements Personagem {
    protected Personagem personagem;

    public PersonagemDecorator (Personagem personagem) {
        if (personagem == null) {
            throw new IllegalArgumentException("Personagem não pode ser nulo.");
        }
        this.personagem = personagem;
    }
}
