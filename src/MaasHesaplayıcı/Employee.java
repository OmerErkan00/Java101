package MaasHesaplayıcı;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this. workHours = workHours;
        this.hireYear = hireYear;
    }
    int tax(){
        if (salary > 1000){
            return (salary * 3) / 100 ;
        }else if (salary < 1000){
            return salary;
        }
        return salary;
    }
    int bonus(){
        if (workHours > 40){
            return (workHours - 40) * 30;
        }
        return 0;
    }
    int raiseSalary(){
        if ((2021 - hireYear) < 10){
            return (salary * 5) / 100;
        }else if ((2021 - hireYear)> 10  && (2021 - hireYear) < 20){
            return (salary * 10) / 100;
        }else if ((2021 - hireYear) > 19){
            return (salary * 15) / 100;
        }
        return 0;
    }
    public void details(){
        System.out.println("Adı : " + name);
        System.out.println("Maaşı : " + salary);
        System.out.println("Çalışma Saati : " + workHours);
        System.out.println("Başlangıç yılı : " + hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş : " + (salary + bonus() - tax()));
        System.out.println("Toplam Maaş : " + (salary + raiseSalary()));
    }
}
