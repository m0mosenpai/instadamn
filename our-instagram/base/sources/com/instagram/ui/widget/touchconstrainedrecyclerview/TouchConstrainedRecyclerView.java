package com.instagram.ui.widget.touchconstrainedrecyclerview;

import X.C14360o3;
import X.MSZ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class TouchConstrainedRecyclerView extends RecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchConstrainedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (motionEvent.getAction() == 0 && MSZ.A0I(motionEvent, this) == null) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchConstrainedRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchConstrainedRecyclerView(Context context) {
        super(context, null);
        C14360o3.A0B(context, 1);
    }
}
