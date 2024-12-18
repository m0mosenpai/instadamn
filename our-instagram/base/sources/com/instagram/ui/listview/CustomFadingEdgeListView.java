package com.instagram.ui.listview;

import X.C14360o3;
import X.InterfaceC172617mW;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/* loaded from: classes8.dex */
public final class CustomFadingEdgeListView extends ListView implements InterfaceC172617mW {
    public boolean A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFadingEdgeListView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A02 = true;
        this.A03 = true;
        this.A04 = true;
        this.A00 = true;
    }

    @Override // android.widget.AbsListView, android.view.View
    public float getBottomFadingEdgeStrength() {
        if (this.A00) {
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

    @Override // android.widget.AbsListView, android.view.View
    public int getSolidColor() {
        return this.A01;
    }

    @Override // android.widget.AbsListView, android.view.View
    public float getTopFadingEdgeStrength() {
        if (this.A04) {
            return super.getTopFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // X.InterfaceC172617mW
    public void setBottomFadingEnabled(boolean z) {
        this.A00 = z;
    }

    public void setLeftFadingEnabled(boolean z) {
        this.A02 = z;
    }

    public void setRightFadingEnabled(boolean z) {
        this.A03 = z;
    }

    public final void setSolidColor(int i) {
        this.A01 = i;
    }

    public void setTopFadingEnabled(boolean z) {
        this.A04 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFadingEdgeListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A02 = true;
        this.A03 = true;
        this.A04 = true;
        this.A00 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFadingEdgeListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A02 = true;
        this.A03 = true;
        this.A04 = true;
        this.A00 = true;
    }
}
