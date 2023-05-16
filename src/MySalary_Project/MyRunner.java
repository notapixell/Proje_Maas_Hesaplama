package MySalary_Project;

public class MyRunner {
    public static void main(String[] args) {
        MyEmployee adam1 = new MyEmployee ("ali",15000,45,25);
        adam1.setName("ali");
        adam1.setSalary(15000);
        System.out.println("adam1.getSalary() = " + adam1.getSalary());
        System.out.println("adam1.vergiHesapla(adam1.getSalary()) = " + adam1.vergiHesapla(adam1.getSalary()));
        adam1.workHours = 45;
        System.out.println("adam1.workHours = " + adam1.workHours);
        System.out.println("adam1.bonusHesapla(adam1.workHours) = " + adam1.bonusHesapla(adam1.workHours));
        System.out.println("adam1.maasArtisHesapla(25) = " + adam1.maasArtisHesapla(25));
        System.out.println(adam1);

        System.out.println(adam1.getSalary() + adam1.bonusHesapla(adam1.workHours) + adam1.vergiHesapla(adam1.getSalary()) + adam1.maasArtisHesapla(25));
    }
}
