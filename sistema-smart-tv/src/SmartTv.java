public class SmartTv{
    boolean onOff = false;
    int canal = 1;
    int volume = 1;

    public void ligar(){
        onOff = true;
    }
    public void desligar(){
        onOff = false;
    }
    public void aumentar(){
        volume++;
    }
    public void diminuir(){
        volume--;
    }
    public void aumentarCanal(){
        canal++;
        }
    public void diminuirCanal(){
        canal--;
    
        }
    public void mudarCanal(int num){
        canal = num;
    }
    
}

