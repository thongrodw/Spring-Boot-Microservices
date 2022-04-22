package com.example.ec.explorecali.repository;

import com.example.ec.explorecali.domain.Tour;
import com.example.ec.explorecali.domain.TourRating;
import com.example.ec.explorecali.domain.TourRatingPk;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TourRatingRepository extends CrudRepository<TourRating, TourRatingPk> {

    List<TourRating> findByPkTourId(Integer tourId);

    Optional<TourRating> findByPkTourIdAndPkCustomerId(Integer tourId, Integer customerId);

}
