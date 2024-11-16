package Sept_one;

public class Lab009_switchcase {
    public static void main(String[] args) {
        //String broswer="Chrome";
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No idea, what day its");
                break;
        }
        System.out.println("Switch case number 2");
        String browser = "Firefox";
        switch ("Firefox") {
            case "Chrome":
                System.out.println("Chrome");
                break;
            case "Mozilla":
                System.out.println("Mozilla");
                break;
            case "Firefox":
                System.out.println("Firefox");
                break;
            case "IE":
                System.out.println("IE");
                break;
            default:
                System.out.println("No idea, what day its");
                break;
        }

    }
}
