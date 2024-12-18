package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextPaint;
import java.util.List;

/* renamed from: X.9qB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221469qB extends C202878y5 implements C6S2 {
    public final RectF A00 = AbstractC166987dD.A0X();
    public final int[] A01;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.WiU, X.XCW, java.lang.Object] */
    @Override // X.C6S2
    public final XCW Bz1() {
        int[] iArr = this.A01;
        Integer num = super.A00;
        C14360o3.A0B(iArr, 1);
        ?? obj = new Object();
        obj.A01 = AbstractC166987dD.A1E();
        for (int i : iArr) {
            List list = obj.A01;
            if (list != null) {
                list.add(Integer.valueOf(i));
            } else {
                C14360o3.A0F("gradientColorsList");
                throw C00O.createAndThrow();
            }
        }
        obj.A00 = num;
        return obj;
    }

    public C221469qB(Integer num, int[] iArr) {
        this.A01 = iArr;
        super.A00 = num;
    }

    @Override // X.C202878y5, android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        AbstractC167017dG.A1N(canvas, paint);
        C14360o3.A0B(charSequence, 7);
        super.drawBackground(canvas, paint, i, i2, i3, i4, i5, charSequence, i6, i7, i8);
        float f = i5 - i3;
        float f2 = 0.05f * f;
        RectF rectF = this.A00;
        float f3 = super.A01;
        float f4 = i4 + (f * 0.075f);
        rectF.set(f3, f4, f3 + this.A02, f4 + f2);
        TextPaint textPaint = this.A06;
        float f5 = super.A01;
        textPaint.setShader(new LinearGradient(f5, 0.0f, f5 + this.A02, 0.0f, this.A01, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawRoundRect(rectF, f2, f2, textPaint);
    }
}
