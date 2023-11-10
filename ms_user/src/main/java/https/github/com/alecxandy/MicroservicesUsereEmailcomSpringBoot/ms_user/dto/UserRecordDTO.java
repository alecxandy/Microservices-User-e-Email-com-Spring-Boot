package https.github.com.alecxandy.MicroservicesUsereEmailcomSpringBoot.ms_user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRecordDTO(@NotBlank String name, @NotBlank @Email String email) {
}
