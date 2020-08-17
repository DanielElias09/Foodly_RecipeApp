package com.example.foodly_recipeapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.foodly_recipeapp.R;
import com.example.foodly_recipeapp.adapters.RecyclerViewAdapter;
import com.example.foodly_recipeapp.models.Recipe;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myRV;
    RecyclerViewAdapter myAdapter;

    List<Recipe> recipeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*recipeList=new ArrayList<>();
        recipeList.add(new Recipe("Rose Pasta",
                "3 cloves garlic\n"+
                "1 tbsp oil\n"+
                "1 can (398ml) tomato sauce\n"+
                "1/2 cup fresh parmesan cheese, grated\n"+
                "1 cup cooking cream\n"+
                "salt"+
                "pepper",
                "Method",
                "Cut the garlic into small pieces. Set aside.\n" +
                "In a skillet, heat the oil over medium-high heat. Add the garlic. Cook it for 1 minute. Do not roast, as this will change the taste of the sauce. Stir a little.\n" +
                "Add the tomato sauce and stir well.\n" +
                "Add the parmesan cheese while stirring with a whisk. Mix well.\n" +
                "Add the cream and stir while bringing to a boil.\n" +
                "Add salt and pepper to taste. Stir well for about 5 minutes and remove from heat.\n" +
                "Serve over pasta.",
                R.drawable.rose_pasta));

            myRV=(RecyclerView)findViewById(R.id.recyclerview_id);
            myAdapter=new RecyclerViewAdapter(this, recipeList);
            myRV.setLayoutManager(new GridLayoutManager(this, 1));
            myRV.setAdapter(myAdapter);*/
        }
}