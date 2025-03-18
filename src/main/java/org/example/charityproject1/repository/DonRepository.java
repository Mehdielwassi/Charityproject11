package org.example.charityproject1.repository;

import org.example.charityproject1.model.Campagne;
import org.example.charityproject1.model.Don;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DonRepository extends MongoRepository<Don, String> {
    

    List<Don> findByNomDonateur(String nomDonateur);
    

    List<Don> findByCampagne(Campagne campagne);
    
    List<Don> findByCampagneId(String campagneId);
    

    List<Don> findByDateBetween(Date startDate, Date endDate);
    

    List<Don> findByMontantGreaterThanEqual(float montant);
    

    List<Don> findTop10ByOrderByMontantDesc();
}