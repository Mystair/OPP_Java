abstract class Animal {
    public abstract void onomatopeia();
    public void dorme() {
        System.out.println("zZz");
    }
    public void susto(){
        System.out.println("RaaaAAAAH!");
    }
}

class Gato extends Animal {
public void onomatopeia() {
    System.out.println("Miau, miau! e ronrona");
    }
}