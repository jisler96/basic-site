package com.home.service;

import com.home.data.SaltInfoDO;
import com.home.data.SaltInfoRepository;
import com.home.data.UserDO;
import com.home.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.SecureRandom;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final SaltInfoRepository saltInfoRepository;

    @Autowired
    public UserService(UserRepository userRepository, SaltInfoRepository saltInfoRepository) {
        this.userRepository = userRepository;
        this.saltInfoRepository = saltInfoRepository;
    }

    public void saveUser(UserDO user) {
         userRepository.save(user);
    }

    public void saveSalt(SaltInfoDO saltInfoDO){
            saltInfoRepository.save(saltInfoDO);
    }

    public UserDO getUser(String userName){
        UserDO user = userRepository.findByUsername(userName);
        return user;
    }

    public SaltInfoDO getSaltInfo(Long userUid, String activeInd){
        SaltInfoDO saltInfoDO = saltInfoRepository.findByUserUidAndActiveInd(userUid, activeInd);
        return saltInfoDO;
    }

    @ Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // Consider using a stronger algorithm like Argon2
    }

    public static String generateRandomSalt() {
        // Use a secure random number generator
        SecureRandom random = new SecureRandom();
        // Generate random bytes of a specific length (e.g., 16 bytes for 128-bit salt)
        byte[] saltBytes = new byte[16];
        random.nextBytes(saltBytes);
        // Encode bytes to a hex string for storage (consider using Base64)
        return new BigInteger(1, saltBytes).toString(16);
    }
}
