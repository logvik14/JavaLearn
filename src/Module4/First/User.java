package Module4.First;





public class User {
        private long id;
        private String name;
        private double balance;
        private int monthsOfEmployment;
        private String companyName;
        private int salary;
        private Bank bank;

        @Override
      public String toString() {
            return "User{" + "\n" +
                    "   id = " + id + ";" + "\n" +
                    "   name = \"" + name + '\"' + ";" + "\n" +
                    "   balance = " + balance + ";" + "\n" +
                    "   monthsOfEmployment = " + monthsOfEmployment + ";" + "\n" +
                    "   companyName = \"" + companyName + '\"' + ";" + "\n" +
                    "   salary = " + salary + ";" + "\n" +
                    "   bank = " + bank.getClass().getSimpleName() + "." + "\n" +
                    '}';
            }

        public String toString(String variable) {
            String sout = "    ";
            switch (variable) {
                case "id":
                    sout += variable + " " + getId();
                    break;
                case "name":
                    sout += variable + " " + getName();
                    break;
                case "balance":
                    sout += variable + " " + getBalance();
                    break;
                case "monthsOfEmployment":
                    sout += variable + " " + getMonthsOfEmployment();
                    break;
                case "companyName":
                    sout += variable + " " + getCompanyName();
                    break;
                case "salary":
                    sout += variable + " " + getSalary();
                    break;
                case "bank":
                    sout += variable + " " + getBank().toString();
                    break;
                default:
                    sout +=  "invalid variable";
            }
            return sout;
        }


    public User(long id, String name, double balance, int monthsOfEmployment, String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public Bank getBank() {
        return bank;
    }

}
