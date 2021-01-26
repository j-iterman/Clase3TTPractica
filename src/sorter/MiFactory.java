package sorter;

import java.io.FileInputStream;
import java.util.Properties;

public class MiFactory {

    private static String leerArchivo(String objName){

        Properties p = new Properties();

        try{
            FileInputStream reader = new FileInputStream("MiFactory.properties");

            p.load(reader);
        }

        catch (Exception e){
            e.printStackTrace();
        }

        return p.getProperty(objName);

    }

    public static Object getInstance(String objName) throws Exception{
        String metodoOrdenamiento = leerArchivo(objName);

        return Class.forName(metodoOrdenamiento).newInstance();
        /*Class.forName(propiedad).getDeclaredConstructor().newInstance()*/
    }
}
