package com.instagram.creation.capture.quickcapture.layout;

import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class MultiTouchRecyclerView extends RecyclerView {
    public boolean A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTouchRecyclerView(Context context) {
        super(context, null);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (motionEvent.getAction() == 0 && A0T(motionEvent.getX(), motionEvent.getY()) == null) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (motionEvent.getActionMasked() != 0 && !this.A00) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setShouldInterceptEvents(boolean z) {
        this.A00 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTouchRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTouchRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }
}
