interface Pet{
    public void nome();
    public void especie();
    public void raca();
}

class petGato implements Pet {
    public void nome(){
        System.out.println("O nome do meu pet é Jefferson,");
    }
    public void especie(){
        System.out.println("Ele é um gato.");
    }
    public void raca(){
        System.out.println("A raça dele é 'Laranja'.");
    }
}