package com.home.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaltInfoRepository extends JpaRepository<SaltInfoDO, Long> {
    SaltInfoDO findByUserUidAndActiveInd(Long userUid, String activeInd);
    // Optional: Custom query methods specific to SaltInfo entity
}