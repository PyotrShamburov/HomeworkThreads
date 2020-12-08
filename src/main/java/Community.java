import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "community")
public class Community {
    private List<Person> people = new ArrayList<Person>();

    public Community(List<Person> people) {
        this.people = people;
    }

    public Community() {
    }

    @XmlElementWrapper(name = "people")
    @XmlElement(name = "person")
    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Community: "+people+"people: ";
    }
}
