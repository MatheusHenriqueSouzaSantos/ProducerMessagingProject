package user;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserModel> findAll() {
        return List.of();
    }

    @Override
    public UserModel findById(UUID id) {
        return null;
    }

    @Override
    public UserModel create(UserInputDto dto) {
        return null;
    }

    @Override
    public UserModel update(UUID id, UserInputDto dto) {
        return null;
    }

    @Override
    public void deActivate(UUID id) {

    }
}
