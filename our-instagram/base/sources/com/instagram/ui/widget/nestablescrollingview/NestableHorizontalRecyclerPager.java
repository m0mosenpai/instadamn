package com.instagram.ui.widget.nestablescrollingview;

import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;

/* loaded from: classes6.dex */
public final class NestableHorizontalRecyclerPager extends HorizontalRecyclerPager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestableHorizontalRecyclerPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setPassThroughEdge(int i) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NestableHorizontalRecyclerPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NestableHorizontalRecyclerPager(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }
}
