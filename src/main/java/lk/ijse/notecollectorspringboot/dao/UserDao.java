package lk.ijse.notecollectorspringboot.dao;


import lk.ijse.notecollectorspringboot.entity.impl.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<UserEntity,String> {

    // email eka input kaloth mata user kenekva denna
    Optional<UserEntity> findByEmail(String email);
}
