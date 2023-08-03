package solid.live.dip;

import java.io.*;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        DocReader beforeEncryptionReader = new DocReader(new BufferedReader(new FileReader("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt")));
        DocWriter afterEncryptionWriter = new DocWriter(new BufferedWriter(new FileWriter("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt")));

        EncodingModule.encode(beforeEncryptionReader, afterEncryptionWriter);

        URLReader firstappReader = new URLReader(new URL("http", "myfirstappwith.appspot.com", "index.html"));
        DatabaseWriter dbWriter = new DatabaseWriter(new MyDatabase());

        EncodingModule.encode(firstappReader, dbWriter);

    }
}
