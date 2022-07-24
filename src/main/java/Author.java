
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Author {
    private long id;

    private String name;
    private Integer age;
    private String intro;
    private List<Book> book;

}
