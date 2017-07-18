class Manager extends Employee {

    private double bonus;

    public Manager(String n, double s, int year, int month, int day){
        super(n, s, year, month, day);
        bonus = 0;
    }

    public void setBonus(double abonus){
        bonus = abonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + getBonus();
    }

    public void print(){
        System.out.print(getName());
    }



}
