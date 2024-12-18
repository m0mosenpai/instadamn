package com.instagram.creation.capture.quickcapture.cameracountdown;

import X.AbstractC13600mm;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC43592JPx;
import X.C2UY;
import X.C45340K4t;
import X.C55942hf;
import X.C55982hj;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;

/* loaded from: classes8.dex */
public class CountdownView extends View {
    public float A00;
    public int A01;
    public final float A02;
    public final float A03;
    public final Paint A04;
    public final Rect A05;
    public final RectF A06;
    public final TextPaint A07;
    public final String[] A08;
    public final C55982hj A09;

    public CountdownView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float A07 = AbstractC166987dD.A07(this);
        float A08 = AbstractC166987dD.A08(this);
        float f = this.A02 / 2.0f;
        float A01 = AbstractC13600mm.A01(this.A00, 0.0f, 1.0f, 0.0f, 360.0f);
        canvas.save();
        RectF rectF = this.A06;
        float f2 = this.A03;
        float f3 = f + f2;
        rectF.set(f3, f3, (A07 - f) - f2, (A08 - f) - f2);
        canvas.drawArc(rectF, A01 - 90.0f, 360.0f - A01, false, this.A04);
        canvas.restore();
        float A072 = AbstractC166987dD.A07(this);
        float A082 = AbstractC166987dD.A08(this);
        String str = this.A08[this.A01];
        TextPaint textPaint = this.A07;
        textPaint.getTextBounds(str, 0, str.length(), this.A05);
        canvas.drawText(str, A072 / 2.0f, (A082 / 2.0f) + (r0.height() / 2.0f), textPaint);
    }

    public void setProgress(float f) {
        this.A00 = f;
        int A01 = (int) AbstractC13600mm.A01(f, 0.0f, 1.0f, 2.999f, 0.0f);
        if (this.A01 != A01) {
            this.A01 = A01;
            C55982hj c55982hj = this.A09;
            c55982hj.A08(0.0d, true);
            c55982hj.A03();
            C2UY.A01.A03();
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A07.setTextSize(AbstractC166987dD.A07(this) * 0.375f);
    }

    public CountdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.A05 = AbstractC166987dD.A0U();
        this.A06 = AbstractC166987dD.A0X();
        String[] strArr = new String[3];
        int i3 = 0;
        do {
            i2 = i3 + 1;
            strArr[i3] = String.valueOf(i2);
            i3 = i2;
        } while (i2 < 3);
        this.A08 = strArr;
        this.A01 = 0;
        Resources resources = context.getResources();
        float A07 = AbstractC166997dE.A07(resources);
        this.A02 = A07;
        float A06 = AbstractC166997dE.A06(resources);
        this.A03 = A06;
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A04 = A0S;
        A0S.setColor(-1);
        AbstractC43592JPx.A1E(A0S);
        A0S.setStrokeWidth(A07);
        A0S.setStrokeCap(Paint.Cap.ROUND);
        TextPaint textPaint = new TextPaint(1);
        this.A07 = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setFakeBoldText(true);
        int color = context.getColor(R.color.black_15_transparent);
        A0S.setShadowLayer(A06, 0.0f, 0.0f, color);
        textPaint.setShadowLayer(A06, 0.0f, 0.0f, color);
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A09(C55942hf.A04(20.0d, 8.0d));
        this.A09 = A0R;
        A0R.A0A(new C45340K4t(this, 4));
    }

    public CountdownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
