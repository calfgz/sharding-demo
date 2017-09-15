package io.github.calfgz.model;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author calf
 * @create 2017-09-14 15:50
 */
@Data
@Table(name = "sc_user")
public class User implements Serializable{
    private static final long serialVersionUID = -6356423424942543731L;

    @Id
    long id;
    String name;
    int sex;
}
