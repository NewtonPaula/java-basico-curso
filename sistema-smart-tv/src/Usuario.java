public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.mudarCanal(14);
        System.out.println("Estado atual da tv: " + smartTv.onOff);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Estado atual da tv: " + smartTv.onOff);
        smartTv.desligar();
        System.out.println("Estado atual da tv: " + smartTv.onOff);
        smartTv.aumentar();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.diminuir();
        System.out.println("Volume atual: " + smartTv.volume);
    }
}
