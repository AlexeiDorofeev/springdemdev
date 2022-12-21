package service;

import database.repository.CompanyRepository;
import database.repository.UserRepository;

public class UserService {
    private final CompanyRepository companyRepository;
    private final UserRepository userRepository;

    public UserService(CompanyRepository companyRepository, UserRepository userRepository) {
        this.companyRepository = companyRepository;
        this.userRepository = userRepository;
    }
}



