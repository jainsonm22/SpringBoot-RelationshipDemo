package Jsd_2DB.example.CurdDBConnection.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "LiberaryCard")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int cardId;

    String issueDate;
    String expriyDate;
    //Find who is the parent  child class will have
    // the foreign key of the parent class through which it connect to the other table
    @OneToOne //is the type of mapping
    @JoinColumn// add foregin key column  --> define the parent class column name ,
    // by defult primary key colum become your foregin key
    Student student;



}
