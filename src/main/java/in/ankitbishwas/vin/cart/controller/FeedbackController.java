package in.ankitbishwas.vin.cart.controller;


import in.ankitbishwas.vin.cart.model.Feedback;
import in.ankitbishwas.vin.cart.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FeedbackController {




 @Autowired
 private  FeedbackService feedbackService;

 @GetMapping("/all")
 public List<Feedback> getAllFeedback() {
  return feedbackService.findAll();
 }

 @GetMapping("get-feedback/{id}")
 public ResponseEntity<Feedback> getFeedbackById(@PathVariable("id") Long id) {
  Feedback feedback = feedbackService.findById(id);
  if (feedback == null) {
   return ResponseEntity.notFound().build();
  }
  return ResponseEntity.ok(feedback);
 }

 @PostMapping("save")
 public ResponseEntity<Feedback> createFeedback(@RequestBody Feedback feedback) {
  Feedback createdFeedback = feedbackService.save(feedback);
  return ResponseEntity.status(HttpStatus.CREATED).body(createdFeedback);
 }

 @PutMapping("update/{id}")
 public ResponseEntity<Feedback> updateFeedback(@PathVariable("id") Long id, @RequestBody Feedback feedback) {

  Feedback update = feedbackService.update(id, feedback);
  return ResponseEntity.ok(update);
 }

 @DeleteMapping("delete/{id}")
 public ResponseEntity<Void> deleteFeedback(@PathVariable("id") Long id) {

  feedbackService.delete(id);
  return ResponseEntity.noContent().build();
 }

@GetMapping("live-and-dislik/{id}/{likeDeslike}")
 public ResponseEntity like(@PathVariable("id") Long id, @PathVariable("id") Boolean likeDeslike){
 Feedback feedback = feedbackService.findById(id);
 feedback.setLike(likeDeslike);
 feedbackService.save(feedback);
  return ResponseEntity.noContent().build();
}





}
