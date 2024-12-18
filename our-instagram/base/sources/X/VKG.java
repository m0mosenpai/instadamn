package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: classes11.dex */
public abstract class VKG {
    public AbstractC69617VsK A00;
    public AbstractC66307U8g A01;

    public final int A01() {
        if (this instanceof C67761Uxc) {
            C67756UxX c67756UxX = (C67756UxX) this.A00;
            return c67756UxX.A02 + (c67756UxX.A01 * 2);
        }
        return this.A00.A04;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
    
        if (r1 == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.graphics.Canvas r10, float r11) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VKG.A02(android.graphics.Canvas, float):void");
    }

    public final void A03(Canvas canvas, Paint paint) {
        if (this instanceof C67760Uxb) {
            C67760Uxb c67760Uxb = (C67760Uxb) this;
            int A01 = AbstractC69853Vwe.A01(((VKG) c67760Uxb).A00.A02, ((VKG) c67760Uxb).A01.A01);
            float f = ((-c67760Uxb.A02) / 2.0f) + c67760Uxb.A00;
            float f2 = -f;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setColor(A01);
            float f3 = c67760Uxb.A01;
            canvas.drawRect(f, (-f3) / 2.0f, f2, f3 / 2.0f, paint);
            float f4 = c67760Uxb.A00;
            float f5 = -f4;
            RectF rectF = new RectF(f5, f5, f4, f4);
            C67760Uxb.A00(canvas, paint, rectF, c67760Uxb.A01, c67760Uxb.A00, f, true);
            C67760Uxb.A00(canvas, paint, rectF, c67760Uxb.A01, c67760Uxb.A00, f2, false);
            return;
        }
        C67761Uxc c67761Uxc = (C67761Uxc) this;
        int A012 = AbstractC69853Vwe.A01(((VKG) c67761Uxc).A00.A02, ((VKG) c67761Uxc).A01.A01);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(A012);
        paint.setStrokeWidth(c67761Uxc.A02);
        float f6 = c67761Uxc.A00;
        float f7 = -f6;
        canvas.drawArc(new RectF(f7, f7, f6, f6), 0.0f, 360.0f, false, paint);
    }

    public final void A04(Canvas canvas, Paint paint, float f, float f2, int i) {
        float f3;
        if (this instanceof C67760Uxb) {
            C67760Uxb c67760Uxb = (C67760Uxb) this;
            if (f != f2) {
                float f4 = c67760Uxb.A02;
                float f5 = c67760Uxb.A00;
                float f6 = ((-f4) / 2.0f) + f5;
                float f7 = f4 - (f5 * 2.0f);
                float f8 = f6 + (f7 * f);
                float f9 = f6 + (f7 * f2);
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(true);
                paint.setColor(i);
                float f10 = c67760Uxb.A01;
                canvas.drawRect(f8, (-f10) / 2.0f, f9, f10 / 2.0f, paint);
                float f11 = c67760Uxb.A00;
                float f12 = -f11;
                RectF rectF = new RectF(f12, f12, f11, f11);
                C67760Uxb.A00(canvas, paint, rectF, c67760Uxb.A01, c67760Uxb.A00, f8, true);
                C67760Uxb.A00(canvas, paint, rectF, c67760Uxb.A01, c67760Uxb.A00, f9, false);
                return;
            }
            return;
        }
        C67761Uxc c67761Uxc = (C67761Uxc) this;
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(c67761Uxc.A02);
        float f13 = c67761Uxc.A03;
        float f14 = f * 360.0f * f13;
        if (f2 >= f) {
            f3 = f2 - f;
        } else {
            f3 = (f2 + 1.0f) - f;
        }
        float f15 = f3 * 360.0f * f13;
        float f16 = c67761Uxc.A00;
        float f17 = -f16;
        canvas.drawArc(new RectF(f17, f17, f16, f16), f14, f15, false, paint);
        if (c67761Uxc.A01 <= 0.0f || Math.abs(f15) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        float f18 = c67761Uxc.A01;
        float f19 = -f18;
        RectF rectF2 = new RectF(f19, f19, f18, f18);
        C67761Uxc.A00(canvas, paint, rectF2, c67761Uxc, c67761Uxc.A02, c67761Uxc.A01, f14, true);
        C67761Uxc.A00(canvas, paint, rectF2, c67761Uxc, c67761Uxc.A02, c67761Uxc.A01, f14 + f15, false);
    }
}
