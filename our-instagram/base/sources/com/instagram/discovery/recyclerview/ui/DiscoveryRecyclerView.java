package com.instagram.discovery.recyclerview.ui;

import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class DiscoveryRecyclerView extends RecyclerView {
    public double A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoveryRecyclerView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean A1E(int i, int i2) {
        return super.A1E(i, (int) (i2 * this.A00));
    }

    public final void setScrollingFrictionYFactor(double d) {
        this.A00 = d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoveryRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = 1.0d;
    }

    public /* synthetic */ DiscoveryRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoveryRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
