package net.webfluxsecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponseDto {
    private long userId;
    private String token;
    private Date issuedAt;
    private Date expiresAt;
}
