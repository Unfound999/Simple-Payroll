package UserManager;

import Users.*;

public class UserManager {
    
    public static void spendPaycheck(RegUser user) {
        user.setWallet((user.getWallet() - 500));
    } //  ends spendPaycheck method
} //  ends UserManager class