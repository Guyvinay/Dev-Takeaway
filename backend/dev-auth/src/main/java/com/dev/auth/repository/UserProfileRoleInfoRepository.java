package com.dev.auth.repository;
import com.dev.auth.entity.UserProfileRoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Repository interface for performing CRUD operations on UserProfileRoleInfoModel.
 * This interface extends JpaRepository to provide standard methods for interacting with the database.
 */

@Repository
public interface UserProfileRoleInfoRepository extends JpaRepository<UserProfileRoleModel, Long> {

    /**
     * Finds a list of UserProfileRoleInfoModel by the role ID.
     * @param roleId - The role ID.
     * @return List of UserProfileRoleInfoModel.
     */
    List<UserProfileRoleModel> findByRoleId(Long roleId);
}