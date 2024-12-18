package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.JuW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44918JuW extends C3QL {
    public final float A00;
    public final float A01;
    public final RectF A02;

    @Override // X.C3QL
    public final void A00(Canvas canvas, Paint paint) {
        C14360o3.A0B(paint, 1);
        canvas.drawRoundRect(this.A02, this.A00, this.A01, paint);
    }

    public C44918JuW(RectF rectF, float f, float f2) {
        this.A02 = rectF;
        this.A00 = f;
        this.A01 = f2;
    }
}
