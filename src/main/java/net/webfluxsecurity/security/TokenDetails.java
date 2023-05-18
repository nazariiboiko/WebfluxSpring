package net.webfluxsecurity.security;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class TokenDetails {
    private Long userId;
    private String token;
    private Date issuedAt;
    private Date expiresAt;
}
