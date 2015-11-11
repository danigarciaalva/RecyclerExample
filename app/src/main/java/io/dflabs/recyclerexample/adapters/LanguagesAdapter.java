package io.dflabs.recyclerexample.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import io.dflabs.recyclerexample.R;
import io.dflabs.recyclerexample.models.Language;

/**
 * Created by Daniel García Alvarado on 11/11/15.
 * RecyclerExample - danielgarcia
 */
public class LanguagesAdapter extends RecyclerView.Adapter<LanguagesAdapter.LanguageViewHolder> {

    ArrayList<Language> mLanguages;
    View.OnClickListener clickListener;

    public LanguagesAdapter(ArrayList<Language> languages, View.OnClickListener clickListener) {
        this.mLanguages = languages;
        this.clickListener = clickListener;
    }

    // Called when the adapter is created
    @Override
    public LanguageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_language, parent, false);
        return new LanguageViewHolder(view);
    }

    /**
     * This method is called the number of times as elements are in data source
     * For instance:
     * <p/>
     * Languages size : 10
     * onBindViewHolder is called 10 times with position of language iterated
     */
    @Override
    public void onBindViewHolder(LanguageViewHolder holder, int position) {
        Language language = mLanguages.get(position);
        // We assign the language object as a tag to get later
        holder.parentLinearLayout.setTag(language);
        holder.nameTextView.setText(language.getName());
    }

    // To indicate how many times the RecyclerView will iterate
    @Override
    public int getItemCount() {
        return mLanguages.size();
    }

    // A ViewHolder is a design pattern to improve performance in lists
    public class LanguageViewHolder extends RecyclerView.ViewHolder {

        LinearLayout parentLinearLayout;
        TextView nameTextView;

        public LanguageViewHolder(View itemView) {
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.item_language_name);
            parentLinearLayout = (LinearLayout) itemView.findViewById(R.id.item_language);

            parentLinearLayout.setOnClickListener(clickListener);
        }
    }
}
