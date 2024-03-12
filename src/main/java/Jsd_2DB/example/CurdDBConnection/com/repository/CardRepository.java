package Jsd_2DB.example.CurdDBConnection.com.repository;

import Jsd_2DB.example.CurdDBConnection.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {
}
