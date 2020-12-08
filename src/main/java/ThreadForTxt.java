import javax.xml.bind.annotation.XmlElementWrapper;
import java.io.IOException;
import java.util.List;

public class ThreadForTxt implements Runnable{
    private List<Person> people;

    public ThreadForTxt(List<Person> people) {
        this.people = people;
        new Thread(this,"NewThread").start();
    }

    public void run() {
        try {
            ToFileWriter toFileWriter = new ToFileWriter();
            toFileWriter.writeToFile(people);
            System.out.println(Thread.currentThread()+" done his work.");
        }catch (IOException exception){
            System.out.println(exception.toString());
        }
    }
}
