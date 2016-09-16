package request;

import lombok.Data;

@Data
public class UpdateCustomerRequest {
    private String id;
    private String userName;
    private String userEmail;
}
