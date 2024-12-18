package com.instagram.feed.ui.text;

import X.AbstractC13880nE;
import X.AbstractC14710oj;
import X.AbstractC55922hc;
import X.C05F;
import X.C0f9;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;

/* loaded from: classes2.dex */
public class BulletAwareTextView extends TextView {
    public int A00;
    public boolean A01;
    public final float A02;

    private void A01(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A0A);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
            setLineSpacing(this.A00, 1.0f);
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        AbstractC14710oj.A07(getContext(), null, this, C05F.A00);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (!this.A01) {
            this.A01 = true;
            i4 += this.A00;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public BulletAwareTextView(Context context) {
        super(context);
        this.A01 = false;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        this.A02 = TypedValue.applyDimension(1, 0.5f, displayMetrics);
        A01(null);
    }

    private void A00() {
        Drawable drawable;
        if (getText() instanceof Spannable) {
            ImageSpan[] imageSpanArr = (ImageSpan[]) ((Spanned) getText()).getSpans(0, 1, ImageSpan.class);
            if (imageSpanArr.length != 0 && (drawable = imageSpanArr[0].getDrawable()) != null) {
                Rect bounds = drawable.getBounds();
                drawable.setBounds(bounds.left, 0, bounds.right, drawable.getIntrinsicHeight() + getOffset());
            }
        }
    }

    private int getOffset() {
        float f;
        if (getLineCount() != 1) {
            float f2 = this.A00;
            if (getLineCount() > 1) {
                f = this.A02;
            } else {
                f = 0.0f;
            }
            return (int) (f2 - f);
        }
        return 0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int A06 = C0f9.A06(24093417);
        super.onMeasure(i, i2);
        A00();
        C0f9.A0D(-1612750587, A06);
    }

    public void setSpacingAdd(int i) {
        int paddingBottom = getPaddingBottom();
        if (this.A01) {
            paddingBottom -= this.A00;
            this.A01 = false;
        }
        this.A00 = i;
        setLineSpacing(i, 1.0f);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), paddingBottom);
        A00();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (getLineCount() != 0) {
            A00();
        }
    }

    public BulletAwareTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = false;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        this.A02 = TypedValue.applyDimension(1, 0.5f, displayMetrics);
        A01(attributeSet);
    }

    public BulletAwareTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = false;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        this.A02 = TypedValue.applyDimension(1, 0.5f, displayMetrics);
        A01(attributeSet);
    }
}
