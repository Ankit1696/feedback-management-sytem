package in.ankitbishwas.vin.cart.repository;

import in.ankitbishwas.vin.cart.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback,Long> {
}
