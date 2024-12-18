package com.instagram.creation.capture.quickcapture.sundial.edit.stacked.audio;

import X.AbstractC167017dG;
import X.C14360o3;
import X.InterfaceC57818Pkk;
import X.PM5;
import X.ViewOnTouchListenerC50553MTk;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* loaded from: classes9.dex */
public final class StackedAdjustHorizontalScrollView extends HorizontalScrollView {
    public int A00;
    public InterfaceC57818Pkk A01;
    public Runnable A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final long A06;

    public final void setOnScrollStoppedListener(InterfaceC57818Pkk interfaceC57818Pkk) {
        C14360o3.A0B(interfaceC57818Pkk, 0);
        this.A01 = interfaceC57818Pkk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackedAdjustHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC167017dG.A1P(context, attributeSet);
        this.A06 = 100L;
        this.A02 = new PM5(this);
        setOnTouchListener(new ViewOnTouchListenerC50553MTk(this, 3));
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.A03 = true;
        this.A05 = true;
    }
}
