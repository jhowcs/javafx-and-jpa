package com.javafxandjpa.controllers;

import java.util.List;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import com.javafxandjpa.models.StaticUserList;
import com.javafxandjpa.models.User;

public class CreateUserController {
	
	@FXML 
	private TableView<User> tbvUsers;
	
	@FXML 
	private TextField edtName;
	
	@FXML 
	private TextField edtLastName;

	private List<User> list;
	
	@FXML
	private void initialize() {
		System.out.println("Controller initialized!");
		
		list = StaticUserList.load();
		
		tbvUsers.setItems(FXCollections.observableArrayList(list));
		
		tbvUsers.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<User>() {
			@Override
			public void changed(ObservableValue<? extends User> observable, User oldValue, User newValue) {
				edtName.setText(newValue.getName());
				edtLastName.setText(newValue.getLastName());
			}
		});
	}
	
	@FXML public void save() {
		System.out.println("Saving...");
		User u = new User(0, edtName.getText(), edtLastName.getText());		
		StaticUserList.addUser(u);			
	}

	@FXML public void delete() {
		System.out.println("Deleting...");
	}

}
