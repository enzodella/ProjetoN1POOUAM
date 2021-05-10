public abstract class Monstros {
    protected String nome[] = new String[6];
    protected String elemento[] = new String[6];
    protected int vida[] = new int[6];
    protected int forca[] = new int[6];
    protected int defesa[] = new int[6];
    protected int velocidade[] = new int[6];

    protected Monstros(){
        String name[] = new String[]{"Oshuo", "Elco", "Nurion","Plilu", "Cisur","Cubaytou"};
        this.nome = name;
        String element[] = new String[]{"Fogo", "Grama", "Agua","Luz", "Gelo","Escuridao"};
        this.elemento = element;
        int health[] = new int[]{110, 110, 90, 90, 100, 90};
        this.vida = health;
        int strength[] = new int[]{50, 60, 50, 50, 50, 40};
        this.forca = strength;
        int defense[] = new int[]{15, 15, 10, 10, 10, 10};
        this.defesa = defense;
        int velocity[] = new int[]{20, 15, 25, 30, 15, 30};
        this.velocidade = velocity;
    }
}
