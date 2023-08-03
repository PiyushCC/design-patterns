package solid.live.dip;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DocWriter implements Writer {
    BufferedWriter bufferedWriter;

    public DocWriter(BufferedWriter bufferedWriter) {
        this.bufferedWriter = bufferedWriter;
    }

    @Override
    public void write(String str) {
        try {
            //BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt"));
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
