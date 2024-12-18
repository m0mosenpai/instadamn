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

/* renamed from: X.8y6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202888y6 extends MetricAffectingSpan implements C6S0, C6S2 {
    public int A00;
    public int A01;
    public int A02;
    public C6S5 A03;
    public boolean A04;
    public float[][] A05;
    public final float A06;
    public final Paint A07;
    public final Typeface A08;
    public final EnumC190948cq A09;
    public final Context A0A;

    public C202888y6(Context context, EnumC190948cq enumC190948cq, float[][] fArr, float f) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(enumC190948cq, 2);
        this.A0A = context;
        this.A09 = enumC190948cq;
        this.A06 = f;
        this.A05 = fArr;
        this.A07 = new Paint();
        this.A08 = AbstractC202838y1.A01(AbstractC15960qq.A00(context), enumC190948cq);
        this.A04 = true;
        this.A03 = C6S5.A05;
    }

    @Override // X.C6S0
    public final /* synthetic */ void AQP(Canvas canvas) {
    }

    @Override // X.C6S0
    public final void AQX(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
        int i6;
        C14360o3.A0B(canvas, 1);
        C14360o3.A0B(spanned, 2);
        C14360o3.A0B(paint, 7);
        if (this.A04 && i < this.A05.length) {
            Typeface typeface = this.A08;
            paint.setTypeface(typeface);
            float[] fArr = this.A05[i];
            if (fArr != null) {
                Paint paint2 = this.A07;
                paint2.set(paint);
                paint2.setTypeface(typeface);
                paint2.setColor(this.A00);
                paint2.setStyle(Paint.Style.STROKE);
                EnumC190948cq enumC190948cq = this.A09;
                paint2.setLetterSpacing(enumC190948cq.A00 + this.A06);
                paint2.setStrokeJoin(Paint.Join.ROUND);
                paint2.setStrokeWidth(paint.getTextSize() * enumC190948cq.A02);
                canvas.drawText(spanned, i2, i3, fArr[0], fArr[1], paint2);
                Float f = enumC190948cq.A03;
                if (f != null) {
                    float floatValue = f.floatValue();
                    if (this.A03 == C6S5.A07) {
                        i6 = this.A02;
                    } else {
                        i6 = this.A01;
                    }
                    paint2.setColor(i6);
                    paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                    paint2.setStrokeWidth(paint.getTextSize() * floatValue);
                    canvas.drawText(spanned, i2, i3, fArr[0], fArr[1], paint2);
                }
                C190868ci[] c190868ciArr = (C190868ci[]) C4GL.A06(spanned, C190868ci.class);
                if (c190868ciArr.length != 0) {
                    C190868ci c190868ci = c190868ciArr[0];
                    c190868ci.A01 = 0.0f;
                    c190868ci.A00 = 0.0f;
                }
            }
        }
    }

    @Override // X.C6S0
    public final void EfY(C6S5 c6s5) {
        C14360o3.A0B(c6s5, 0);
        this.A03 = c6s5;
    }

    @Override // X.C6S0
    public final void FCG(Layout layout, Integer num, float f, int i, int i2) {
        C14360o3.A0B(layout, 0);
        if (this.A04) {
            this.A05 = A2Z.A00(layout);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final /* synthetic */ boolean onPreDraw() {
        this.A04 = true;
        return true;
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        textPaint.setTypeface(this.A08);
        textPaint.setLetterSpacing(this.A09.A00 + this.A06);
    }

    @Override // X.C6S0
    public final int BgK() {
        return this.A01;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.Ai3, X.XCW, java.lang.Object] */
    @Override // X.C6S2
    public final XCW Bz1() {
        int i = this.A01;
        int i2 = this.A02;
        String name = this.A09.name();
        float f = this.A06;
        C6S5 c6s5 = this.A03;
        ArrayList arrayList = new ArrayList();
        float[][] fArr = this.A05;
        for (float[] fArr2 : fArr) {
            if (fArr2 != null) {
                arrayList.add(Float.valueOf(fArr2[0]));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (float[] fArr3 : fArr) {
            if (fArr3 != null) {
                arrayList2.add(Float.valueOf(fArr3[1]));
            }
        }
        C14360o3.A0B(name, 3);
        C14360o3.A0B(c6s5, 5);
        ?? obj = new Object();
        obj.A01 = i;
        obj.A02 = i2;
        obj.A04 = name;
        obj.A00 = f;
        obj.A03 = c6s5;
        obj.A05 = arrayList;
        obj.A06 = arrayList2;
        return obj;
    }

    @Override // X.C6S1
    public final Integer Bz4() {
        return C05F.A01;
    }

    @Override // X.C6S0
    public final C6S5 C6E() {
        return this.A03;
    }

    @Override // X.C6S0
    public final void ERf(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        if (this.A03 != C6S5.A07) {
            i = i2;
        }
        this.A00 = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            textPaint.setTypeface(this.A08);
            textPaint.setLetterSpacing(this.A09.A00 + this.A06);
        }
    }
}
