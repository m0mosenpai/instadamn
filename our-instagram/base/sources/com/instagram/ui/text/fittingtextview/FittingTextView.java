package com.instagram.ui.text.fittingtextview;

import X.AbstractC14710oj;
import X.AbstractC55922hc;
import X.C05F;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.facebook.R;
import com.instagram.common.ui.base.IgView;

/* loaded from: classes4.dex */
public class FittingTextView extends IgView {
    public float A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public StaticLayout A08;
    public Integer A09;
    public final TextPaint A0A;

    public FittingTextView(Context context) {
        this(context, null);
    }

    private int getMeasuredTextWidth() {
        return (int) this.A0A.measureText(this.A04);
    }

    public int getMinWidth() {
        return Math.min(this.A03.getIntrinsicWidth(), getMeasuredTextWidth());
    }

    public void setMaxWidth(int i) {
        this.A01 = i;
        requestLayout();
    }

    public void setText(String str) {
        this.A04 = str;
        A00();
        requestLayout();
    }

    private void A00() {
        int measuredTextWidth = getMeasuredTextWidth();
        String str = this.A04;
        this.A08 = new StaticLayout(str, 0, str.length(), this.A0A, measuredTextWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        int intValue = this.A09.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                if (this.A05) {
                    i = getPaddingLeft();
                } else {
                    i = 0;
                }
                int measuredHeight = getMeasuredHeight();
                Drawable drawable = this.A03;
                int intrinsicHeight = (measuredHeight - drawable.getIntrinsicHeight()) / 2;
                drawable.setBounds(i, intrinsicHeight, drawable.getIntrinsicWidth() + i, drawable.getIntrinsicHeight() + intrinsicHeight);
                drawable.draw(canvas);
                return;
            }
            return;
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        this.A08.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        Integer num;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int width = this.A08.getWidth() + paddingLeft;
        StaticLayout staticLayout = this.A08;
        if (staticLayout != null) {
            i3 = staticLayout.getHeight();
        } else {
            i3 = 0;
        }
        int paddingTop = i3 + (getPaddingTop() * 2);
        if (width > this.A01) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        this.A09 = num;
        Integer num2 = C05F.A00;
        if (num != num2) {
            int intrinsicWidth = this.A03.getIntrinsicWidth();
            if (!this.A05) {
                paddingLeft = 0;
            }
            width = intrinsicWidth + paddingLeft;
        }
        if (this.A09 != num2) {
            paddingTop = Math.max(this.A03.getIntrinsicHeight(), paddingTop);
        }
        setMeasuredDimension(width, paddingTop);
    }

    public FittingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Typeface typeface;
        this.A01 = 0;
        Integer num = C05F.A00;
        this.A09 = num;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0n, 0, 0);
        if (obtainStyledAttributes.hasValue(3) && obtainStyledAttributes.hasValue(1) && obtainStyledAttributes.hasValue(2)) {
            Drawable drawable = obtainStyledAttributes.getDrawable(1);
            drawable.getClass();
            this.A03 = drawable.mutate();
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                this.A04 = context.getString(resourceId);
                this.A00 = obtainStyledAttributes.getDimension(7, 0.0f);
                this.A01 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
                this.A06 = obtainStyledAttributes.getBoolean(4, false);
                this.A02 = obtainStyledAttributes.getColor(5, -1);
                this.A07 = obtainStyledAttributes.getBoolean(6, false);
                this.A05 = obtainStyledAttributes.getBoolean(8, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId2 != 0) {
                    setContentDescription(context.getString(resourceId2));
                }
                obtainStyledAttributes.recycle();
                this.A03.setTint(this.A02);
                TextPaint textPaint = new TextPaint();
                textPaint.setAntiAlias(true);
                float f = this.A00;
                textPaint.setTextSize(f <= 0.0f ? getResources().getDimensionPixelSize(R.dimen.font_large) : f);
                textPaint.setColor(this.A02);
                if (this.A07) {
                    textPaint.setShadowLayer(7.2f, 0.0f, 0.0f, getContext().getColor(R.color.black_25_transparent));
                }
                if (this.A06) {
                    num = C05F.A0C;
                    typeface = Typeface.DEFAULT_BOLD;
                } else {
                    typeface = null;
                }
                AbstractC14710oj.A06(context, typeface, textPaint, num);
                this.A0A = textPaint;
                A00();
                return;
            }
            throw new IllegalStateException("textId has invalid value");
        }
        obtainStyledAttributes.recycle();
        throw new RuntimeException("Fitting text, icon, and maximum width required.");
    }

    public FittingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
