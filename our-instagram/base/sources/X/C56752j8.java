package X;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.Arrays;

/* renamed from: X.2j8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56752j8 extends AbstractC56722j5 implements InterfaceC56762j9 {
    public float A00;
    public ColorFilter A01;
    public Matrix A02;
    public Paint A03;
    public Paint A04;
    public Paint A05;
    public Shader A06;
    public C1349268q A07;
    public boolean A08;
    public Shader[] A09;
    public Path A0A;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.2ij, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.3LS, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [X.3LS, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.2ij, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3, types: [X.68w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [X.68w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, X.68y] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, X.68y] */
    @Override // X.AbstractC56722j5
    public final void A08(float f) {
        Shader shader;
        AbstractC56612iu abstractC56612iu = super.A04;
        C56562ip c56562ip = abstractC56612iu.A0f;
        AbstractC1348868e abstractC1348868e = abstractC56612iu.A0a;
        C56682j1 c56682j1 = this.A0B;
        C56692j2 c56692j2 = c56682j1.A03;
        C56562ip A00 = c56692j2.A00();
        Path path = this.A0A;
        AbstractC56652iy abstractC56652iy = c56682j1.A0E;
        float f2 = abstractC56652iy.A00;
        float f3 = c56682j1.A00;
        this.A0A = C3LU.A03(path, abstractC1348868e, c56562ip, A00, f, f2, f3, f3);
        C56502ij c56502ij = abstractC56612iu.A0S;
        AbstractC1348868e abstractC1348868e2 = abstractC56612iu.A0Z;
        if (c56502ij != null || abstractC1348868e2 != null) {
            if (this.A04 == null) {
                Paint paint = new Paint(1);
                this.A04 = paint;
                paint.setStyle(Paint.Style.FILL);
                this.A04.setColorFilter(this.A01);
            }
            float f4 = abstractC56652iy.A00;
            C56502ij c56502ij2 = c56692j2.A04;
            C56502ij c56502ij3 = c56502ij2;
            if (c56502ij2 == null) {
                ?? obj = new Object();
                c56692j2.A04 = obj;
                c56502ij3 = obj;
            }
            C56502ij c56502ij4 = (C56502ij) C3LT.A00(c56502ij, c56502ij3, abstractC1348868e2, f, f4);
            if (c56502ij4 != null) {
                this.A04.setARGB((c56502ij4.A00 * super.A01) / 255, c56502ij4.A03, c56502ij4.A02, c56502ij4.A01);
            }
        }
        AbstractC1348968m abstractC1348968m = abstractC56612iu.A0V;
        if (abstractC1348968m != null) {
            if (this.A04 == null) {
                Paint paint2 = new Paint(1);
                this.A04 = paint2;
                paint2.setColorFilter(this.A01);
            }
            if (abstractC1348968m.A05 == null && abstractC1348968m.A04 == null && abstractC1348968m.A02 == null && abstractC1348968m.A03 == null) {
                shader = this.A06;
                if (shader == null) {
                    float f5 = c56682j1.A00;
                    float f6 = abstractC56652iy.A00;
                    C1349768w c1349768w = c56692j2.A05;
                    C1349768w c1349768w2 = c1349768w;
                    if (c1349768w == null) {
                        int i = c56692j2.A00;
                        ?? obj2 = new Object();
                        C56502ij[] c56502ijArr = new C56502ij[i];
                        obj2.A01 = c56502ijArr;
                        for (int i2 = 0; i2 < i; i2++) {
                            c56502ijArr[i2] = new Object();
                        }
                        obj2.A00 = i;
                        c56692j2.A05 = obj2;
                        c1349768w2 = obj2;
                    }
                    C1349968y c1349968y = c56692j2.A07;
                    C1349968y c1349968y2 = c1349968y;
                    if (c1349968y == null) {
                        int i3 = c56692j2.A03;
                        ?? obj3 = new Object();
                        obj3.A01 = new float[i3];
                        obj3.A00 = i3;
                        c56692j2.A07 = obj3;
                        c1349968y2 = obj3;
                    }
                    C3LS c3ls = c56692j2.A06;
                    C3LS c3ls2 = c3ls;
                    if (c3ls == null) {
                        ?? obj4 = new Object();
                        c56692j2.A06 = obj4;
                        c3ls2 = obj4;
                    }
                    shader = AnonymousClass697.A00(c1349768w2, abstractC1348968m, c3ls2, c1349968y2, f, f5, f5, f6);
                    this.A06 = shader;
                }
            } else {
                Shader[] shaderArr = this.A09;
                if (shaderArr != null) {
                    float f7 = f - abstractC56612iu.A04;
                    float f8 = abstractC56652iy.A00;
                    int min = Math.min((int) (f7 * f8 * abstractC56652iy.A01), shaderArr.length - 1);
                    if (shaderArr[min] == null) {
                        float f9 = c56682j1.A00;
                        C1349768w c1349768w3 = c56692j2.A05;
                        C1349768w c1349768w4 = c1349768w3;
                        if (c1349768w3 == null) {
                            int i4 = c56692j2.A00;
                            ?? obj5 = new Object();
                            C56502ij[] c56502ijArr2 = new C56502ij[i4];
                            obj5.A01 = c56502ijArr2;
                            for (int i5 = 0; i5 < i4; i5++) {
                                c56502ijArr2[i5] = new Object();
                            }
                            obj5.A00 = i4;
                            c56692j2.A05 = obj5;
                            c1349768w4 = obj5;
                        }
                        C1349968y c1349968y3 = c56692j2.A07;
                        C1349968y c1349968y4 = c1349968y3;
                        if (c1349968y3 == null) {
                            int i6 = c56692j2.A03;
                            ?? obj6 = new Object();
                            obj6.A01 = new float[i6];
                            obj6.A00 = i6;
                            c56692j2.A07 = obj6;
                            c1349968y4 = obj6;
                        }
                        C3LS c3ls3 = c56692j2.A06;
                        C3LS c3ls4 = c3ls3;
                        if (c3ls3 == null) {
                            ?? obj7 = new Object();
                            c56692j2.A06 = obj7;
                            c3ls4 = obj7;
                        }
                        shaderArr[min] = AnonymousClass697.A00(c1349768w4, abstractC1348968m, c3ls4, c1349968y4, f, f9, f9, f8);
                    }
                    shader = shaderArr[min];
                }
            }
            if (shader != null) {
                this.A04.setAlpha(super.A01);
                this.A04.setShader(shader);
            }
        }
        if (abstractC56612iu.A0T == null && abstractC56612iu.A0d == null && abstractC56612iu.A09 == 0.0f && abstractC56612iu.A0l == null) {
            return;
        }
        this.A08 = false;
        float A002 = C3LR.A00(abstractC56612iu.A0l, abstractC56612iu.A09, f, abstractC56652iy.A00) * c56682j1.A00;
        this.A00 = A002;
        if (A002 == 0.0f) {
            this.A08 = true;
            return;
        }
        if (this.A05 == null) {
            Paint paint3 = new Paint(1);
            this.A05 = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            this.A05.setStrokeCap(Paint.Cap.values()[abstractC56612iu.A00]);
            this.A05.setStrokeJoin(Paint.Join.values()[abstractC56612iu.A01]);
            this.A05.setColorFilter(this.A01);
        }
        this.A05.setStrokeWidth(this.A00);
        C56502ij c56502ij5 = abstractC56612iu.A0T;
        AbstractC1348868e abstractC1348868e3 = abstractC56612iu.A0d;
        float f10 = abstractC56652iy.A00;
        C56502ij c56502ij6 = c56692j2.A04;
        C56502ij c56502ij7 = c56502ij6;
        if (c56502ij6 == null) {
            ?? obj8 = new Object();
            c56692j2.A04 = obj8;
            c56502ij7 = obj8;
        }
        C56502ij c56502ij8 = (C56502ij) C3LT.A00(c56502ij5, c56502ij7, abstractC1348868e3, f, f10);
        if (c56502ij8 != null) {
            this.A05.setARGB((c56502ij8.A00 * super.A01) / 255, c56502ij8.A03, c56502ij8.A02, c56502ij8.A01);
        }
        float A003 = C3LR.A00(abstractC56612iu.A0i, abstractC56612iu.A05, f, abstractC56652iy.A00) * c56682j1.A00;
        if (A003 < 0.0f) {
            return;
        }
        this.A05.setStrokeMiter(A003);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (r3.A08 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        r4.drawPath(r3.A0A, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003d, code lost:
    
        if (r1 != null) goto L13;
     */
    @Override // X.AbstractC56722j5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(android.graphics.Canvas r4) {
        /*
            r3 = this;
            android.graphics.Path r2 = r3.A0A
            if (r2 == 0) goto L2f
            X.2iu r0 = r3.A04
            byte r0 = r0.A03
            if (r0 != 0) goto L30
            android.graphics.Paint r0 = r3.A04
            if (r0 == 0) goto L11
            r4.drawPath(r2, r0)
        L11:
            android.graphics.Paint r1 = r3.A05
            if (r1 == 0) goto L1e
            boolean r0 = r3.A08
            if (r0 != 0) goto L1e
        L19:
            android.graphics.Path r0 = r3.A0A
            r4.drawPath(r0, r1)
        L1e:
            X.68q r0 = r3.A07
            if (r0 == 0) goto L2f
            android.graphics.Matrix r2 = r3.A02
            if (r2 == 0) goto L2f
            android.graphics.Paint r1 = r3.A03
            if (r1 == 0) goto L2f
            android.graphics.Bitmap r0 = r0.A00
            r4.drawBitmap(r0, r2, r1)
        L2f:
            return
        L30:
            android.graphics.Paint r1 = r3.A05
            if (r1 == 0) goto L3b
            boolean r0 = r3.A08
            if (r0 != 0) goto L3b
            r4.drawPath(r2, r1)
        L3b:
            android.graphics.Paint r1 = r3.A04
            if (r1 == 0) goto L1e
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56752j8.A0A(android.graphics.Canvas):void");
    }

    @Override // X.AbstractC56722j5
    public final void A0E(RectF rectF) {
        Path path = this.A0A;
        if (path != null) {
            path.computeBounds(rectF, false);
            float f = rectF.left;
            float f2 = this.A00 / 2.0f;
            rectF.set((f - f2) - 1.0f, (rectF.top - f2) - 1.0f, rectF.right + f2 + 1.0f, rectF.bottom + f2 + 1.0f);
        }
    }

    @Override // X.InterfaceC56762j9
    public final void ERi(ColorFilter colorFilter) {
        if (this.A01 != colorFilter) {
            this.A01 = colorFilter;
            Paint paint = this.A04;
            if (paint != null) {
                paint.setColorFilter(colorFilter);
            }
            Paint paint2 = this.A05;
            if (paint2 != null) {
                paint2.setColorFilter(colorFilter);
            }
        }
    }

    @Override // X.AbstractC56722j5
    public final void A07() {
        super.A07();
        Shader[] shaderArr = this.A09;
        if (shaderArr != null) {
            Arrays.fill(shaderArr, (Object) null);
        }
        Path path = this.A0A;
        if (path != null) {
            path.rewind();
        }
        this.A06 = null;
    }
}
