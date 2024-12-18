package com.instagram.ui.widget.nestablescrollingview;

import X.AbstractC70663Fe;
import X.C130735vM;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class NestableRecyclerView extends RecyclerView {
    public double A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public double A06;
    public final C130735vM A07;

    public NestableRecyclerView(Context context) {
        this(context, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean A1E(int i, int i2) {
        double d = this.A00;
        if (d > 0.0d) {
            i = (int) (i * d);
        }
        double d2 = this.A06;
        if (d2 > 0.0d) {
            i2 = (int) (i2 * d2);
        }
        return super.A1E(i, i2);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (!this.A01) {
            return 0.0f;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        if (!this.A02) {
            return 0.0f;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        if (!this.A03) {
            return 0.0f;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (!this.A04) {
            return 0.0f;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public int getTopPaddingOffset() {
        boolean z = this.A05;
        int paddingTop = getPaddingTop();
        if (z) {
            return -paddingTop;
        }
        return paddingTop;
    }

    @Override // android.view.View
    public final boolean isPaddingOffsetRequired() {
        if (this.A05) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C130735vM c130735vM = this.A07;
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        abstractC70663Fe.getClass();
        c130735vM.A01(motionEvent, this, abstractC70663Fe.A1X());
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setPassThroughEdge(int i) {
        C130735vM c130735vM = this.A07;
        c130735vM.A00 = i;
        c130735vM.A01 = false;
    }

    public void setPassThroughToParentOverride(boolean z) {
        this.A07.A03 = z;
    }

    @Override // android.view.View
    public int getBottomPaddingOffset() {
        return getPaddingBottom();
    }

    @Override // android.view.View
    public int getLeftPaddingOffset() {
        return getPaddingLeft();
    }

    @Override // android.view.View
    public int getRightPaddingOffset() {
        return getPaddingRight();
    }

    public void setBottomFadingEnabled(boolean z) {
        this.A01 = z;
    }

    public void setFlingVelocityFactorX(double d) {
        this.A00 = d;
    }

    public void setFlingVelocityFactorY(double d) {
        this.A06 = d;
    }

    public void setLeftFadingEnabled(boolean z) {
        this.A02 = z;
    }

    public void setRightFadingEnabled(boolean z) {
        this.A03 = z;
    }

    public void setTopFadingEnabled(boolean z) {
        this.A04 = z;
    }

    public NestableRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = true;
        this.A03 = true;
        this.A04 = true;
        this.A01 = true;
        this.A05 = false;
        this.A00 = -1.0d;
        this.A06 = -1.0d;
        this.A07 = new C130735vM(getContext());
    }

    public NestableRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
