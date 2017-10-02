package view;

public class Buttons {
    public Buttons() {
    }

    public String first_demo() {
        MainBean mainBean = new MainBean();
        mainBean.putValue("first-demo");
        return "press";
    }

    public String bc_page() {
        MainBean mainBean = new MainBean();
        mainBean.putValue("bc-page");
        return "press";
    }

    public String business_components() {
        MainBean mainBean = new MainBean();
        mainBean.putValue("business-components");
        return "press";
    }

    public String task_flow() {
            MainBean mainBean = new MainBean();
            mainBean.putValue("task-flow");
            return "press";
    }

    public String java_script() {
            MainBean mainBean = new MainBean();
            mainBean.putValue("java-script");
            return "press";
    }

    public String go_back() {
        MainBean mainBean = new MainBean();
        mainBean.putValue("menuPage");
        return "goBack";
    }
}
