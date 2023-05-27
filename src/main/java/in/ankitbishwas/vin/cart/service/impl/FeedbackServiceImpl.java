package in.ankitbishwas.vin.cart.service.impl;

import in.ankitbishwas.vin.cart.model.Feedback;
import in.ankitbishwas.vin.cart.repository.FeedbackRepo;
import in.ankitbishwas.vin.cart.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class FeedbackServiceImpl implements FeedbackService
{

    @Autowired
    FeedbackRepo feedbackRepo;
    @Override
    public boolean like(boolean isLike) {
        return false;
    }

    @Override
    public boolean isNotLike(boolean isNotLike) {
        return false;
    }

    @Override
    public Feedback findById(long id) {
        Optional<Feedback> byId = feedbackRepo.findById(id);
        if(byId.isPresent()) return byId.get();

        return null;

    }

    @Override
    public List<Feedback> findAll() {
        return feedbackRepo.findAll();
    }

    @Override
    public void delete(long id) {
        feedbackRepo.deleteById(id);
    }

    @Override
    public Feedback save(Feedback feedback) {
        feedbackRepo.save(feedback);
        return feedback;
    }

    @Override
    public Feedback update(long id, Feedback feedback) {
        if (!feedbackRepo.existsById(id)) {
            this.save(feedback);
            return feedback;
        }
        feedback.setId(id);
        Feedback updatedFeedback = feedbackRepo.save(feedback);
        return updatedFeedback;
    }
}
