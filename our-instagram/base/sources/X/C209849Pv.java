package X;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ImageSpan;
import android.text.style.LineBackgroundSpan;

/* renamed from: X.9Pv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C209849Pv implements LineBackgroundSpan {
    public float A00;
    public float A01;
    public int A02;
    public Paint A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Paint A08;
    public final RectF A09;
    public final boolean A0A;
    public final Rect A0B;

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        int i9;
        Paint paint2;
        boolean A1R = AbstractC167007dF.A1R(0, canvas, paint);
        C14360o3.A0B(charSequence, 7);
        String A03 = AbstractC13670mt.A03(charSequence.toString());
        Rect rect = this.A0B;
        paint.getTextBounds(A03, i6, i7, rect);
        if (charSequence instanceof Spannable) {
            C0s6 A00 = AbstractC13190m5.A00(((Spanned) charSequence).getSpans(i6, i7, ImageSpan.class));
            i9 = 0;
            while (A00.hasNext()) {
                DynamicDrawableSpan dynamicDrawableSpan = (DynamicDrawableSpan) A00.next();
                if (dynamicDrawableSpan.getDrawable() != null) {
                    i9 += AbstractC166997dE.A0H(dynamicDrawableSpan.getDrawable());
                }
            }
        } else {
            i9 = 0;
        }
        int width = rect.width() + i9;
        int i10 = (i + i2) / 2;
        RectF rectF = this.A09;
        int i11 = width / 2;
        int i12 = this.A06;
        rectF.set((i10 - i11) - i12, (rect.top + i4) - this.A05, i10 + i11 + i12, i4 + rect.bottom + this.A04);
        float f = this.A07;
        canvas.drawRoundRect(rectF, f, f, this.A08);
        if (this.A0A && (paint2 = this.A03) != null) {
            paint2.setColor(this.A02);
            float[] fArr = new float[2];
            float f2 = this.A00;
            fArr[0] = f2;
            fArr[A1R ? 1 : 0] = f2 / 1.5f;
            paint2.setPathEffect(new DashPathEffect(fArr, 0.0f));
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(this.A01);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawRoundRect(rectF, f, f, paint2);
        }
    }

    public C209849Pv(int i, int i2, int i3, boolean z, int i4, int i5) {
        this.A07 = i2;
        this.A06 = i3;
        this.A05 = i4;
        this.A04 = i5;
        this.A0A = z;
        Paint paint = new Paint(1);
        this.A08 = paint;
        this.A09 = new RectF();
        this.A0B = new Rect();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        if (z) {
            this.A03 = new Paint(1);
        }
    }
}
