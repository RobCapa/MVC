package OurProject.Controller;

import OurProject.Model.Model;
import OurProject.View.View;
import OurProject.View.ViewUser;

public class ControllerUser implements Controller {
    private Model model;
    private View view;

    @Override
    public void showAllUsers() {
        model.showAllUsers();
        view.drawing(model.getDisplayData(), ViewUser.DataExplanation.ALL_USERS);
    }

    @Override
    public void showUsers(int indexStart, int indexEnd) {
        model.showUsers(indexStart, indexEnd);
        view.drawing(model.getDisplayData(), ViewUser.DataExplanation.USERS_OF_THE_SPECIFIED_RANGE);
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setView(View view) {
        this.view = view;
    }
}
