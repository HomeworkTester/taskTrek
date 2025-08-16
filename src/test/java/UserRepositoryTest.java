import org.example.TaskTrekApplication;
import org.example.model.Role;
import org.example.model.UserEntity;
import org.example.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = TaskTrekApplication.class)
@ActiveProfiles("test") // -> подключает application-test.yml
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void testSaveAndFindUser() {
        // given
        UserEntity user = new UserEntity();
        user.setUsername("testUser");
        user.setPassword("12345");
        user.setRole(Role.ADMIN);

        userRepository.save(user);

        // when
        var found = userRepository.findByUsername("testUser");

        // then
        assertThat(found).isPresent();
        assertThat(found.get().getUsername()).isEqualTo("testUser");
        assertThat(found.get().getPassword()).isEqualTo("12345");
    }
}
