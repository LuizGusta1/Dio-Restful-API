package dio.Claro.RestfullAPI.Service;

import dio.Claro.RestfullAPI.Model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
