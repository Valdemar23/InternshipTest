package person.consciousness;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="knowledge")
public class Knowledge implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="level")
    private int level;

    public Knowledge(int level) {
        this.level=level;
        //TODO: Implementation is needed
    }

    public Knowledge(Knowledge knowledge) {
    }

    public int getLevel(){
        return level;
    }
}
