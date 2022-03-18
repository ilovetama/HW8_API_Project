package com.it_academy.onliner.navigation;

import com.it_academy.onliner.pageobject.OnlinerHomePage;

public class OnlinerNavigation {
    public static void navigateToOnlinerHomePage() {
        new OnlinerHomePage().navigate("https://www.onliner.by/");
    }
}
