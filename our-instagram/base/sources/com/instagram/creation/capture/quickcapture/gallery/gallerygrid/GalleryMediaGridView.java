package com.instagram.creation.capture.quickcapture.gallery.gallerygrid;

import X.AbstractC154146wP;
import X.AbstractC55922hc;
import X.AbstractC63123SdR;
import X.C14360o3;
import X.C43889Jaw;
import X.C44286Jhc;
import X.JQ0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Deprecated(message = "This is a very old custom View that assumes the Adapter that powers it (which is incorrect most of the time). New cases should use a standard View without inheritance (eg. RecyclerView)")
/* loaded from: classes8.dex */
public final class GalleryMediaGridView extends RecyclerView {
    public final int A00;
    public final GridLayoutManager A01;

    public final GridLayoutManager getGridLayoutManager() {
        return this.A01;
    }

    public /* synthetic */ GalleryMediaGridView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) + this.A00, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryMediaGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0r, i, 0);
        C14360o3.A07(obtainStyledAttributes);
        int i2 = obtainStyledAttributes.getInt(1, 4);
        this.A00 = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), i2);
        this.A01 = gridLayoutManager;
        C43889Jaw c43889Jaw = new C43889Jaw(this, i2, 1);
        gridLayoutManager.A01 = c43889Jaw;
        ((AbstractC154146wP) c43889Jaw).A00 = true;
        setLayoutManager(gridLayoutManager);
        if (!z) {
            A10(new C44286Jhc(this, 9));
        }
        setOverScrollMode(2);
        setClipToPadding(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryMediaGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryMediaGridView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
