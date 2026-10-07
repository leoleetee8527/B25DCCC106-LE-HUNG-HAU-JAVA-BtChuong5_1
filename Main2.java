interface EmailSender {
    void sendEmail();
}

interface Programmer {
    void code();
}

interface Salesperson {
    void sell();
}

class OfficeEmployee implements EmailSender {
    private String name;

    public OfficeEmployee(String name) {
        this.name = name;
    }

    @Override
    public void sendEmail() {
        System.out.println(name + " (Nhân viên văn phòng) đang gửi email.");
    }
}

class TechnicalEmployee implements Programmer, EmailSender {
    private String name;

    public TechnicalEmployee(String name) {
        this.name = name;
    }

    @Override
    public void code() {
        System.out.println(name + " (Nhân viên kỹ thuật) đang lập trình.");
    }

    @Override
    public void sendEmail() {
        System.out.println(name + " (Nhân viên kỹ thuật) đang gửi email.");
    }
}

class SalesEmployee implements Salesperson, EmailSender {
    private String name;

    public SalesEmployee(String name) {
        this.name = name;
    }

    @Override
    public void sell() {
        System.out.println(name + " (Nhân viên bán hàng) đang bán hàng.");
    }

    @Override
    public void sendEmail() {
        System.out.println(name + " (Nhân viên bán hàng) đang gửi email.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        OfficeEmployee officeEmp = new OfficeEmployee("Nguyễn Văn A");
        TechnicalEmployee techEmp = new TechnicalEmployee("Trần Văn B");
        SalesEmployee salesEmp = new SalesEmployee("Lê Thị C");

        officeEmp.sendEmail();

        techEmp.code();
        techEmp.sendEmail();

        salesEmp.sell();
        salesEmp.sendEmail();
    }
}