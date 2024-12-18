package com.instagram.creation.capture.quickcapture.sundial.edit.views;

import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class ClipsTimelineConstraintLayout extends ConstraintLayout {
    public boolean A00;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.A00) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean getAllowTouchEvents() {
        return this.A00;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A00) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public /* synthetic */ ClipsTimelineConstraintLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }

    public final void setAllowTouchEvents(boolean z) {
        this.A00 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsTimelineConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A00 = true;
    }
}
