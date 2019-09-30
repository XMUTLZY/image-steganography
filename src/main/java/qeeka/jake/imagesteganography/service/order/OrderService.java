package qeeka.jake.imagesteganography.service.order;

import qeeka.jake.imagesteganography.http.request.OrderDetailsRequest;
import qeeka.jake.imagesteganography.http.response.BaseResponse;
import qeeka.jake.imagesteganography.http.vo.order.Order;

public interface OrderService {
    BaseResponse generateImage(Order order);
    String payment(OrderDetailsRequest request);
}
