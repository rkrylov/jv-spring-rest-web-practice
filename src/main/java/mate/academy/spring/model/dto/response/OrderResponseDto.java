package mate.academy.spring.model.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import java.util.List;

public class OrderResponseDto {
    private Long id;
    private List<Long> ticketIds;
    @JsonFormat(pattern = "dd.MM.yyyy HH:mm")
    private LocalDateTime orderDate;
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getTicketIds() {
        return ticketIds;
    }

    public void setTicketIds(List<Long> ticketIds) {
        this.ticketIds = ticketIds;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "OrderResponseDto{"
                + "id=" + id
                + ", ticketIds=" + ticketIds
                + ", orderDate=" + orderDate
                + ", userId=" + userId
                + '}';
    }
}
