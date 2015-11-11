# RecyclerView Android Example

RecyclerView is an Android widget, to be used when we need to display an array of elements as vertical and horizontal list, or grid views.

Steps:

  - At the bottom of **build.gradle** add the line
  
    ```java
    compile 'com.android.support:recyclerview-v7:23.1.0'
    ```
    
  - Add the RecyclerView into **activity_main.xml**
  
    ```xml
    <android.support.v7.widget.RecyclerView
        android:id="@+id/act_main_recycler"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
    ```
    
  - In java, configure Recycler
  
    ```java
    mRecyclerView = (RecyclerView) findViewById(R.id.act_main_recycler);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    mRecyclerView.setItemAnimator(new DefaultItemAnimator());
    mRecyclerView.setHasFixedSize(true);
    ```
    
  - Create a language model
  
    ```java
    public class Language {
        private String name;
        
        public Language(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
    ```
    
  - Create an adapter class to populate the items
  
    ```java
    
    ```


