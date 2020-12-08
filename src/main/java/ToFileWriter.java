import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class ToFileWriter {
    public void writeToFile(List<Person> p) throws IOException {
        FileWriter fileWriter = new FileWriter("People.txt");
        try {
            Iterator<Person> iterator = p.iterator();
            while (iterator.hasNext()){
                fileWriter.write(iterator.next().toString()+"\n");
            }
        }catch (IOException exception){
            System.out.println(exception.toString());
        }
        finally {
            fileWriter.close();
        }
    }
}
