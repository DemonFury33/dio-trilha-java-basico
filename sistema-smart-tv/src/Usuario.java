public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();
        System.out.println("O canal atual é: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("O canal atual é: " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("O volume atual é: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> A TV está ligada? " + smartTv.ligada);

    }
}
