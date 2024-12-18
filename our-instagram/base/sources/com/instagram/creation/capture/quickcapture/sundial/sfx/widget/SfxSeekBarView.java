package com.instagram.creation.capture.quickcapture.sundial.sfx.widget;

import X.AbstractC126235nK;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC43594JPz;
import X.AbstractC53242c7;
import X.C01T;
import X.C14360o3;
import X.C17s;
import X.C17u;
import X.C50583MUt;
import X.JQ0;
import X.JTC;
import X.OU5;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class SfxSeekBarView extends View {
    public float A00;
    public int A01;
    public int A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final Paint A06;
    public final Paint A07;
    public final Paint A08;
    public final Paint A09;
    public final RectF A0A;
    public final RectF A0B;
    public final List A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfxSeekBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0C = AbstractC166987dD.A1E();
        this.A01 = 1;
        int A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_creation_button);
        int A04 = AbstractC167017dG.A04(context);
        Paint A0R = AbstractC166987dD.A0R();
        AbstractC166987dD.A1N(context, A0R, A0H);
        float f = A04;
        A0R.setStrokeWidth(f);
        A0R.setAntiAlias(true);
        Paint.Cap cap = Paint.Cap.ROUND;
        A0R.setStrokeCap(cap);
        this.A09 = A0R;
        this.A0B = AbstractC166987dD.A0X();
        this.A0A = AbstractC166987dD.A0X();
        this.A03 = AbstractC167017dG.A06(context) * 1.0f;
        this.A04 = AbstractC167017dG.A0A(context);
        Paint A0R2 = AbstractC166987dD.A0R();
        A0R2.setStrokeWidth(f);
        A0R2.setStrokeCap(cap);
        A0R2.setAntiAlias(true);
        AbstractC43594JPz.A14(context, A0R2, R.attr.igds_color_icon_badge);
        this.A07 = A0R2;
        Paint A0R3 = AbstractC166987dD.A0R();
        A0R3.setAntiAlias(true);
        A0R3.setStyle(Paint.Style.FILL);
        AbstractC43594JPz.A14(context, A0R3, R.attr.igds_color_tag_or_toast_background);
        this.A06 = A0R3;
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
        Paint A0R4 = AbstractC166987dD.A0R();
        AbstractC166987dD.A1N(context, A0R4, R.color.audio_bar_action_color_enabled);
        A0R4.setStyle(Paint.Style.FILL_AND_STROKE);
        A0R4.setAntiAlias(true);
        this.A08 = A0R4;
    }

    public final void A01(Bitmap bitmap, String str, int i, int i2) {
        C14360o3.A0B(str, 0);
        OU5 ou5 = new OU5(bitmap, this, str, i, i2);
        List list = this.A0C;
        list.add(ou5);
        if (list.size() > 1) {
            C01T.A1D(list, new C50583MUt(9));
        }
        postInvalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        RectF rectF = this.A0A;
        canvas.drawLine(rectF.left, rectF.top, rectF.right, rectF.bottom, this.A09);
        List<OU5> list = this.A0C;
        for (OU5 ou5 : list) {
            int i = ou5.A01;
            SfxSeekBarView sfxSeekBarView = ou5.A04;
            float f = sfxSeekBarView.A00;
            float f2 = sfxSeekBarView.A01;
            float f3 = sfxSeekBarView.A0A.bottom;
            canvas.drawLine((i * f) / f2, f3, ((i + ou5.A00) * f) / f2, f3, sfxSeekBarView.A07);
        }
        for (OU5 ou52 : list) {
            float A00 = OU5.A00(ou52);
            SfxSeekBarView sfxSeekBarView2 = ou52.A04;
            RectF rectF2 = sfxSeekBarView2.A0A;
            float centerY = rectF2.centerY();
            float f4 = sfxSeekBarView2.A03;
            Paint paint = sfxSeekBarView2.A07;
            canvas.drawCircle(A00, centerY, 3.0f + f4, paint);
            canvas.drawCircle(OU5.A00(ou52), rectF2.centerY(), f4, sfxSeekBarView2.A06);
            float f5 = sfxSeekBarView2.A04 * 0.5f;
            canvas.drawBitmap(ou52.A02, OU5.A00(ou52) - f5, sfxSeekBarView2.A0B.top - f5, paint);
        }
        canvas.drawCircle(getThumbCenterX(), this.A0B.top, this.A05, this.A08);
    }

    private final void A00() {
        RectF rectF = this.A0B;
        rectF.left = getPaddingStart();
        rectF.top = getPaddingTop() + this.A05 + AbstractC126235nK.A00(getContext(), 2);
        rectF.right = ((this.A02 * this.A00) / this.A01) + getPaddingStart();
        float f = rectF.top;
        rectF.bottom = f;
        RectF rectF2 = this.A0A;
        rectF2.left = rectF.left;
        rectF2.top = f;
        rectF2.right = getMeasuredWidth() - getPaddingEnd();
        rectF2.bottom = rectF.bottom;
    }

    private final float getThumbCenterX() {
        Float valueOf = Float.valueOf(this.A0B.right);
        float f = this.A05;
        return AbstractC166987dD.A09(C17s.A09(valueOf, new JTC(f, this.A0A.right - f)));
    }

    public final int getMax() {
        return this.A01;
    }

    public final int getProgress() {
        return this.A02;
    }

    public final void setMax(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            A00();
            postInvalidate();
        }
    }

    public final void setProgress(int i) {
        int A05 = C17s.A05(new C17u(0, this.A01), i);
        this.A02 = A05;
        this.A0B.right = ((A05 * this.A00) / this.A01) + getPaddingStart();
        postInvalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A00 = (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
        A00();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SfxSeekBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SfxSeekBarView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ SfxSeekBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
