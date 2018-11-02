package PlugSocketType;

public class SocketTypeG implements PlugSocketType {
    @Override
    public void plugInSocketTypeE(String socketType) {

    }

    @Override
    public void plugInSocketTypeF(String socketType) {

    }

    @Override
    public void plugInSocketTypeG(String socketType) {
        System.out.println("Device Plugged in with socket socketType: " + socketType);
    }
}
