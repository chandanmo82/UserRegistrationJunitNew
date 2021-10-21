package com.bridgelabz.userregistrationjunit;


import org.junit.Assert ;
import org.junit.Test;
import com.bridgelabz.userregistrationjunit.UserValidation;

public class UserValidationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){

        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateName.validate("Ashika");
        Assert.assertTrue(isValid);

    }

    @Test
    public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse(){

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName.validate("ashika");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenFirstName_WhenLesserThanThreeCharacters_ShouldReturnFalse(){

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName.validate("As");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenFirstName_WhenNull_ShouldReturnFalse(){

        UserValidation userValidator = new UserValidation();
        try {
            userValidator.validateName.validate(null);
        }
        catch(UserValidationException e){
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL,e.type);
        }

    }

    @Test
    public void givenFirstName_WhenEmpty_ShouldReturnFalse(){

        UserValidation userValidator = new UserValidation();
        try {
            userValidator.validateName.validate("");
        }
        catch(UserValidationException e){
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY,e.type);
        }

    }

    @Test
    public void givenFirstName_WhenNumericCharatersArePresent_ShouldReturnFalse(){

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName.validate("Asjsak23");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenFirstName_WhenSpecialCharatersArePresent_ShouldReturnFalse(){

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName.validate("Asjsak@^");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){

        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateName.validate("Chadaga");
        Assert.assertTrue(isValid);

    }

    @Test
    public void givenLastName_WhenFirstLetterIsSmall_ShouldReturnFalse(){

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName.validate("chadaga");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenLastName_WhenLesserThanThreeCharacters_ShouldReturnFalse(){

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName.validate("Ch");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenLastName_WhenNull_ShouldReturnFalse(){

        UserValidation userValidator = new UserValidation();
        try {
            userValidator.validateName.validate(null);
        }
        catch(UserValidationException e){
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL,e.type);
        }

    }

    @Test
    public void givenLastName_WhenEmpty_ShouldReturnFalse(){

        UserValidation userValidator = new UserValidation();
        try {
            userValidator.validateName.validate("");
        }
        catch(UserValidationException e){
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY,e.type);
        }

    }

    @Test
    public void givenLastName_WhenNumericCharatersArePresent_ShouldReturnFalse(){

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName.validate("Chadag19");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenLastName_WhenSpecialCharatersArePresent_ShouldReturnFalse(){

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName.validate("Ch@d@ga%");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenEmailAddress_WhenProper_ShouldReturnTrue(){

        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateEmail.validate("ashikachadaga@gmail.com");
        Assert.assertTrue(isValid);

    }

    @Test
    public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateEmail.validate("abc()*@gmail.com");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenEmailAddress_WhenNull_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        try {
            userValidator.validateEmail.validate(null);
        }
        catch(UserValidationException e){
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL,e.type);
        }

    }

    @Test
    public void givenEmailAddress_WhenEmpty_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        try {
            userValidator.validateEmail.validate("");
        }
        catch(UserValidationException e){
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY,e.type);
        }

    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){

        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateMobileNumber.validate("91 9485736453");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateMobileNumber.validate("919485736453");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenMobileNumber_WhenNumberLessThanTenDigits_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateMobileNumber.validate("91 5736453");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenMobileNumber_WhenNull_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        try {
            userValidator.validateMobileNumber.validate(null);
        }
        catch(UserValidationException e){
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL,e.type);
        }

    }

    @Test
    public void givenMobileNumber_WhenEmpty_ShouldReturnFalse(){

        UserValidation userValidator = new UserValidation();
        try {
            userValidator.validateMobileNumber.validate("");
        }
        catch(UserValidationException e){
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY,e.type);
        }

    }

    @Test
    public void givenMobileNumber_WhenCharatersArePresent_ShouldReturnFalse(){

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateMobileNumber.validate("9a 948375053h");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenMobileNumber_WhenSpecialCharatersArePresent_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateMobileNumber.validate("#6 948375*535");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {

        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validatePassword.validate("AshikaCh@dag11");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenPassword_WhenNull_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        try {
            userValidator.validatePassword.validate(null);
        }
        catch(UserValidationException e){
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL,e.type);
        }

    }

    @Test
    public void givenPassword_WhenEmpty_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        try {
            userValidator.validatePassword.validate("");
        }
        catch(UserValidationException e){
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY,e.type);
        }

    }

    @Test
    public void givenPassword_WhenLessThanEightCharcters_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validatePassword.validate("sd@A12");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenPassword_WhenNoUpperCaseCharacter_ShouldReturnFalse(){

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validatePassword.validate("asjd23$df");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenPassword_WhenNoNumericalNumber_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validatePassword.validate("asjdAG$df");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenPassword_WhenMoreThanOneSpecialCharacter_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validatePassword.validate("asjd23^$df");
        Assert.assertFalse(isNotValid);
    }

}


