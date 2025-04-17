import java.time.LocalDate;

public class CarrotSeller {
    private String name;
    private LocalDate birthDate;
    private int numberOfContracts;
    private double totalCarrotSold;
    private boolean isSeniorSeller;

    public CarrotSeller(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.numberOfContracts = 0;
        this.totalCarrotSold = 0.0;
        this.isSeniorSeller = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getNumberOfContracts() {
        return numberOfContracts;
    }

    public void setNumberOfContracts(int numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }

    public double getTotalCarrotSold() {
        return totalCarrotSold;
    }

    public void setTotalCarrotSold(double totalCarrotSold) {
        this.totalCarrotSold = totalCarrotSold;
    }

    public boolean isSeniorSeller() {
        return isSeniorSeller;
    }

    public void setSeniorSeller(boolean seniorSeller) {
        isSeniorSeller = seniorSeller;
    }
}
