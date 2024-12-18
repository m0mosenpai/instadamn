package com.instagram.direct.inbox.notes.ui;

import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class NoteUserRowsRecyclerView extends RecyclerView {
    public Integer A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoteUserRowsRecyclerView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final Integer getMaxHeight() {
        return this.A00;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer num = this.A00;
        if (num != null) {
            i2 = View.MeasureSpec.makeMeasureSpec(num.intValue(), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public final void setMaxHeight(Integer num) {
        this.A00 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteUserRowsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoteUserRowsRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
