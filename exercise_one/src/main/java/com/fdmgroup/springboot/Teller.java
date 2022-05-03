package com.fdmgroup.springboot;

public class Teller {
    private AccountRepository accountRepository;
    private UserRepository userRepository;
    private UserAccountRepository userAccountRepository;

    public Teller() {
        this.accountRepository = new AccountRepository();
        this.userRepository = new UserRepository();
        this.userAccountRepository = new UserAccountRepository();
    }

    public Teller(AccountRepository accountRepository, UserRepository userRepository,
            UserAccountRepository userAccountRepository) {
        this.accountRepository = accountRepository;
        this.userRepository = userRepository;
        this.userAccountRepository = userAccountRepository;
    }

    public AccountRepository getAccountRepository() {
        return accountRepository;
    }

    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserAccountRepository getUserAccountRepository() {
        return userAccountRepository;
    }

    public void setUserAccountRepository(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    public void addUser(User user) {
        userRepository.addUser(user);
    }

    public void addAccount(Account account) {
        accountRepository.addAccount(account);
    }

    public void addUserAndAccount(User user, Account account) {
        userAccountRepository.addUserAndAccount(user, account);
    }

    @Override
    public String toString() {
        return "Teller [accountRepository=" + accountRepository + ", userAccountRepository=" + userAccountRepository
                + ", userRepository=" + userRepository + "]";
    }

}
