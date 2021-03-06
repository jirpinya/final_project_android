package jirapinya58070014.kmitl.unify.test.nameTrip;

import jirapinya58070014.kmitl.unify.test.MyValidator;

public class ValidateNameTripEmpty implements MyValidator {

    @Override
    public boolean isValid(String name) {
        return "".equals(name.trim());
    }

    @Override
    public String getErrorMessage() {
        return "Fail! Name trip is empty.";
    }
}
