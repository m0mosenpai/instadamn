package com.instagram.ui.viewpager;

import X.AbstractC166997dE;
import X.InterfaceC021908q;
import X.JQ0;
import X.UKI;
import X.WTB;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class IgWrapContentRtlViewPager extends UKI {
    public int A00;
    public final InterfaceC021908q A01;
    public final List A02;

    public IgWrapContentRtlViewPager(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void A0J(InterfaceC021908q interfaceC021908q) {
        this.A02.add(interfaceC021908q);
    }

    @Override // X.UKI, androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(InterfaceC021908q interfaceC021908q) {
        throw new UnsupportedOperationException("Unsupported function. Use addOnPageChangeListener instead");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        View childAt = getChildAt(this.A00);
        if (childAt != null) {
            childAt.measure(i, i2);
        }
        int measuredWidth = getMeasuredWidth();
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (childAt != null) {
                i3 = childAt.getMeasuredHeight();
            } else {
                i3 = 0;
            }
            if (mode == Integer.MIN_VALUE && i3 > size) {
                i3 = size;
            }
            size = i3;
        }
        setMeasuredDimension(measuredWidth, size);
    }

    public final void setChildIdxForHeightMeasure(int i) {
        this.A00 = i;
    }

    public /* synthetic */ IgWrapContentRtlViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgWrapContentRtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (context != null) {
            this.A02 = new ArrayList();
            WTB wtb = new WTB(this, 3);
            this.A01 = wtb;
            super.setOnPageChangeListener(wtb);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
