package caminas.entity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class User {
    @Id
    //AUTO no funciona bien con SQLite porque intenta obtener el valor de una tabla de secuencias para cada tabla
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String password;
    public User(){

    }
    public User(String name) {
        this.name = name;
    }
    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return id + " - " + name;
    }

    //Necesario para que al fijar this.libraryCombo.setSelectedItem(this.book.getLibrary());
    //considere que es igual y lo seleccione
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User other = (User) obj;
        // Compare fields that uniquely identify a Library object
        return Objects.equals(this.id, other.id); // Assuming id is a unique identifier
    }
}
