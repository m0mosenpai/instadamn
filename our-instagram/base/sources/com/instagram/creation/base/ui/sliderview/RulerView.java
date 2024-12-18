package com.instagram.creation.base.ui.sliderview;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC53242c7;
import X.C14360o3;
import X.C56243Oxq;
import X.InterfaceC57813Pkf;
import X.JQ0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class RulerView extends View {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Rect A08;
    public InterfaceC57813Pkf A09;
    public int A0A;
    public boolean A0B;
    public final Paint A0C;
    public final Paint A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RulerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0C = AbstractC166987dD.A0R();
        this.A0D = AbstractC166987dD.A0R();
        this.A06 = getContext().getColor(AbstractC53242c7.A0B(context));
        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        this.A03 = Math.round(TypedValue.applyDimension(1, 20.0f, displayMetrics));
        this.A04 = 2;
        this.A07 = 5;
        Paint paint = this.A0D;
        paint.setColor(this.A06);
        paint.setTextSize(AbstractC166987dD.A04(resources, R.dimen.add_payment_bottom_sheet_row_subtitle_size));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        this.A08 = AbstractC166987dD.A0U();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        int i2 = this.A04;
        if (i2 % 2 != dimensionPixelSize % 2) {
            this.A04 = i2 + 1;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        float A08 = AbstractC166987dD.A08(this);
        float f = this.A01;
        float f2 = A08 * f;
        float f3 = A08 * ((1.0f - f) - this.A00);
        float f4 = this.A02;
        float f5 = f2 + ((1.0f - f4) * f3);
        float f6 = f3 * f4;
        int i = this.A0A;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                float f7 = (this.A03 * i2) + this.A05;
                if (i2 % this.A07 == 0) {
                    Paint paint = this.A0C;
                    paint.setColor(this.A06);
                    float f8 = this.A04 / 2.0f;
                    canvas.drawRect(f7 - f8, f2, f7 + f8, f2 + f3, paint);
                    A00(canvas, f7, f2, i2);
                } else {
                    Paint paint2 = this.A0C;
                    paint2.setColor(this.A06);
                    canvas.drawRect(f7, f5, f7 + 1.0f, f5 + f6, paint2);
                    A00(canvas, f7, f5, i2);
                }
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private final void A00(Canvas canvas, float f, float f2, int i) {
        String str;
        String formatStrLocaleSafe;
        InterfaceC57813Pkf interfaceC57813Pkf = this.A09;
        if (interfaceC57813Pkf != null && i % ((C56243Oxq) interfaceC57813Pkf).A00 == 0) {
            int i2 = i / 60;
            if (i2 == 0) {
                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(":%02d", Integer.valueOf(i % 60));
            } else {
                Integer valueOf = Integer.valueOf(i2);
                Integer valueOf2 = Integer.valueOf(i % 60);
                if (i2 < 10) {
                    str = "%01d:%02d";
                } else {
                    str = "%02d:%02d";
                }
                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, valueOf, valueOf2);
            }
            if (formatStrLocaleSafe != null) {
                Paint paint = this.A0D;
                int length = formatStrLocaleSafe.length();
                Rect rect = this.A08;
                paint.getTextBounds(formatStrLocaleSafe, 0, length, rect);
                C14360o3.A0A(rect);
                canvas.drawText(formatStrLocaleSafe, f, f2 + rect.centerY(), paint);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.A0B) {
            int size = View.MeasureSpec.getSize(i) - this.A05;
            this.A0A = ((size + r1) - 1) / this.A03;
        }
        setMeasuredDimension((this.A0A * this.A03) + (this.A05 * 2), View.MeasureSpec.getSize(i2));
    }

    public final void setNumIncrements(int i) {
        this.A0A = i;
        this.A0B = true;
    }

    public final void setLeftRightMarginRatio(float f) {
        this.A05 = AbstractC166987dD.A0A(f, getResources().getDisplayMetrics().widthPixels);
    }

    public final void setIncrementWidthPx(int i) {
        this.A03 = i;
    }

    public final void setLeftRightMarginPx(int i) {
        this.A05 = i;
    }

    public final void setLineLabeler(InterfaceC57813Pkf interfaceC57813Pkf) {
        this.A09 = interfaceC57813Pkf;
    }

    public final void setPaddingBottomRatio(float f) {
        this.A00 = f;
    }

    public final void setPaddingTopRatio(float f) {
        this.A01 = f;
    }

    public final void setSmallLineRatio(float f) {
        this.A02 = f;
    }

    public final void setSmallToLargeLineFrequency(int i) {
        this.A07 = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RulerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RulerView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ RulerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
