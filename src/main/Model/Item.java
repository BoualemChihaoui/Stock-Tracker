import javax.xml.bind.annotation.XmlID;
import com.oracle.webservices.internal.api.databinding.DatabindingMode;

import jakarta.persistence.*;
import lombok.*;
@Entity 
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="items")

public class Item {
    @Id 
    @GenerateValue(strategy=GenerationType.IDENTITY)
    private  Long id;
    
    private String name;
    private String description;
    private int quantity;
    private double price;
    


}
