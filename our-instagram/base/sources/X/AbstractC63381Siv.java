package X;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/* renamed from: X.Siv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63381Siv {
    public static final void A05(Canvas canvas, Paint paint, RectF rectF, RectF rectF2, float f, float f2, float f3, float f4) {
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    public static final void A06(Canvas canvas, Paint paint, RectF rectF, RectF rectF2, float[] fArr, float[] fArr2) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static final void A07(Canvas canvas, Paint paint, MeasuredText measuredText, float f, float f2, int i, int i2, int i3, int i4, boolean z) {
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    public static final void A02(Canvas canvas) {
        canvas.disableZ();
    }

    public static final void A03(Canvas canvas) {
        canvas.enableZ();
    }

    public static final void A04(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    public static final void A08(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static final void A00(BlendMode blendMode, Canvas canvas, int i) {
        canvas.drawColor(i, blendMode);
    }

    public static final void A01(BlendMode blendMode, Canvas canvas, long j) {
        canvas.drawColor(j, blendMode);
    }
}
