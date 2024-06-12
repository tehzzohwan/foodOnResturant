import com.food.on.CheckOutOrder;
import com.food.on.DeliverOrder;
import com.food.on.PlaceOrder;
import com.food.on.Registration;

public class Main {
    public static void main(String[] args) {
        Registration.registerUser();
        PlaceOrder.selectOrder();
        CheckOutOrder.reviewOrder();
        DeliverOrder.confirmAddress();
    }

}
