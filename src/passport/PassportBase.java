package passport;

import java.util.HashMap;
import java.util.Map;

public class PassportBase {

     private Map<Integer,Passport> passportBase = new HashMap<>();

    public void createNewPassport(Passport passport) {
        passportBase.put(passport.getNumber(),passport);
    }

    public Passport getPassport(int number) {
        return passportBase.get(number);
    }
}
