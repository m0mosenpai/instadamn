package X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.5wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131635wz extends C126555nq {
    public C131645x0 A00;

    public C131645x0 getDecorationHelper() {
        return this.A00;
    }

    @Override // X.C126555nq, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C131645x0 c131645x0 = this.A00;
        if (c131645x0.A04) {
            Path path = c131645x0.A08;
            if (path.isEmpty()) {
                RectF rectF = c131645x0.A09;
                float f = c131645x0.A00;
                RectF rectF2 = c131645x0.A0A;
                rectF.set(f, f, rectF2.right - f, rectF2.bottom - f);
                Path.Direction direction = Path.Direction.CW;
                path.addRect(rectF2, direction);
                int i = c131645x0.A03;
                boolean A02 = AbstractC135616Bm.A02(i);
                float f2 = c131645x0.A02;
                if (A02) {
                    path.addRoundRect(rectF2, f2, f2, Path.Direction.CCW);
                } else {
                    float[] fArr = c131645x0.A0C;
                    AbstractC135616Bm.A01(fArr, f2, i);
                    path.addRoundRect(rectF2, fArr, direction);
                    Path path2 = c131645x0.A07;
                    path2.reset();
                    AbstractC135616Bm.A01(fArr, c131645x0.A01, c131645x0.A03);
                    path2.addRoundRect(rectF, fArr, direction);
                }
            }
            canvas.drawPath(path, c131645x0.A06);
            if (AbstractC135616Bm.A02(c131645x0.A03)) {
                RectF rectF3 = c131645x0.A09;
                float f3 = c131645x0.A01;
                canvas.drawRoundRect(rectF3, f3, f3, c131645x0.A05);
                return;
            }
            canvas.drawPath(c131645x0.A07, c131645x0.A05);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C131645x0 c131645x0 = this.A00;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF rectF = c131645x0.A0A;
        float f = measuredWidth;
        if (rectF.right != f || rectF.bottom != measuredHeight) {
            rectF.set(0.0f, 0.0f, f, measuredHeight);
            c131645x0.A08.reset();
        }
    }
}
