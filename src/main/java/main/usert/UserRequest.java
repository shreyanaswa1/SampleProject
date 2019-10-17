package main.usert;

import javax.persistence.*;

@Entity
@Table(name="timestamp")
public class UserRequest {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column
    private int time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
