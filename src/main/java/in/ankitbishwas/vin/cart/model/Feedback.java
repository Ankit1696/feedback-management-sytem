package in.ankitbishwas.vin.cart.model;

import lombok.Getter;
import lombok.Setter;


public class Feedback {

    @Getter@Setter
    private long id;
    @Getter@Setter
    private String title;
    @Getter@Setter
    private String description;

    @Getter@Setter
    private boolean like;
    @Setter@Getter
    private String screenshotUrl;
    @Getter@Setter
    private String submitterName;
    @Getter@Setter
    private String submitterEmail;
}
