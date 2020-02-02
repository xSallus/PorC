package com.xsallus.porc.listeners;

import android.content.ClipData;
import android.view.View;

public class MyOnLongClickListener implements View.OnLongClickListener {

    @Override
    public boolean onLongClick(View v) {

        ClipData data = ClipData.newPlainText("Simpletext", "text");
        View.DragShadowBuilder sb = new View.DragShadowBuilder(v);
        v.startDragAndDrop(data, sb, v, 0);
        v.setVisibility(View.INVISIBLE);

        return(true);
    }
}
