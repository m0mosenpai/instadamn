package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;

/* renamed from: X.Txl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65992Txl extends AbstractC56722j5 {
    public float A00;
    public Paint A01;
    public Path A02;
    public Path A03;
    public PathMeasure A04;
    public boolean A05;
    public boolean A06;
    public Path A07;
    public Path A08;

    /* JADX WARN: Type inference failed for: r0v47, types: [X.2ij, java.lang.Object] */
    @Override // X.AbstractC56722j5
    public final void A08(float f) {
        AbstractC56612iu abstractC56612iu = super.A04;
        C56562ip c56562ip = abstractC56612iu.A0f;
        AbstractC1348868e abstractC1348868e = abstractC56612iu.A0a;
        C56682j1 c56682j1 = this.A0B;
        C56692j2 c56692j2 = c56682j1.A03;
        C56562ip A00 = c56692j2.A00();
        Path path = this.A07;
        AbstractC56652iy abstractC56652iy = c56682j1.A0E;
        float f2 = abstractC56652iy.A00;
        float f3 = c56682j1.A00;
        Path A03 = C3LU.A03(path, abstractC1348868e, c56562ip, A00, f, f2, f3, f3);
        this.A07 = A03;
        if (A03 != null) {
            Path path2 = this.A08;
            if (!this.A06 || path2 == null || path2.isEmpty()) {
                float f4 = abstractC56612iu.A0H;
                C68i c68i = abstractC56612iu.A0o;
                float f5 = abstractC56652iy.A00;
                float A002 = C3LR.A00(c68i, f4, f, f5) / 100.0f;
                float A003 = C3LR.A00(abstractC56612iu.A0m, abstractC56612iu.A0F, f, f5) / 100.0f;
                float A004 = C3LR.A00(abstractC56612iu.A0n, abstractC56612iu.A0G, f, f5) / 360.0f;
                PathMeasure pathMeasure = this.A04;
                if (pathMeasure == null) {
                    this.A04 = new PathMeasure(A03, false);
                } else {
                    pathMeasure.setPath(A03, false);
                }
                float length = this.A04.getLength();
                if (length < 1.0f) {
                    path2 = null;
                } else {
                    if (path2 == null) {
                        path2 = new Path();
                    } else if (!path2.isEmpty()) {
                        path2.reset();
                    }
                    if (Math.abs(A003 - A002) >= 0.0015d) {
                        if ((A002 == 0.0f && A003 == 1.0f) || (A002 == 1.0f && A003 == 0.0f)) {
                            path2.set(A03);
                        } else {
                            float f6 = A002 * length;
                            float f7 = A003 * length;
                            if (f6 > f7) {
                                f7 = f6;
                                f6 = f7;
                            }
                            float f8 = A004 * length;
                            float f9 = f6 + f8;
                            float f10 = f7 + f8;
                            if (f9 < 0.0f) {
                                f9 = (f9 % length) + length;
                            }
                            if (f10 < 0.0f) {
                                f10 = (f10 % length) + length;
                            }
                            if (f9 > length || f10 > length) {
                                f9 %= length;
                                f10 %= length;
                            }
                            if (f9 > f10) {
                                Path path3 = this.A02;
                                if (path3 == null) {
                                    path3 = new Path();
                                } else if (!path3.isEmpty()) {
                                    path3.reset();
                                }
                                this.A02 = path3;
                                Path path4 = this.A03;
                                if (path4 == null) {
                                    path4 = new Path();
                                } else if (!path4.isEmpty()) {
                                    path4.reset();
                                }
                                this.A03 = path4;
                                this.A04.getSegment(0.0f, f10, this.A02, true);
                                this.A04.getSegment(f9, length, this.A03, true);
                                path2.addPath(this.A02);
                                path2.addPath(this.A03);
                            } else {
                                this.A04.getSegment(f9, f10, path2, true);
                            }
                        }
                    }
                }
            }
            this.A08 = path2;
            if (path2 != null) {
                if (abstractC56612iu.A0T == null && abstractC56612iu.A0d == null && abstractC56612iu.A09 == 0.0f && abstractC56612iu.A0l == null) {
                    return;
                }
                this.A05 = false;
                float A005 = C3LR.A00(abstractC56612iu.A0l, abstractC56612iu.A09, f, abstractC56652iy.A00) * c56682j1.A00;
                this.A00 = A005;
                if (A005 == 0.0f) {
                    this.A05 = true;
                    return;
                }
                if (this.A01 == null) {
                    Paint paint = new Paint(1);
                    this.A01 = paint;
                    paint.setStyle(Paint.Style.STROKE);
                    this.A01.setStrokeCap(Paint.Cap.values()[abstractC56612iu.A00]);
                    this.A01.setStrokeJoin(Paint.Join.values()[abstractC56612iu.A01]);
                }
                this.A01.setStrokeWidth(this.A00);
                C56502ij c56502ij = abstractC56612iu.A0T;
                AbstractC1348868e abstractC1348868e2 = abstractC56612iu.A0d;
                float f11 = abstractC56652iy.A00;
                C56502ij c56502ij2 = c56692j2.A04;
                C56502ij c56502ij3 = c56502ij2;
                if (c56502ij2 == null) {
                    ?? obj = new Object();
                    c56692j2.A04 = obj;
                    c56502ij3 = obj;
                }
                C56502ij c56502ij4 = (C56502ij) C3LT.A00(c56502ij, c56502ij3, abstractC1348868e2, f, f11);
                if (c56502ij4 != null) {
                    this.A01.setARGB((c56502ij4.A00 * super.A01) / 255, c56502ij4.A03, c56502ij4.A02, c56502ij4.A01);
                }
                float A006 = C3LR.A00(abstractC56612iu.A0i, abstractC56612iu.A05, f, abstractC56652iy.A00) * c56682j1.A00;
                if (A006 < 0.0f) {
                    return;
                }
                this.A01.setStrokeMiter(A006);
            }
        }
    }

    @Override // X.AbstractC56722j5
    public final void A0A(Canvas canvas) {
        Paint paint;
        Path path = this.A08;
        if (path != null && (paint = this.A01) != null && !this.A05) {
            canvas.drawPath(path, paint);
        }
    }

    @Override // X.AbstractC56722j5
    public final void A0E(RectF rectF) {
        Path path = this.A08;
        if (path != null) {
            path.computeBounds(rectF, false);
            float f = rectF.left;
            float f2 = this.A00 / 2.0f;
            rectF.set((f - f2) - 1.0f, (rectF.top - f2) - 1.0f, rectF.right + f2 + 1.0f, rectF.bottom + f2 + 1.0f);
        }
    }

    @Override // X.AbstractC56722j5
    public final void A07() {
        super.A07();
        Path path = this.A07;
        if (path != null) {
            path.rewind();
        }
        Path path2 = this.A08;
        if (path2 != null) {
            path2.rewind();
        }
    }
}
