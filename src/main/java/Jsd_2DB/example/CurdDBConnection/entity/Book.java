package Jsd_2DB.example.CurdDBConnection.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int Bookid;

    String bookIssueDate;
    String bookReturnDate;

    String BookName;
    String BookGenre;

    @ManyToOne
    @JoinColumn
    private  Card card;




}
