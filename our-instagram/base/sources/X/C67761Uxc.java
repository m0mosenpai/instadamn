package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.Uxc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67761Uxc extends VKG {
    public float A00;
    public float A01;
    public float A02;
    public int A03;

    public static void A00(Canvas canvas, Paint paint, RectF rectF, C67761Uxc c67761Uxc, float f, float f2, float f3, boolean z) {
        float f4 = z ? -1.0f : 1.0f;
        canvas.save();
        canvas.rotate(f3);
        float f5 = c67761Uxc.A00;
        float f6 = f / 2.0f;
        float f7 = c67761Uxc.A03 * f4 * f2;
        canvas.drawRect((f5 - f6) + f2, Math.min(0.0f, f7), (f5 + f6) - f2, Math.max(0.0f, f7), paint);
        canvas.translate((c67761Uxc.A00 - f6) + f2, 0.0f);
        canvas.drawArc(rectF, 180.0f, (-f4) * 90.0f * c67761Uxc.A03, true, paint);
        canvas.translate(f - (f2 * 2.0f), 0.0f);
        canvas.drawArc(rectF, 0.0f, f4 * 90.0f * c67761Uxc.A03, true, paint);
        canvas.restore();
    }
}
