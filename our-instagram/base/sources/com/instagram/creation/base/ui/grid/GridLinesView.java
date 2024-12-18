package com.instagram.creation.base.ui.grid;

import X.AbstractC55922hc;
import X.C0f9;
import X.C131515wl;
import X.InterfaceC57933Pmd;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes3.dex */
public class GridLinesView extends View {
    public float A00;
    public InterfaceC57933Pmd A01;
    public boolean A02;
    public int A03;
    public int A04;
    public boolean A05;
    public final int A06;
    public final Rect A07;
    public final C131515wl A08;

    public GridLinesView(Context context) {
        this(context, null);
    }

    public int getStrokeWidth() {
        return this.A06;
    }

    public void setGridlinesRect(Rect rect) {
        this.A08.A03(rect);
    }

    public void setInnerStrokeColor(int i) {
        this.A08.A05.setColor(i);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.A08.A02(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredHeight;
        super.onMeasure(i, i2);
        if (this.A02) {
            boolean z = this.A05;
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredWidth();
            if (z) {
                measuredHeight += this.A06 * 2;
            }
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-1527950090);
        super.onSizeChanged(i, i2, i3, i4);
        Rect rect = this.A07;
        rect.set(0, 0, i, (int) (i2 * this.A00));
        this.A08.A03(rect);
        InterfaceC57933Pmd interfaceC57933Pmd = this.A01;
        if (interfaceC57933Pmd != null) {
            interfaceC57933Pmd.Dms(this, i, i2);
        }
        C0f9.A0D(1069032219, A06);
    }

    public void setAspectRatio(float f) {
        this.A00 = f;
    }

    public void setShouldGridBeSquare(boolean z) {
        this.A02 = z;
    }

    public void setSizeChangedListener(InterfaceC57933Pmd interfaceC57933Pmd) {
        this.A01 = interfaceC57933Pmd;
    }

    public void setSquareGrid(boolean z) {
        this.A02 = z;
    }

    public GridLinesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.A02 = true;
        this.A05 = false;
        float f = 1.0f;
        this.A00 = 1.0f;
        int i3 = ((double) getResources().getDisplayMetrics().density) >= 1.5d ? 2 : 1;
        this.A06 = i3;
        int i4 = 3;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A0x);
            i2 = obtainStyledAttributes.getInteger(6, 3);
            i4 = obtainStyledAttributes.getInteger(1, 3);
            this.A04 = obtainStyledAttributes.getInteger(3, this.A04);
            this.A03 = obtainStyledAttributes.getInteger(2, this.A03);
            this.A02 = obtainStyledAttributes.getBoolean(5, this.A02);
            this.A05 = obtainStyledAttributes.getBoolean(5, this.A05);
            f = obtainStyledAttributes.getFloat(0, 1.0f);
            obtainStyledAttributes.recycle();
        } else {
            i2 = 3;
        }
        this.A07 = new Rect();
        C131515wl c131515wl = new C131515wl(i3, i2, i4, this.A04, this.A03, this.A05);
        this.A08 = c131515wl;
        c131515wl.A04(f);
    }

    public GridLinesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
