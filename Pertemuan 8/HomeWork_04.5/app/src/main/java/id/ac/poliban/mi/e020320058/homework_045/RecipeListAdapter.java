package id.ac.poliban.mi.e020320058.homework_045;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class RecipeListAdapter extends RecyclerView.Adapter<RecipeListAdapter.RecipeViewHolder> {
    private final LinkedList<String> mRecipeName;
    private final LinkedList<String> mRecipeDesc;
    private final LayoutInflater mLayoutInflater;
    public final static String EXTRA_NAME = "id.ac.poliban.mi.e020320058.homework_045.EXTRA.NAME";

    RecipeListAdapter(Context context, LinkedList<String> recipeName, LinkedList<String> recipeDesc){
        mLayoutInflater = LayoutInflater.from(context);
        this.mRecipeName = recipeName;
        this.mRecipeDesc = recipeDesc;
    }

    @NonNull
    @Override
    public RecipeListAdapter.RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mLayoutInflater.inflate(R.layout.recipe_list, parent, false);
        return new RecipeViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeListAdapter.RecipeViewHolder holder, int position) {
        String mCurrentName = mRecipeName.get(position);
        String mCurrentDesc = mRecipeDesc.get(position);
        holder.recipeNameTextView.setText(mCurrentName);
        holder.recipeDescTextView.setText(mCurrentDesc);
    }

    @Override
    public int getItemCount() {
        return mRecipeName.size();
    }

    class RecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        final TextView recipeNameTextView;
        final TextView recipeDescTextView;
        final RecipeListAdapter mAdapter;

        RecipeViewHolder(View itemView, RecipeListAdapter adapter){
            super(itemView);
            recipeNameTextView = itemView.findViewById(R.id.item_title);
            recipeDescTextView = itemView.findViewById(R.id.item_desc);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int mPosition = getLayoutPosition();
            String element = mRecipeName.get(mPosition);
            Intent intent = new Intent(v.getContext(), RecipeMethodActivity.class);
            Bundle extra = new Bundle();
            extra.putString(EXTRA_NAME,element);
            intent.putExtras(extra);
            v.getContext().startActivity(intent);
        }
    }
}
