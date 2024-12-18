package com.instagram.common.ui.base;

import X.AbstractC55922hc;
import X.C0f9;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class IgShadowTextView extends IgTextView {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public ColorStateList A08;
    public boolean A09;

    public final int getPrimaryShadowColor() {
        return this.A06;
    }

    public final float getPrimaryShadowDx() {
        return this.A00;
    }

    public final float getPrimaryShadowDy() {
        return this.A01;
    }

    public final float getPrimaryShadowRadius() {
        return this.A02;
    }

    public final int getSecondaryShadowColor() {
        return this.A07;
    }

    public final float getSecondaryShadowDx() {
        return this.A03;
    }

    public final float getSecondaryShadowDy() {
        return this.A04;
    }

    public final float getSecondaryShadowRadius() {
        return this.A05;
    }

    public final void setPrimaryShadowColor(int i) {
        this.A06 = i;
        setShadowLayer(this.A02, this.A00, this.A01, i);
    }

    public final void setPrimaryShadowDx(float f) {
        this.A00 = f;
        setShadowLayer(this.A02, f, this.A01, this.A06);
    }

    public final void setPrimaryShadowDy(float f) {
        this.A01 = f;
        setShadowLayer(this.A02, this.A00, f, this.A06);
    }

    public final void setPrimaryShadowRadius(float f) {
        if (f > 25.0f) {
            f = 25.0f;
        }
        this.A02 = f;
        setShadowLayer(f, this.A00, this.A01, this.A06);
    }

    public final void setSecondaryShadowColor(int i) {
        this.A07 = i;
        invalidate();
    }

    public final void setSecondaryShadowDx(float f) {
        this.A03 = f;
        invalidate();
    }

    public final void setSecondaryShadowDy(float f) {
        this.A04 = f;
        invalidate();
    }

    public final void setSecondaryShadowRadius(float f) {
        if (f > 25.0f) {
            f = 25.0f;
        }
        this.A05 = f;
        invalidate();
    }

    public /* synthetic */ IgShadowTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int A03 = C0f9.A03(-866017109);
        C14360o3.A0B(canvas, 0);
        this.A09 = true;
        if (this.A07 != 0 && this.A05 > 0.0f) {
            this.A08 = getTextColors();
            setTextColor(0);
            setShadowLayer(this.A05, this.A03, this.A04, this.A07);
            super.draw(canvas);
            setTextColor(this.A08);
            setShadowLayer(this.A02, this.A00, this.A01, this.A06);
        }
        super.draw(canvas);
        this.A09 = false;
        C0f9.A0A(-1699494720, A03);
    }

    @Override // android.view.View
    public final void invalidate() {
        int A03 = C0f9.A03(-2121986126);
        if (!this.A09) {
            super.invalidate();
        }
        C0f9.A0A(-1922501361, A03);
    }

    public final void setPrimaryShadowColorResource(int i) {
        setPrimaryShadowColor(getContext().getColor(i));
    }

    public final void setPrimaryShadowDxResource(int i) {
        setPrimaryShadowDx(JQ0.A07(this, i));
    }

    public final void setPrimaryShadowDyResource(int i) {
        setPrimaryShadowDy(JQ0.A07(this, i));
    }

    public final void setPrimaryShadowRadiusResource(int i) {
        setPrimaryShadowRadius(JQ0.A07(this, i));
    }

    public final void setSecondaryShadowColorResource(int i) {
        setSecondaryShadowColor(getContext().getColor(i));
    }

    public final void setSecondaryShadowDxResource(int i) {
        setSecondaryShadowDx(JQ0.A07(this, i));
    }

    public final void setSecondaryShadowDyResource(int i) {
        setSecondaryShadowDy(JQ0.A07(this, i));
    }

    public final void setSecondaryShadowRadiusResource(int i) {
        setSecondaryShadowRadius(JQ0.A07(this, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgShadowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A1H, i, 0);
        try {
            setPrimaryShadowColor(obtainStyledAttributes.getColor(0, this.A06));
            setPrimaryShadowDx(obtainStyledAttributes.getDimension(1, this.A00));
            setPrimaryShadowDy(obtainStyledAttributes.getDimension(2, this.A01));
            setPrimaryShadowRadius(obtainStyledAttributes.getDimension(3, this.A02));
            setSecondaryShadowColor(obtainStyledAttributes.getColor(4, 0));
            setSecondaryShadowDx(obtainStyledAttributes.getDimension(5, this.A03));
            setSecondaryShadowDy(obtainStyledAttributes.getDimension(6, this.A04));
            setSecondaryShadowRadius(obtainStyledAttributes.getDimension(7, this.A05));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgShadowTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgShadowTextView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
