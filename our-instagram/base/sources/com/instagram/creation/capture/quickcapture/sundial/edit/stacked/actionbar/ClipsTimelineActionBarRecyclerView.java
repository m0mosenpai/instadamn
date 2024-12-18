package com.instagram.creation.capture.quickcapture.sundial.edit.stacked.actionbar;

import X.AbstractC166987dD;
import X.C14360o3;
import X.C51179MjN;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class ClipsTimelineActionBarRecyclerView extends RecyclerView {
    public boolean A00;
    public boolean A01;
    public final C51179MjN A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClipsTimelineActionBarRecyclerView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public final boolean isPaddingOffsetRequired() {
        return true;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        if (!this.A00) {
            return 0.0f;
        }
        return 0.3f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        if (!this.A01) {
            return 0.0f;
        }
        return 0.3f;
    }

    @Override // android.view.View
    public int getLeftPaddingOffset() {
        return -getPaddingLeft();
    }

    @Override // android.view.View
    public int getRightPaddingOffset() {
        return getPaddingRight();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsTimelineActionBarRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A00 = true;
        this.A01 = true;
        C51179MjN c51179MjN = new C51179MjN(1);
        this.A02 = c51179MjN;
        setItemAnimator(null);
        setHorizontalFadingEdgeEnabled(true);
        setFadingEdgeLength(AbstractC166987dD.A0C(context, 80));
        setHorizontalFadingEdgeEnabled(true);
        A10(c51179MjN);
    }

    public /* synthetic */ ClipsTimelineActionBarRecyclerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }
}
