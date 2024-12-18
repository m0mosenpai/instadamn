package com.instagram.ui.recyclerview;

import X.C14360o3;
import X.InterfaceC172617mW;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class CustomFadingEdgeRecyclerView extends RecyclerView implements InterfaceC172617mW {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFadingEdgeRecyclerView(Context context) {
        super(context, null);
        C14360o3.A0B(context, 1);
        this.A02 = true;
        this.A03 = true;
        this.A04 = true;
        this.A01 = true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (this.A01) {
            return super.getBottomFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        if (this.A02) {
            return super.getLeftFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        if (this.A03) {
            return super.getRightFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public int getSolidColor() {
        return this.A00;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (this.A04) {
            return super.getTopFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // X.InterfaceC172617mW
    public void setBottomFadingEnabled(boolean z) {
        this.A01 = z;
    }

    public void setLeftFadingEnabled(boolean z) {
        this.A02 = z;
    }

    public void setRightFadingEnabled(boolean z) {
        this.A03 = z;
    }

    public final void setSolidColor(int i) {
        this.A00 = i;
    }

    public void setTopFadingEnabled(boolean z) {
        this.A04 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFadingEdgeRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
        this.A02 = true;
        this.A03 = true;
        this.A04 = true;
        this.A01 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFadingEdgeRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
        this.A02 = true;
        this.A03 = true;
        this.A04 = true;
        this.A01 = true;
    }
}
