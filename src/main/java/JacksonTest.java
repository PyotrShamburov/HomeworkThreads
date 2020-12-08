import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonTest {
    public void convertToJson(Community people){
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("People.json"), people);
        }catch (IOException exception){
            System.out.println(exception.toString());
        }
    }
   /* public Community getFromJson(){
        Community people = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            people = mapper.readValue(new File("People.json"), Community.class);
        }catch (IOException exception){
            System.out.println(exception.toString());
        }
        return  people;
    }*/
}