package Common;

public class Constants {
    String browser;
    boolean report;
    boolean headless;

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public void setReport(boolean report) {
        this.report = report;
    }

    public void setHeadless(boolean headless) {
        this.headless = headless;
    }

    public String getBrowser() {
        return browser;
    }

    public boolean isReport() {
        return report;
    }

    public boolean isHeadless() {
        return headless;
    }

    public Constants(String browser, boolean report, boolean headless ){
        this.browser = browser;
        this.report = report;
        this.headless = headless;
    }
}
