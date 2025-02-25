package com.dev.auth.service;

import com.dev.auth.dto.UserProfileTenantDTO;

import java.util.List;
import java.util.UUID;

public interface UserProfileTenantService {

    UserProfileTenantDTO createMapping(UserProfileTenantDTO dto);

    UserProfileTenantDTO getMappingById(UUID id);

    List<UserProfileTenantDTO> getAllMappings();

    List<UserProfileTenantDTO> getMappingsByTenantId(String tenantId);

    List<UserProfileTenantDTO> getMappingsByUserId(UUID userId);

    void deleteMapping(UUID id);
}
