package ucf.assignments;

import javafx.event.ActionEvent;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 John Kelleher
 */
public class Scene2 {
    public void SetTitleClicked(ActionEvent actionEvent) {
        //set the title to what was in TitleBox
    }

    public void AddClicked(ActionEvent actionEvent) {
        /*if completed is checked
            enter year/month/day and description as checked in a new line
          if not
            enter year/month/day and description as unchecked in a new line
         */
    }

    public void DeleteListClicked(ActionEvent actionEvent) {
        //deletes the list if it was already saved
        //sends back to scene 1
    }

    public void OnlyShowCompleteClicked(ActionEvent actionEvent) {
        //hides all the values that have completed unchecked
    }

    public void OnlyShowNotCompleteClicked(ActionEvent actionEvent) {
        //hides all the values that have completed checked
    }

    public void ShowAllClicked(ActionEvent actionEvent) {
        //shows all of the values
    }

    public void SaveLocallyClicked(ActionEvent actionEvent) {
        //if a title has been set
        //  save locally under the title name
        //if not
        //  show an error box saying to add a title name
    }

    public void SaveExternallyClicked(ActionEvent actionEvent) {
        //if a title has been set
        //  save to a file under the titles name in a text file
        //if not
        //  show an error box saying to add a title name
    }
}
