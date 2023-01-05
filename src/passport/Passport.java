package passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {

    private int number;
    private String surname;
    private String firstName;
    private String patronymic;
    private final LocalDate dateOfBirth;

    public Passport(int number, String surname, String firstName, LocalDate dateOfBirth) {
        setNumber(number);
        setSurname(surname);
        setFirstName(firstName);
        if (dateOfBirth.isAfter(LocalDate.now().minusYears(16))) {
            throw new IllegalArgumentException("Паспорт можно получить с шестнадцати лет");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public Passport(int number, String surname, String firstName, String patronymic, LocalDate dateOfBirth) {
        setNumber(number);
        setSurname(surname);
        setFirstName(firstName);
        setPatronymic(patronymic);
        if (dateOfBirth.isAfter(LocalDate.now().minusYears(16))) {
            throw new IllegalArgumentException("Паспорт можно получить с шестнадцати лет");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number < 100_000 || number > 999_999) {
            throw new IllegalArgumentException("Номер паспорта должен состоять из шести цифр");
        }
        this.number = number;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (StringUtils.isNullOrEmptyOrBlank(surname)) {
            surname = "не указано";
        }
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (StringUtils.isNullOrEmptyOrBlank(firstName)) {
            firstName = "не указано";
        }
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        if (StringUtils.isNullOrEmptyOrBlank(patronymic)) {
            surname = "отсуствует";
        }
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
