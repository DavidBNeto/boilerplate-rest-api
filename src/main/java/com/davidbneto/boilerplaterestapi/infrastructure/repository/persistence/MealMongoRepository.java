package com.davidbneto.boilerplaterestapi.infrastructure.repository.persistence;

import com.davidbneto.boilerplaterestapi.infrastructure.data.MealDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealMongoRepository extends MongoRepository<MealDocument, String> {

}
