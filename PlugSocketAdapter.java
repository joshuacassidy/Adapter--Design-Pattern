import PlugSocketType.PlugSocketType;
import PlugSocketType.SocketTypeE;
import PlugSocketType.SocketTypeF;
import PlugSocketType.SocketTypeG;

public class PlugSocketAdapter implements PlugSocket {

    PlugSocketType plugSocketType;

    public PlugSocketAdapter(String audioType){

        if(audioType.equalsIgnoreCase("typee") ){
            plugSocketType = new SocketTypeE();
        }else if (audioType.equalsIgnoreCase("typef")){
            plugSocketType = new SocketTypeF();
        } else if (audioType.equalsIgnoreCase("typeg")){
            plugSocketType = new SocketTypeG();
        }
    }

    @Override
    public void plugIn(String socketType) {

        if(socketType.equalsIgnoreCase("typee")){
            plugSocketType.plugInSocketTypeE(socketType);
        } else if(socketType.equalsIgnoreCase("typef")){
            plugSocketType.plugInSocketTypeF(socketType);
        } else if(socketType.equalsIgnoreCase("typeg")){
            plugSocketType.plugInSocketTypeG(socketType);
        }
    }

}
