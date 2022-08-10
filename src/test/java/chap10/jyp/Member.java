package chap10.jyp;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public class Member {

    private LocalDateTime expiryDate;

    public boolean isExpired(){
        return expiryDate.isBefore(LocalDateTime.now());
    }

    public boolean passedExpiryDate(LocalDateTime time){
        return expiryDate.isBefore(time);
    }

}
