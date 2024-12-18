package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.Sri, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63675Sri implements InterfaceC65309Thl, InterfaceC65628Tpp, InterfaceC65630Tpr {
    public float A00;
    public AbstractC63308ShE A01;
    public AbstractC63308ShE A02;
    public C63674Srh A03;
    public final Paint A04;
    public final AbstractC63308ShE A08;
    public final List A09;
    public final float[] A0A;
    public final Q2O A0C;
    public final AbstractC63308ShE A0D;
    public final AbstractC63308ShE A0E;
    public final AbstractC63678Srl A0G;
    public final PathMeasure A07 = new PathMeasure();
    public final Path A05 = AbstractC166987dD.A0T();
    public final Path A06 = AbstractC166987dD.A0T();
    public final RectF A0B = AbstractC166987dD.A0X();
    public final List A0F = AbstractC166987dD.A1E();

    public void AAj(C62961SZe c62961SZe, Object obj) {
        C63674Srh c63674Srh;
        AbstractC63308ShE abstractC63308ShE;
        C63674Srh c63674Srh2;
        C63674Srh c63674Srh3;
        C63674Srh c63674Srh4;
        C63674Srh c63674Srh5;
        AbstractC63678Srl abstractC63678Srl;
        AbstractC63308ShE abstractC63308ShE2;
        if (obj == InterfaceC65609To0.A0c) {
            abstractC63308ShE = this.A0D;
        } else if (obj == InterfaceC65609To0.A0P) {
            abstractC63308ShE = this.A0E;
        } else {
            if (obj == InterfaceC65609To0.A01) {
                AbstractC63308ShE abstractC63308ShE3 = this.A02;
                if (abstractC63308ShE3 != null) {
                    this.A0G.A0M.remove(abstractC63308ShE3);
                }
                if (c62961SZe == null) {
                    this.A02 = null;
                    return;
                }
                QAV A00 = QAV.A00(c62961SZe);
                this.A02 = A00;
                A00.A09(this);
                abstractC63678Srl = this.A0G;
                abstractC63308ShE2 = this.A02;
            } else if (obj == InterfaceC65609To0.A0B) {
                abstractC63308ShE = this.A01;
                if (abstractC63308ShE == null) {
                    QAV A002 = QAV.A00(c62961SZe);
                    this.A01 = A002;
                    A002.A09(this);
                    abstractC63678Srl = this.A0G;
                    abstractC63308ShE2 = this.A01;
                }
            } else if (obj == InterfaceC65609To0.A0b && (c63674Srh5 = this.A03) != null) {
                abstractC63308ShE = c63674Srh5.A01;
            } else {
                if (obj == InterfaceC65609To0.A0F && (c63674Srh4 = this.A03) != null) {
                    c63674Srh4.A01(c62961SZe);
                    return;
                }
                if (obj == InterfaceC65609To0.A0D && (c63674Srh3 = this.A03) != null) {
                    abstractC63308ShE = c63674Srh3.A02;
                } else if (obj == InterfaceC65609To0.A0E && (c63674Srh2 = this.A03) != null) {
                    abstractC63308ShE = c63674Srh2.A03;
                } else if (obj != InterfaceC65609To0.A0G || (c63674Srh = this.A03) == null) {
                    return;
                } else {
                    abstractC63308ShE = c63674Srh.A04;
                }
            }
            abstractC63678Srl.A0C(abstractC63308ShE2);
            return;
        }
        abstractC63308ShE.A0A(c62961SZe);
    }

    public void AQR(Canvas canvas, Matrix matrix, int i) {
        float f;
        float f2;
        BlurMaskFilter blurMaskFilter;
        float A01;
        float[] fArr = (float[]) AbstractC63359SiH.A00.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] != fArr[2] && fArr[1] != fArr[3]) {
            QAY qay = (QAY) this.A0D;
            Paint paint = this.A04;
            int i2 = 0;
            paint.setAlpha(AbstractC58322PtE.A03((int) ((((i / 255.0f) * qay.A0B(qay.A06.AuW(), qay.A04())) / 100.0f) * 255.0f)));
            paint.setStrokeWidth(((QAZ) this.A0E).A0B() * AbstractC63359SiH.A01(matrix));
            if (paint.getStrokeWidth() > 0.0f) {
                List list = this.A09;
                if (!list.isEmpty()) {
                    float A012 = AbstractC63359SiH.A01(matrix);
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        float[] fArr2 = this.A0A;
                        float A013 = AbstractC63308ShE.A01((AbstractC63308ShE) list.get(i3));
                        fArr2[i3] = A013;
                        float f3 = 0.1f;
                        if (i3 % 2 == 0) {
                            f3 = 1.0f;
                        }
                        if (A013 < f3) {
                            fArr2[i3] = f3;
                        }
                        fArr2[i3] = fArr2[i3] * A012;
                    }
                    AbstractC63308ShE abstractC63308ShE = this.A08;
                    if (abstractC63308ShE == null) {
                        A01 = 0.0f;
                    } else {
                        A01 = A012 * AbstractC63308ShE.A01(abstractC63308ShE);
                    }
                    paint.setPathEffect(new DashPathEffect(this.A0A, A01));
                }
                AbstractC58323PtF.A15(paint, this.A02);
                AbstractC63308ShE abstractC63308ShE2 = this.A01;
                if (abstractC63308ShE2 != null) {
                    float A014 = AbstractC63308ShE.A01(abstractC63308ShE2);
                    if (A014 == 0.0f) {
                        blurMaskFilter = null;
                    } else {
                        if (A014 != this.A00) {
                            AbstractC63678Srl abstractC63678Srl = this.A0G;
                            if (abstractC63678Srl.A00 == A014) {
                                blurMaskFilter = abstractC63678Srl.A01;
                            } else {
                                blurMaskFilter = new BlurMaskFilter(A014 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                                abstractC63678Srl.A01 = blurMaskFilter;
                                abstractC63678Srl.A00 = A014;
                            }
                        }
                        this.A00 = A014;
                    }
                    paint.setMaskFilter(blurMaskFilter);
                    this.A00 = A014;
                }
                C63674Srh c63674Srh = this.A03;
                if (c63674Srh != null) {
                    c63674Srh.A00(paint);
                }
                while (true) {
                    List list2 = this.A0F;
                    if (i2 < list2.size()) {
                        SD2 sd2 = (SD2) list2.get(i2);
                        if (sd2.A00 != null) {
                            C63665SrY c63665SrY = sd2.A00;
                            if (c63665SrY != null) {
                                Path path = this.A05;
                                path.reset();
                                List list3 = sd2.A01;
                                int size = list3.size();
                                while (true) {
                                    size--;
                                    if (size < 0) {
                                        break;
                                    } else {
                                        InterfaceC65629Tpq.A00(matrix, path, list3, size);
                                    }
                                }
                                float A015 = AbstractC63308ShE.A01(c63665SrY.A02) / 100.0f;
                                float A016 = AbstractC63308ShE.A01(c63665SrY.A00) / 100.0f;
                                float A017 = AbstractC63308ShE.A01(c63665SrY.A01) / 360.0f;
                                if (A015 < 0.01f && A016 > 0.99f) {
                                    canvas.drawPath(path, paint);
                                } else {
                                    PathMeasure pathMeasure = this.A07;
                                    pathMeasure.setPath(path, false);
                                    float length = pathMeasure.getLength();
                                    while (pathMeasure.nextContour()) {
                                        length += pathMeasure.getLength();
                                    }
                                    float f4 = A017 * length;
                                    float f5 = (A015 * length) + f4;
                                    float min = Math.min((A016 * length) + f4, (f5 + length) - 1.0f);
                                    float f6 = 0.0f;
                                    for (int A05 = AbstractC25226BEj.A05(list3); A05 >= 0; A05--) {
                                        Path path2 = this.A06;
                                        path2.set(((InterfaceC65629Tpq) list3.get(A05)).Bbd());
                                        path2.transform(matrix);
                                        pathMeasure.setPath(path2, false);
                                        float length2 = pathMeasure.getLength();
                                        if (min > length) {
                                            float f7 = min - length;
                                            if (f7 < f6 + length2 && f6 < f7) {
                                                if (f5 > length) {
                                                    f = (f5 - length) / length2;
                                                } else {
                                                    f = 0.0f;
                                                }
                                                f2 = Math.min(f7 / length2, 1.0f);
                                                AbstractC63359SiH.A03(path2, f, f2, 0.0f);
                                                canvas.drawPath(path2, paint);
                                                f6 += length2;
                                            }
                                        }
                                        float f8 = f6 + length2;
                                        if (f8 >= f5 && f6 <= min) {
                                            if (f8 > min || f5 >= f6) {
                                                if (f5 < f6) {
                                                    f = 0.0f;
                                                } else {
                                                    f = (f5 - f6) / length2;
                                                }
                                                if (min > f8) {
                                                    f2 = 1.0f;
                                                } else {
                                                    f2 = (min - f6) / length2;
                                                }
                                                AbstractC63359SiH.A03(path2, f, f2, 0.0f);
                                            }
                                            canvas.drawPath(path2, paint);
                                        }
                                        f6 += length2;
                                    }
                                }
                            }
                        } else {
                            Path path3 = this.A05;
                            path3.reset();
                            int size2 = sd2.A01.size();
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    break;
                                } else {
                                    InterfaceC65629Tpq.A00(matrix, path3, sd2.A01, size2);
                                }
                            }
                            canvas.drawPath(path3, paint);
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC65628Tpp
    public final void Aho(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A05;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.A0F;
            if (i < list.size()) {
                SD2 sd2 = (SD2) list.get(i);
                for (int i2 = 0; i2 < sd2.A01.size(); i2++) {
                    InterfaceC65629Tpq.A00(matrix, path, sd2.A01, i2);
                }
                i++;
            } else {
                RectF rectF2 = this.A0B;
                path.computeBounds(rectF2, false);
                AbstractC58323PtF.A16(rectF2, rectF2.left, ((QAZ) this.A0E).A0B() / 2.0f);
                rectF.set(rectF2);
                AbstractC58323PtF.A16(rectF, rectF.left, 1.0f);
                return;
            }
        }
    }

    @Override // X.InterfaceC65309Thl
    public final void Dya() {
        this.A0C.invalidateSelf();
    }

    public AbstractC63675Sri(Paint.Cap cap, Paint.Join join, Q2O q2o, C58799QAg c58799QAg, C58799QAg c58799QAg2, C58801QAi c58801QAi, AbstractC63678Srl abstractC63678Srl, List list, float f) {
        QAZ A00;
        Paint paint = new Paint(1);
        this.A04 = paint;
        this.A00 = 0.0f;
        this.A0C = q2o;
        this.A0G = abstractC63678Srl;
        AbstractC43592JPx.A1E(paint);
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f);
        this.A0D = new AbstractC63308ShE(c58801QAi.A00);
        this.A0E = AbstractC63684Srr.A00(c58799QAg);
        if (c58799QAg2 == null) {
            A00 = null;
        } else {
            A00 = AbstractC63684Srr.A00(c58799QAg2);
        }
        this.A08 = A00;
        this.A09 = AbstractC25230BEn.A0q(list);
        this.A0A = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.A09.add(AbstractC63684Srr.A00((AbstractC63684Srr) list.get(i)));
        }
        abstractC63678Srl.A0C(this.A0D);
        abstractC63678Srl.A0C(this.A0E);
        for (int i2 = 0; i2 < this.A09.size(); i2++) {
            abstractC63678Srl.A0C((AbstractC63308ShE) this.A09.get(i2));
        }
        AbstractC63308ShE abstractC63308ShE = this.A08;
        if (abstractC63308ShE != null) {
            abstractC63678Srl.A0C(abstractC63308ShE);
        }
        this.A0D.A09(this);
        this.A0E.A09(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((AbstractC63308ShE) this.A09.get(i3)).A09(this);
        }
        AbstractC63308ShE abstractC63308ShE2 = this.A08;
        if (abstractC63308ShE2 != null) {
            abstractC63308ShE2.A09(this);
        }
        SAK A08 = abstractC63678Srl.A08();
        if (A08 != null) {
            QAZ A002 = AbstractC63684Srr.A00(A08.A00);
            this.A01 = A002;
            A002.A09(this);
            abstractC63678Srl.A0C(this.A01);
        }
        SI6 A09 = abstractC63678Srl.A09();
        if (A09 != null) {
            this.A03 = new C63674Srh(this, abstractC63678Srl, A09);
        }
    }

    @Override // X.InterfaceC65466Tki
    public final void ES5(List list, List list2) {
        SD2 sd2 = null;
        C63665SrY c63665SrY = null;
        for (int A05 = AbstractC25226BEj.A05(list); A05 >= 0; A05--) {
            InterfaceC65466Tki interfaceC65466Tki = (InterfaceC65466Tki) list.get(A05);
            if (interfaceC65466Tki instanceof C63665SrY) {
                C63665SrY c63665SrY2 = (C63665SrY) interfaceC65466Tki;
                if (c63665SrY2.A03 == C05F.A01) {
                    c63665SrY = c63665SrY2;
                }
            }
        }
        if (c63665SrY != null) {
            c63665SrY.A04.add(this);
        }
        for (int A052 = AbstractC25226BEj.A05(list2); A052 >= 0; A052--) {
            InterfaceC65466Tki interfaceC65466Tki2 = (InterfaceC65466Tki) list2.get(A052);
            if (interfaceC65466Tki2 instanceof C63665SrY) {
                C63665SrY c63665SrY3 = (C63665SrY) interfaceC65466Tki2;
                if (c63665SrY3.A03 == C05F.A01) {
                    if (sd2 != null) {
                        this.A0F.add(sd2);
                    }
                    sd2 = new SD2(c63665SrY3);
                    c63665SrY3.A04.add(this);
                }
            }
            if (interfaceC65466Tki2 instanceof InterfaceC65629Tpq) {
                if (sd2 == null) {
                    sd2 = new SD2(c63665SrY);
                }
                sd2.A01.add(interfaceC65466Tki2);
            }
        }
        if (sd2 != null) {
            this.A0F.add(sd2);
        }
    }

    @Override // X.InterfaceC65467Tkj
    public final void EKH(C63221SfR c63221SfR, C63221SfR c63221SfR2, List list, int i) {
        AbstractC63251Sg7.A02(this, c63221SfR, c63221SfR2, list, i);
    }
}
