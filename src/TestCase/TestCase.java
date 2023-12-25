package TestCase;

import Common.BaseTest;

public class TestCase extends BaseTest {
    public TestCase(String browser, boolean report, boolean headless){
        super(browser, report, headless);
    }

    public void login (){
        System.out.println("step1" );
        System.out.println("step2" );
    }
    public void add (){
        System.out.println("add1");
        System.out.println("add2");

    }

    public static void main(String[] args) {
        TestCase TC = new TestCase("abc", true, true);

        TC.closeDriver("bb");
        TC.login();

        TC.add();

    }
}
