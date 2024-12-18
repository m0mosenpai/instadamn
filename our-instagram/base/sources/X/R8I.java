package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: classes10.dex */
public final class R8I extends AbstractC63487So1 {
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final Path A04;
    public final RectF A05;

    public R8I(Context context, int i) {
        DisplayMetrics A0K = AbstractC167007dF.A0K(context);
        C14360o3.A07(A0K);
        super.A01 = -16777216;
        super.A00 = TypedValue.applyDimension(2, 20.0f, A0K);
        this.A03 = i;
        this.A04 = AbstractC166987dD.A0T();
        this.A05 = AbstractC166987dD.A0X();
        this.A01 = TypedValue.applyDimension(1, 4.0f, A0K);
        this.A02 = 4.0f;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        AbstractC167007dF.A1K(canvas, paint);
        A00(paint);
        int i8 = this.A00;
        this.A00 = i8 + 1;
        RectF rectF = this.A05;
        float f = i;
        if (i8 == 0) {
            float f2 = this.A02;
            rectF.set(f, i3 - f2, this.A01 + f, i5 + f2);
            canvas.drawRoundRect(rectF, f2, f2, super.A02);
        } else {
            rectF.set(f, i3, this.A01 + f, i5);
            Path path = this.A04;
            path.reset();
            path.moveTo(rectF.left, rectF.bottom);
            path.lineTo(rectF.left, rectF.top);
            float f3 = rectF.left;
            float f4 = rectF.top;
            float f5 = this.A02;
            float f6 = f4 + f5;
            float f7 = rectF.right;
            path.cubicTo(f3, f6, f7, f6, f7, f4);
            path.lineTo(rectF.right, rectF.bottom);
            float f8 = rectF.right;
            float f9 = rectF.bottom;
            float f10 = f9 + f5;
            float f11 = rectF.left;
            path.cubicTo(f8, f10, f11, f10, f11, f9);
            path.lineTo(rectF.right, rectF.top);
            path.close();
            canvas.drawPath(path, super.A02);
        }
        if (this.A00 >= this.A03) {
            this.A00 = 0;
        }
    }
}
