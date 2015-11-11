package io.dflabs.recyclerexample.models;

import java.util.ArrayList;

/**
 * Created by Daniel García Alvarado on 11/11/15.
 * RecyclerExample - danielgarcia
 */
public class DataBase {

    public static ArrayList<Language> languages() {
        ArrayList<Language> languages = new ArrayList<>();
        languages.add(new Language("Ruby"));
        languages.add(new Language("Python"));
        languages.add(new Language("Java"));
        languages.add(new Language("Go"));
        languages.add(new Language("Perl"));
        languages.add(new Language("PHP"));
        languages.add(new Language("Clojure"));
        languages.add(new Language("Kotlin"));
        languages.add(new Language("SQL"));
        languages.add(new Language("Html"));
        languages.add(new Language("Scala"));
        languages.add(new Language("C"));
        languages.add(new Language("C++"));
        languages.add(new Language("Erlang"));
        return languages;
    }

}
