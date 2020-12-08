import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class JaxbTest {
    public void writeToXml(Community people){
        try {
            JAXBContext context = JAXBContext.newInstance(Community.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
            marshaller.marshal(people,new File("People.xml"));
        }catch (JAXBException exception){
            System.out.println(exception.toString());
        }
    }
    /*public Community readAndCreateNewObject(){
        Community people = null;
        try {
            JAXBContext context = JAXBContext.newInstance(Community.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            people = (Community) unmarshaller.unmarshal(new File("People.xml"));
        }catch (JAXBException exception){
            System.out.println(exception.toString());
        }
        return people;
    }*/
}