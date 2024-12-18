package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.TypedValue;

/* loaded from: classes5.dex */
public final class CUM {
    public int A00 = -16776961;
    public String A01;
    public boolean A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final Paint A07;
    public final TextPaint A08;

    public CUM(Context context) {
        this.A03 = TypedValue.applyDimension(1, 5.0f, AbstractC167007dF.A0K(context));
        this.A04 = TypedValue.applyDimension(1, 7.0f, AbstractC167007dF.A0K(context));
        this.A05 = TypedValue.applyDimension(1, 8.0f, AbstractC167007dF.A0K(context));
        this.A06 = TypedValue.applyDimension(1, 60.0f, AbstractC167007dF.A0K(context));
        float applyDimension = TypedValue.applyDimension(2, 14.0f, AbstractC167007dF.A0K(context));
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A07 = A0S;
        A0S.setStyle(Paint.Style.STROKE);
        TextPaint textPaint = new TextPaint(1);
        this.A08 = textPaint;
        AbstractC166987dD.A1R(textPaint);
        textPaint.setTextSize(applyDimension);
    }

    public final void A00(Canvas canvas, int i, int i2) {
        String str = this.A01;
        if (str != null) {
            TextPaint textPaint = this.A08;
            textPaint.setColor(-1431655766);
            canvas.drawRect(0.0f, 0.0f, i, i2, textPaint);
            textPaint.setColor(-16777216);
            float f = this.A05;
            float f2 = this.A06;
            if (AbstractC001900j.A0a(str, "\n", false)) {
                for (String str2 : (String[]) new C11L("\n").A03(str).toArray(new String[0])) {
                    canvas.drawText(str2, f, f2, textPaint);
                    f2 += textPaint.getTextSize() + 10.0f;
                }
            } else {
                canvas.drawText(str, f, f2, textPaint);
            }
        }
        if (this.A02) {
            Paint paint = this.A07;
            paint.setColor(-1);
            paint.setStrokeWidth(this.A04);
            float f3 = i;
            float f4 = i2;
            canvas.drawRect(0.0f, 0.0f, f3, f4, paint);
            paint.setColor(this.A00);
            paint.setStrokeWidth(this.A03);
            canvas.drawRect(0.0f, 0.0f, f3, f4, paint);
        }
    }
}
