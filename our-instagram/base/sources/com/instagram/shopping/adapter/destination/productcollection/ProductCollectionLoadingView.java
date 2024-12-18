package com.instagram.shopping.adapter.destination.productcollection;

import X.AbstractC55922hc;
import X.C14360o3;
import X.HES;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class ProductCollectionLoadingView extends RecyclerView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductCollectionLoadingView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductCollectionLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A1p);
        C14360o3.A07(obtainStyledAttributes);
        boolean z = obtainStyledAttributes.getBoolean(2, false);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        boolean z3 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        setAdapter(new HES(context, z, z2, z3));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductCollectionLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ ProductCollectionLoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
