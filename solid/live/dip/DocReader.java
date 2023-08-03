package solid.live.dip;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DocReader implements Reader{
    BufferedReader bufferedReader;

    public DocReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    @Override
    public String read() {
        String str;
        try {

            StringBuilder stringBuilder = new StringBuilder();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }

            str = stringBuilder.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return str;
    }
}
