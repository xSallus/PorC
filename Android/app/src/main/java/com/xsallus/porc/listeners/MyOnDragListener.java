package com.xsallus.porc.listeners;

import android.content.ClipDescription;
import android.widget.LinearLayout;
import android.graphics.Color;
import android.view.DragEvent;
import android.view.ViewGroup;
import android.view.View;

import com.xsallus.porc.R;

public class MyOnDragListener implements View.OnDragListener {
    @SuppressWarnings("DuplicateBranchesInSwitch")
    @Override
    public boolean onDrag(View v, DragEvent event) {
        int action = event.getAction();
        switch (action) {
            case DragEvent.ACTION_DRAG_STARTED:
                if (event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)) {
                    return(true);
                }
                return(false);

            case DragEvent.ACTION_DRAG_ENTERED:
                v.setBackgroundColor(Color.GREEN);
                break;

            case DragEvent.ACTION_DRAG_LOCATION:
                break;

            case DragEvent.ACTION_DRAG_EXITED:
                v.setBackgroundColor(Color.BLUE);
                break;

            case DragEvent.ACTION_DROP:
                View view = (View) event.getLocalState();
                ViewGroup owner = (ViewGroup) view.getParent();
                LinearLayout container = (LinearLayout) v;
                if(container != owner) {
                    owner.removeView(view);
                    container.removeAllViews();
                    container.addView(view);
                    view.setVisibility(View.VISIBLE);
                } else {
                    owner.addView(view);
                    view.setVisibility(View.VISIBLE);
                }
                break;

            case DragEvent.ACTION_DRAG_ENDED:
                v.setBackgroundColor(Color.BLUE);
                break;
        }

        return(true);
    }
}
