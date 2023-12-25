package Common;

public class BaseTest extends Constants {
    public BaseTest(String browser, boolean report, boolean headless){
        super(browser, report, headless);
    }

    public void createDriver(String browser){
        System.out.println(browser);
    }
    public void closeDriver(String browser){
        System.out.println("close browser" + browser);
    }

    public static void main(String[] args) {
        BaseTest BT = new BaseTest("abc", true, true);
        String browser = BT.getBrowser();
        BT.createDriver(browser);
        BT.closeDriver(browser);
    }

}
