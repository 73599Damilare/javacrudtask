package com.example.crud_with_vaadin;

import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.ColorScheme;
import com.vaadin.flow.theme.lumo.Lumo;

@StyleSheet(Lumo.STYLESHEET)
@StyleSheet("styles.css")
@ColorScheme(ColorScheme.Value.DARK)
public class AppShell implements AppShellConfigurator {
}
