public class PowerSupply implements PlugSocket {

    PlugSocketAdapter plugSocketAdapter;

    @Override
    public void plugIn(String socketType) {
        if(socketType.equalsIgnoreCase("typee") || socketType.equalsIgnoreCase("typef")
                || socketType.equalsIgnoreCase("typeg")){
            plugSocketAdapter = new PlugSocketAdapter(socketType);
            plugSocketAdapter.plugIn(socketType);
        } else{
            System.out.println("Error no adapter found for invalid socket type: " + socketType);
        }
    }
}
