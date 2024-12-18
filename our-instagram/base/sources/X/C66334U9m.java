package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.U9m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66334U9m extends MetricAffectingSpan implements C6S0, C6S2 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public C6S5 A0B = C6S5.A05;
    public float A0C;
    public float[][] A0D;
    public final Context A0E;
    public final Typeface A0F;

    @Override // X.C6S0
    public final /* synthetic */ void AQP(Canvas canvas) {
    }

    @Override // X.C6S0
    public final void AQX(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
        AbstractC167007dF.A1D(canvas, 1, spanned);
        C14360o3.A0B(paint, 7);
        if (i < this.A0D.length) {
            paint.setTypeface(this.A0F);
            float[] fArr = this.A0D[i];
            if (fArr != null) {
                paint.setColor(this.A06);
                float textSize = paint.getTextSize() * 0.03f;
                float f = 4.0f * textSize;
                canvas.drawText(spanned, i2, i3, fArr[0] + f, fArr[1] + f + this.A02, paint);
                paint.setColor(this.A04);
                float f2 = 3.0f * textSize;
                canvas.drawText(spanned, i2, i3, fArr[0] + f2, fArr[1] + f2 + this.A00, paint);
                paint.setColor(this.A07);
                float f3 = 2.0f * textSize;
                canvas.drawText(spanned, i2, i3, fArr[0] + f3, fArr[1] + f3 + this.A03, paint);
                paint.setColor(this.A05);
                canvas.drawText(spanned, i2, i3, fArr[0] + textSize, fArr[1] + textSize + this.A01, paint);
            }
        }
    }

    @Override // X.C6S0
    public final void EfY(C6S5 c6s5) {
        C14360o3.A0B(c6s5, 0);
        this.A0B = c6s5;
    }

    @Override // X.C6S0
    public final void FCG(Layout layout, Integer num, float f, int i, int i2) {
        C14360o3.A0B(layout, 0);
        this.A0C = f * 0.05f;
        int lineCount = layout.getLineCount();
        float[][] fArr = new float[lineCount];
        for (int i3 = 0; i3 < lineCount; i3++) {
            float[] fArr2 = new float[2];
            fArr2[0] = layout.getLineLeft(i3);
            fArr2[1] = layout.getLineBaseline(i3);
            fArr[i3] = fArr2;
        }
        this.A0D = fArr;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
    }

    @Override // X.C6S0
    public final int BgK() {
        return this.A08;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.VgJ] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.Wif, X.XCW, java.lang.Object] */
    @Override // X.C6S2
    public final XCW Bz1() {
        float f = this.A0C;
        int i = this.A0A;
        int i2 = this.A06;
        float[][] fArr = this.A0D;
        C6S5 c6s5 = this.A0B;
        C14360o3.A0B(fArr, 4);
        ?? obj = new Object();
        obj.A00 = f;
        obj.A02 = i;
        obj.A01 = i2;
        obj.A03 = c6s5;
        obj.A04 = new ArrayList();
        for (float[] fArr2 : fArr) {
            ?? obj2 = new Object();
            if (fArr2 != null) {
                obj2.A00 = fArr2[0];
                obj2.A01 = fArr2[1];
            }
            List list = obj.A04;
            if (list != null) {
                list.add(obj2);
            }
        }
        return obj;
    }

    @Override // X.C6S1
    public final /* synthetic */ Integer Bz4() {
        return C05F.A00;
    }

    @Override // X.C6S0
    public final C6S5 C6E() {
        return this.A0B;
    }

    @Override // X.C6S0
    public final void ERf(int i, int i2) {
        this.A08 = i;
        this.A09 = i2;
        C6S5 c6s5 = this.A0B;
        C6S5 c6s52 = C6S5.A06;
        int i3 = i;
        if (c6s5 == c6s52) {
            i3 = i2;
        }
        this.A0A = i3;
        int i4 = i2;
        if (c6s5 == c6s52) {
            i4 = i;
        }
        this.A06 = i4;
        this.A07 = AbstractC13950nL.A0A(i, i2, 1, 3);
        this.A05 = AbstractC13950nL.A0A(this.A08, this.A09, 1, 5);
        this.A04 = AbstractC13950nL.A0A(this.A08, this.A09, 3, 5);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final /* synthetic */ boolean onPreDraw() {
        return true;
    }

    public C66334U9m(Context context, float[][] fArr, float f) {
        this.A0E = context;
        this.A0C = f;
        this.A0D = fArr;
        this.A0F = AbstractC202838y1.A01(AbstractC15960qq.A00(context), EnumC190948cq.A0T);
    }
}
