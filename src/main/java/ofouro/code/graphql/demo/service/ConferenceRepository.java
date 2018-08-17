package ofouro.code.graphql.demo.service;

import ofouro.code.graphql.demo.model.Conference;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConferenceRepository extends PagingAndSortingRepository<Conference, Long> {

    Conference findByName(String name);

    List<Conference> findAll();

}
