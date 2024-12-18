package com.facebook.rtc.views.omnigrid;

import X.AbstractC43593JPy;
import X.AbstractC70663Fe;
import X.C0f9;
import X.C14360o3;
import X.JQ0;
import X.UQ7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public class OmniGridRecyclerView extends RecyclerView {
    public GestureDetector A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OmniGridRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        List<UQ7> list;
        int i;
        int i2;
        C14360o3.A0B(motionEvent, 0);
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if ((abstractC70663Fe instanceof OmniGridLayoutManager) && motionEvent.getAction() == 0 && (list = ((OmniGridLayoutManager) abstractC70663Fe).A07.A01) != null && (!(list instanceof Collection) || !list.isEmpty())) {
            for (UQ7 uq7 : list) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int i3 = uq7.A01;
                int i4 = uq7.A02;
                if (i3 < i4 && (i = uq7.A03) < (i2 = uq7.A00) && x >= i3 && x < i4 && y >= i && y < i2) {
                    return false;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe instanceof OmniGridLayoutManager) {
            OmniGridLayoutManager omniGridLayoutManager = (OmniGridLayoutManager) abstractC70663Fe;
            omniGridLayoutManager.A04 = motionEvent;
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            omniGridLayoutManager.A04 = null;
            return onInterceptTouchEvent;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final GestureDetector getGestureDetector() {
        return this.A00;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int A03 = AbstractC43593JPy.A03(motionEvent, 2114564044);
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe instanceof OmniGridLayoutManager) {
            OmniGridLayoutManager omniGridLayoutManager = (OmniGridLayoutManager) abstractC70663Fe;
            omniGridLayoutManager.A04 = motionEvent;
            onTouchEvent = super.onTouchEvent(motionEvent);
            omniGridLayoutManager.A04 = null;
            GestureDetector gestureDetector = this.A00;
            if (gestureDetector != null) {
                gestureDetector.onTouchEvent(motionEvent);
            }
        } else {
            onTouchEvent = super.onTouchEvent(motionEvent);
        }
        C0f9.A0C(2064603857, A03);
        return onTouchEvent;
    }

    public final void setGestureDetector(GestureDetector gestureDetector) {
        this.A00 = gestureDetector;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OmniGridRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OmniGridRecyclerView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ OmniGridRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
