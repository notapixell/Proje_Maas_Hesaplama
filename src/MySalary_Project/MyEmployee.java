package MySalary_Project;

public class MyEmployee {
private String name;
private int salary;
double workHours;
int year;
int vergi;



    public MyEmployee(String name, int salary, double workHours, int year) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public double vergiHesapla (int salary) {
        int vergi =0;
        if (salary>=10000){
            vergi = (salary*3/100);
        }
        return vergi;
    }
    public double bonusHesapla (double workHours) {
       double bonus =0;
       if (workHours> 40) {
           bonus = (workHours-40)*50;
       }
       return bonus;
    }

    public double maasArtisHesapla (int year) {
       double maasArtisi =0;

        if (year<5) {
            maasArtisi = ((salary + vergiHesapla(salary)) *5)/100;
        } else if (year>5 && year<15) {
            maasArtisi = ((salary + vergiHesapla(salary)) *10)/100;
        } else  maasArtisi = ((salary + vergiHesapla(salary)) *20)/100;
        return maasArtisi;
    }

    @Override
    public String toString() {
        return "MyEmployee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", year=" + year +
                ", vergi=" + vergi +
                '}';
    }
}
