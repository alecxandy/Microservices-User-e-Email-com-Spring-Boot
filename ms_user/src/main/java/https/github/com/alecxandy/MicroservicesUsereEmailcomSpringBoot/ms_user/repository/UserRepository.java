package https.github.com.alecxandy.MicroservicesUsereEmailcomSpringBoot.ms_user.repository;

import https.github.com.alecxandy.MicroservicesUsereEmailcomSpringBoot.ms_user.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
