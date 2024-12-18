package com.facebook.smartcapture.components;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC43592JPx;
import X.AbstractC47994LKy;
import X.C0f9;
import X.C14360o3;
import X.LMA;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import com.facebook.common.dextricks.StringTreeSet;

/* loaded from: classes8.dex */
public final class DottedAlignmentView extends View {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public ValueAnimator A05;
    public Bitmap A06;
    public float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final Paint A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DottedAlignmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A0B = A0S;
        A0S.setColor(AbstractC47994LKy.A01(context, R.attr.sc_always_white));
        Resources resources = getResources();
        float dimension = resources.getDimension(R.dimen.abc_button_inset_vertical_material);
        this.A09 = dimension;
        this.A0A = dimension / 2.0f;
        this.A08 = resources.getDimension(R.dimen.abc_action_bar_elevation_material);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        int i2 = (int) this.A07;
        int i3 = this.A04;
        for (int i4 = 0; i4 < i3; i4++) {
            Paint paint = this.A0B;
            int i5 = this.A02;
            if (i5 <= i4) {
                i5 += this.A04;
            }
            int i6 = i5 - i4;
            if (i6 >= this.A04 / 2) {
                i = StringTreeSet.MAX_SYMBOL_COUNT;
            } else {
                i = 255 - ((int) (i6 * this.A00));
            }
            paint.setAlpha(i);
            Bitmap bitmap = this.A06;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, i2, paint);
                i2 += bitmap.getHeight();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(715410182);
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.A09;
        float f2 = this.A08;
        float f3 = f + (2.0f * f2);
        int i5 = (int) f3;
        int i6 = i / i5;
        this.A03 = i6;
        int i7 = i2 / i5;
        this.A04 = i7;
        float f4 = i7;
        this.A00 = 127.5f / (f4 / 2.0f);
        this.A01 = (i - (i6 * f3)) / 2.0f;
        this.A07 = (i2 - (f4 * f3)) / 2.0f;
        Bitmap A0F = AbstractC167007dF.A0F(i, i5);
        Canvas A062 = AbstractC43592JPx.A06(A0F);
        this.A06 = A0F;
        float f5 = this.A01 + f2;
        float f6 = this.A0A;
        float f7 = f5 + f6;
        float f8 = f2 + f6;
        Paint A0S = AbstractC166987dD.A0S(1);
        A0S.setColor(-1);
        int i8 = this.A03;
        for (int i9 = 0; i9 < i8; i9++) {
            A062.drawCircle(f7, f8, f6, A0S);
            f7 += f3;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setRepeatMode(1);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setDuration(700L);
        valueAnimator.setValues(PropertyValuesHolder.ofInt("animation_property", 0, this.A04 + 1));
        LMA.A01(valueAnimator, this, 2);
        this.A05 = valueAnimator;
        C0f9.A0D(-2002386928, A06);
    }
}
