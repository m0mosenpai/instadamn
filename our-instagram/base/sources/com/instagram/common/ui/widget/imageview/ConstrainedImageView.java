package com.instagram.common.ui.widget.imageview;

import X.AbstractC55922hc;
import X.C14360o3;
import X.C1H4;
import X.InterfaceC25167BBn;
import X.X8E;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public class ConstrainedImageView extends IgImageView {
    public float A00;
    public InterfaceC25167BBn A01;
    public X8E A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstrainedImageView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A00 = 1.0f;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        InterfaceC25167BBn interfaceC25167BBn = this.A01;
        if (interfaceC25167BBn != null) {
            interfaceC25167BBn.Dl1(this, i, i2, i3, i4);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), C1H4.A01(getMeasuredWidth() / this.A00));
    }

    public final void setAspect(float f) {
        this.A00 = f;
    }

    public final void setOnMeasureListener(X8E x8e) {
        this.A02 = x8e;
    }

    public final void setOnSetFrameListener(InterfaceC25167BBn interfaceC25167BBn) {
        this.A01 = interfaceC25167BBn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstrainedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = 1.0f;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A0L);
        C14360o3.A07(obtainStyledAttributes);
        this.A00 = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstrainedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A00 = 1.0f;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A0L);
        C14360o3.A07(obtainStyledAttributes);
        this.A00 = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }
}
