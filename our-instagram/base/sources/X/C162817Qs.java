package X;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.7Qs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162817Qs extends AbstractC148416mB {
    public float A00;
    public float A01;
    public float A02;
    public boolean A03;
    public final Path A04;
    public final RectF A05;
    public final RectF A06;
    public final C74843Xy A07;
    public final C74843Xy A08;
    public final C74843Xy A09;
    public final C74843Xy A0A;
    public final InterfaceC162837Qu A0B;
    public final float[] A0C;
    public final Rect A0D;

    public C162817Qs() {
        this(null, StringTreeSet.MAX_SYMBOL_COUNT);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C162817Qs(X.C74843Xy r9, int r10) {
        /*
            r8 = this;
            r2 = r9
            r3 = 0
            r4 = 0
            r1 = 0
            r0 = r10 & 1
            if (r0 == 0) goto Ld
            X.3Xy r2 = new X.3Xy
            r2.<init>()
        Ld:
            r0 = r10 & 2
            if (r0 == 0) goto L16
            X.3Xy r3 = new X.3Xy
            r3.<init>()
        L16:
            r0 = r10 & 4
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            if (r0 == 0) goto L1f
            r5 = 1065353216(0x3f800000, float:1.0)
        L1f:
            r0 = r10 & 8
            if (r0 != 0) goto L24
            r6 = 0
        L24:
            r7 = 0
            r0 = r10 & 32
            if (r0 == 0) goto L2e
            X.3Xy r4 = new X.3Xy
            r4.<init>()
        L2e:
            r0 = r10 & 64
            if (r0 == 0) goto L37
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
        L37:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162817Qs.<init>(X.3Xy, int):void");
    }

    public final boolean A02(C74843Xy c74843Xy, Integer num) {
        C14360o3.A0B(c74843Xy, 0);
        C74843Xy c74843Xy2 = this.A09;
        if (C14360o3.A0K(c74843Xy2, c74843Xy)) {
            return false;
        }
        this.A08.A08(c74843Xy2, C05F.A00);
        c74843Xy2.A08(c74843Xy, num);
        this.A03 = true;
        return true;
    }

    @Override // android.graphics.drawable.shapes.Shape
    public final void draw(Canvas canvas, Paint paint) {
        float[] fArr;
        C14360o3.A0B(canvas, 0);
        C14360o3.A0B(paint, 1);
        if (this.A03) {
            float[] fArr2 = this.A09.A01;
            C14360o3.A07(fArr2);
            float[] fArr3 = this.A0A.A01;
            C14360o3.A07(fArr3);
            C74843Xy c74843Xy = this.A07;
            float[] fArr4 = c74843Xy.A01;
            int length = fArr4.length;
            int i = 0;
            while (true) {
                fArr = this.A0C;
                if (i >= length) {
                    break;
                }
                fArr[i] = fArr2[i] + fArr3[i];
                i++;
            }
            if (c74843Xy != C74843Xy.A02) {
                System.arraycopy(fArr, 0, fArr4, 0, length);
                int A00 = C74843Xy.A00(C05F.A00);
                System.arraycopy(fArr, A00, fArr4, A00, fArr.length);
                C74843Xy.A01(c74843Xy);
            }
            this.A08.A08(c74843Xy, C05F.A00);
            float f = this.A00 / 2.0f;
            InterfaceC162837Qu interfaceC162837Qu = this.A0B;
            interfaceC162837Qu.ESC(c74843Xy);
            RectF rectF = this.A06;
            RectF rectF2 = this.A05;
            rectF.set(0.0f, 0.0f, rectF2.width() * this.A01, rectF2.height() * this.A02);
            rectF.inset(f, f);
            Path path = this.A04;
            path.rewind();
            path.addRoundRect(rectF, fArr4, Path.Direction.CW);
            interfaceC162837Qu.EQT(rectF);
            this.A03 = false;
        }
        this.A0B.AQS(canvas, paint);
    }

    @Override // android.graphics.drawable.shapes.Shape
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C162817Qs) {
                C162817Qs c162817Qs = (C162817Qs) obj;
                if (!C14360o3.A0K(this.A09, c162817Qs.A09) || !C14360o3.A0K(this.A0A, c162817Qs.A0A) || Float.compare(this.A01, c162817Qs.A01) != 0 || Float.compare(this.A02, c162817Qs.A02) != 0 || Float.compare(this.A00, c162817Qs.A00) != 0 || !C14360o3.A0K(this.A08, c162817Qs.A08) || !C14360o3.A0K(this.A05, c162817Qs.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.shapes.Shape
    public final void getOutline(Outline outline) {
        C14360o3.A0B(outline, 0);
        super.getOutline(outline);
        C74843Xy c74843Xy = this.A07;
        if (c74843Xy.A00 == C05F.A00) {
            RectF rectF = this.A06;
            Rect rect = this.A0D;
            rectF.round(rect);
            outline.setRoundRect(rect, c74843Xy.A01[0]);
            return;
        }
        outline.setConvexPath(this.A04);
    }

    @Override // android.graphics.drawable.shapes.Shape
    public final int hashCode() {
        return (((((((((((this.A09.hashCode() * 31) + this.A0A.hashCode()) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A08.hashCode()) * 31) + this.A05.hashCode();
    }

    @Override // android.graphics.drawable.shapes.Shape
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C162817Qs clone() {
        C74843Xy A04 = this.A09.A04();
        C74843Xy A042 = this.A0A.A04();
        C74843Xy A043 = this.A08.A04();
        RectF rectF = new RectF(this.A05);
        float f = this.A01;
        float f2 = this.A02;
        float f3 = this.A00;
        C14360o3.A0B(A04, 0);
        C14360o3.A0B(A042, 1);
        C14360o3.A0B(A043, 5);
        C162817Qs c162817Qs = new C162817Qs(rectF, A04, A042, A043, f, f2, f3);
        c162817Qs.A03 = true;
        return c162817Qs;
    }

    @Override // android.graphics.drawable.shapes.Shape
    public final void onResize(float f, float f2) {
        RectF rectF = this.A05;
        if (rectF.width() == f && rectF.height() == f2) {
            return;
        }
        rectF.set(0.0f, 0.0f, f, f2);
        this.A03 = true;
    }

    public C162817Qs(RectF rectF, C74843Xy c74843Xy, C74843Xy c74843Xy2, C74843Xy c74843Xy3, float f, float f2, float f3) {
        InterfaceC162837Qu interfaceC162837Qu;
        C14360o3.A0B(c74843Xy, 1);
        C14360o3.A0B(c74843Xy2, 2);
        C14360o3.A0B(c74843Xy3, 6);
        C14360o3.A0B(rectF, 7);
        this.A09 = c74843Xy;
        this.A0A = c74843Xy2;
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A08 = c74843Xy3;
        this.A05 = rectF;
        this.A0D = new Rect();
        this.A04 = new Path();
        C74843Xy c74843Xy4 = new C74843Xy();
        this.A07 = c74843Xy4;
        this.A06 = new RectF();
        if (Build.VERSION.SDK_INT < 29) {
            interfaceC162837Qu = new JUL();
        } else {
            interfaceC162837Qu = new InterfaceC162837Qu() { // from class: X.7Qt
                public static final RectF A02 = new RectF();
                public final C74843Xy A01 = new C74843Xy();
                public final RectF A00 = new RectF();

                @Override // X.InterfaceC162837Qu
                public final void AQS(Canvas canvas, Paint paint) {
                    C74843Xy c74843Xy5 = this.A01;
                    float[] fArr = c74843Xy5.A01;
                    C14360o3.A07(fArr);
                    switch (c74843Xy5.A00.intValue()) {
                        case 0:
                        case 1:
                            canvas.drawRoundRect(this.A00, fArr[0], fArr[1], paint);
                            return;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            canvas.drawDoubleRoundRect(this.A00, fArr, A02, fArr, paint);
                            return;
                        default:
                            throw new RuntimeException();
                    }
                }

                @Override // X.InterfaceC162837Qu
                public final void EQT(RectF rectF2) {
                    this.A00.set(rectF2);
                }

                @Override // X.InterfaceC162837Qu
                public final void ESC(C74843Xy c74843Xy5) {
                    this.A01.A08(c74843Xy5, C05F.A00);
                }
            };
        }
        this.A0B = interfaceC162837Qu;
        this.A0C = new float[c74843Xy4.A01.length];
    }
}
