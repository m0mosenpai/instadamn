package com.instagram.ui.igeditseekbar;

import X.AbstractC13600mm;
import X.AbstractC166987dD;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.AbstractC66357UBy;
import X.C05F;
import X.C14360o3;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class IgVerticalChunkySlider extends AbstractC66357UBy {
    public int A00;
    public int A01;
    public Paint A02;
    public Integer A03;
    public boolean A04;
    public final Paint A05;
    public final Paint A06;
    public final Paint A07;
    public final Path A08;
    public final Path A09;
    public final Rect A0A;
    public final RectF A0B;
    public final RectF A0C;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgVerticalChunkySlider(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    private final void setSliderProperties(Context context, TypedArray typedArray) {
        try {
            this.A00 = typedArray.getDimensionPixelSize(0, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            Paint paint = this.A05;
            Context context2 = getContext();
            int i = R.attr.seekBarActiveColor;
            paint.setColor(typedArray.getColor(2, AbstractC53242c7.A0F(context2, R.attr.seekBarActiveColor)));
            Paint paint2 = this.A06;
            paint2.setColor(typedArray.getColor(3, AbstractC53242c7.A0F(context2, R.attr.seekBarInactiveColor)));
            this.A04 = typedArray.getBoolean(1, false);
            typedArray.recycle();
            Resources resources = context.getResources();
            Paint paint3 = this.A07;
            paint3.setColor(-1);
            paint3.setShadowLayer(this.A00, this.A0C.left, 0.0f, -12303292);
            Paint.Style style = Paint.Style.FILL;
            paint3.setStyle(style);
            paint.setStyle(style);
            paint2.setStyle(style);
            Paint paint4 = new Paint();
            this.A02 = paint4;
            Integer num = this.A03;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            this.A01 = 0;
                        }
                    } else {
                        this.A01 = 0;
                        i = R.attr.seekBarTextColor;
                    }
                } else {
                    this.A01 = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
                    paint4 = this.A02;
                    C14360o3.A0A(paint4);
                }
                paint4.setColor(AbstractC53242c7.A0F(context2, i));
            }
            Paint paint5 = this.A02;
            C14360o3.A0A(paint5);
            paint5.setTextSize(resources.getDimensionPixelSize(R.dimen.auth_title_text_size));
            Paint paint6 = this.A02;
            C14360o3.A0A(paint6);
            paint6.setTextAlign(Paint.Align.CENTER);
            Paint paint7 = this.A02;
            C14360o3.A0A(paint7);
            paint7.setTypeface(Typeface.DEFAULT_BOLD);
            Paint paint8 = this.A02;
            C14360o3.A0A(paint8);
            paint8.setAntiAlias(true);
            setLayerType(1, null);
        } catch (Throwable th) {
            typedArray.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        int width = getWidth();
        int height = getHeight();
        Integer num = this.A03;
        if (num == C05F.A00) {
            A00(canvas, width / 2.0f, this.A0A.height());
        }
        RectF rectF = this.A0B;
        float f = width;
        float f2 = height;
        rectF.set(0.0f, this.A01, f, f2);
        if (this.A04) {
            rectF.inset(0.05f * f, 0.0f);
        } else {
            Path path = this.A08;
            path.reset();
            float f3 = this.A00;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
            path.close();
            canvas.clipPath(path);
        }
        int i = this.A01;
        float f4 = height - i;
        rectF.bottom = i + ((1.0f - super.A00) * f4);
        if (this.A04) {
            Path path2 = this.A09;
            path2.reset();
            path2.moveTo(rectF.left, rectF.bottom);
            path2.lineTo(rectF.left, rectF.top + this.A00);
            float f5 = rectF.left;
            float f6 = rectF.top;
            path2.quadTo(f5, f6, this.A00 + f5, f6);
            path2.lineTo(rectF.right - this.A00, rectF.top);
            float f7 = rectF.right;
            float f8 = rectF.top;
            path2.quadTo(f7, f8, f7, this.A00 + f8);
            path2.lineTo(rectF.right, rectF.bottom);
            path2.lineTo(rectF.left, rectF.bottom);
            canvas.drawPath(path2, this.A06);
        } else {
            canvas.drawRect(rectF, this.A06);
        }
        rectF.top = this.A01 + ((1.0f - super.A00) * f4);
        rectF.bottom = f2;
        if (this.A04) {
            Path path3 = this.A09;
            path3.reset();
            path3.moveTo(rectF.left, rectF.top);
            path3.lineTo(rectF.right, rectF.top);
            path3.lineTo(rectF.right, Math.max(rectF.top, rectF.bottom - this.A00));
            float f9 = rectF.right;
            float f10 = rectF.bottom;
            path3.quadTo(f9, f10, f9 - this.A00, f10);
            path3.lineTo(rectF.left + this.A00, rectF.bottom);
            float f11 = rectF.left;
            float f12 = rectF.bottom;
            path3.quadTo(f11, f12, f11, Math.max(rectF.top, f12 - this.A00));
            path3.lineTo(rectF.left, rectF.top);
            canvas.drawPath(path3, this.A05);
        } else {
            canvas.drawRect(rectF, this.A05);
        }
        if (num == C05F.A01) {
            A00(canvas, f / 2.0f, 0.9f * f2);
        }
        if (this.A04) {
            float f13 = f4 * 0.04f;
            RectF rectF2 = this.A0C;
            rectF2.left = 0.0f;
            rectF2.right = f;
            float A00 = AbstractC13600mm.A00(((int) rectF.top) - (f13 / 2.0f), 0.0f, f2 - f13);
            rectF2.top = A00;
            rectF2.bottom = A00 + f13;
            float f14 = this.A00;
            canvas.drawRoundRect(rectF2, f14, f14, this.A07);
        }
    }

    @Override // X.AbstractC66357UBy
    public int getCurrentPositionAsValue() {
        return Math.round(super.A00 * super.A02);
    }

    public final void setActivePaint(int i) {
        AbstractC166987dD.A1N(getContext(), this.A05, i);
    }

    public final void setThumbPaint(int i) {
        AbstractC166987dD.A1N(getContext(), this.A07, i);
    }

    private final void A00(Canvas canvas, float f, float f2) {
        String valueOf = String.valueOf(getCurrentPositionAsValue());
        Paint paint = this.A02;
        C14360o3.A0A(paint);
        paint.getTextBounds(valueOf, 0, valueOf.length(), this.A0A);
        Paint paint2 = this.A02;
        C14360o3.A0A(paint2);
        canvas.drawText(valueOf, f, f2, paint2);
        invalidate();
    }

    @Override // X.AbstractC66357UBy
    public int getLengthPx() {
        return getHeight();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgVerticalChunkySlider(Context context, AttributeSet attributeSet) {
        super(AbstractC53242c7.A0I(context, R.attr.seekBarStyle), attributeSet);
        int i;
        C14360o3.A0B(context, 1);
        this.A0B = new RectF();
        this.A0C = new RectF();
        this.A08 = new Path();
        this.A06 = new Paint(1);
        this.A05 = new Paint(1);
        this.A07 = new Paint(1);
        this.A0A = new Rect();
        this.A09 = new Path();
        Context context2 = getContext();
        int[] iArr = AbstractC55922hc.A13;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr);
        C14360o3.A07(obtainStyledAttributes);
        try {
            int i2 = obtainStyledAttributes.getInt(4, 0);
            for (Integer num : C05F.A00(3)) {
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == i2) {
                    this.A03 = num;
                    obtainStyledAttributes.recycle();
                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
                    C14360o3.A07(obtainStyledAttributes2);
                    setSliderProperties(context, obtainStyledAttributes2);
                    return;
                }
            }
            throw new IllegalArgumentException();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
