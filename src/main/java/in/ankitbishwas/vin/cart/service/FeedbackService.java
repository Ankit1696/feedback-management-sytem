package in.ankitbishwas.vin.cart.service;

import in.ankitbishwas.vin.cart.model.Feedback;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface FeedbackService {

    public void delete(long id);
    public Feedback save(Feedback feedback);
    public Feedback update(long id, Feedback feedback);
    public boolean like(boolean isLike);
    public boolean isNotLike(boolean isNotLike);

    public List<Feedback> findAll();

    Feedback findById(long id);
}
