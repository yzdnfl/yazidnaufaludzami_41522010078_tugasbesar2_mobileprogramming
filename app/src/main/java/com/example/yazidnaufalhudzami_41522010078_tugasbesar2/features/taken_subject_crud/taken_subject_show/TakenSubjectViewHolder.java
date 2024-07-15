package com.example.yazidnaufalhudzami_41522010078_tugasbesar2.features.taken_subject_crud.taken_subject_show;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yazidnaufalhudzami_41522010078_tugasbesar2.R;

class TakenSubjectViewHolder extends RecyclerView.ViewHolder {

    TextView subjectNameTextView;
    TextView courseCodeTextView;
    TextView creditTextView;
    ImageView deleteIcon;

    public TakenSubjectViewHolder(View itemView) {
        super(itemView);

        subjectNameTextView = itemView.findViewById(R.id.subjectNameTextView);
        courseCodeTextView = itemView.findViewById(R.id.courseCodeTextView);
        creditTextView = itemView.findViewById(R.id.creditTextView);
        deleteIcon = itemView.findViewById(R.id.deleteIcon);
    }
}
