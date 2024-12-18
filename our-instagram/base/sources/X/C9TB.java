package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* renamed from: X.9TB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9TB extends ReplacementSpan {
    public int A00;
    public C6S5 A01 = C6S5.A05;
    public final C190868ci A02;
    public final EnumC190948cq A03;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int color;
        float f2;
        float f3;
        float f4;
        C14360o3.A0B(canvas, 0);
        AbstractC167007dF.A1I(charSequence, 1, paint);
        C190868ci c190868ci = this.A02;
        if (c190868ci != null) {
            if (paint instanceof TextPaint) {
                c190868ci.updateDrawState((TextPaint) paint);
            } else {
                paint.setColor(c190868ci.A05);
            }
        }
        canvas.save();
        float measureText = paint.measureText(charSequence.subSequence(i, i2).toString()) / 2.0f;
        canvas.translate(f + measureText, i4);
        canvas.rotate(this.A00);
        if (c190868ci != null) {
            color = c190868ci.A05;
        } else {
            color = paint.getColor();
        }
        int A04 = AbstractC13950nL.A04(color);
        int ordinal = this.A01.ordinal();
        if (ordinal != 3 && ordinal != 4) {
            f3 = -measureText;
            f4 = 0.0f;
        } else {
            paint.setColor(A04);
            paint.setStyle(Paint.Style.STROKE);
            float textSize = paint.getTextSize();
            EnumC190948cq enumC190948cq = this.A03;
            if (enumC190948cq != null) {
                f2 = enumC190948cq.A02;
            } else {
                f2 = 0.0f;
            }
            paint.setStrokeWidth(textSize * f2);
            paint.setStrokeJoin(Paint.Join.ROUND);
            f3 = -measureText;
            f4 = 0.0f;
            canvas.drawText(charSequence, i, i2, f3, 0.0f, paint);
            paint.setColor(color);
            AbstractC166987dD.A1R(paint);
        }
        canvas.drawText(charSequence, i, i2, f3, f4, paint);
        canvas.restore();
    }

    public C9TB(C190868ci c190868ci, EnumC190948cq enumC190948cq) {
        this.A02 = c190868ci;
        this.A03 = enumC190948cq;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        AbstractC167017dG.A1N(paint, charSequence);
        return (int) paint.measureText(charSequence, i, i2);
    }
}
