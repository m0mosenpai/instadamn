package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.Srj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63676Srj implements InterfaceC65309Thl, InterfaceC65628Tpp, InterfaceC65630Tpr {
    public float A00;
    public AbstractC63308ShE A01;
    public AbstractC63308ShE A02;
    public C63674Srh A03;
    public final Paint A04;
    public final Path A05;
    public final Q2O A06;
    public final AbstractC63308ShE A07;
    public final AbstractC63308ShE A08;
    public final AbstractC63678Srl A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;

    @Override // X.InterfaceC65466Tki
    public final void ES5(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            Object obj = list2.get(i);
            if (obj instanceof InterfaceC65629Tpq) {
                this.A0B.add(obj);
            }
        }
    }

    @Override // X.InterfaceC65467Tkj
    public final void AAj(C62961SZe c62961SZe, Object obj) {
        C63674Srh c63674Srh;
        AbstractC63308ShE abstractC63308ShE;
        C63674Srh c63674Srh2;
        C63674Srh c63674Srh3;
        C63674Srh c63674Srh4;
        C63674Srh c63674Srh5;
        AbstractC63678Srl abstractC63678Srl;
        AbstractC63308ShE abstractC63308ShE2;
        if (obj == InterfaceC65609To0.A0a) {
            abstractC63308ShE = this.A07;
        } else if (obj == InterfaceC65609To0.A0c) {
            abstractC63308ShE = this.A08;
        } else {
            if (obj == InterfaceC65609To0.A01) {
                AbstractC63308ShE abstractC63308ShE3 = this.A02;
                if (abstractC63308ShE3 != null) {
                    this.A09.A0M.remove(abstractC63308ShE3);
                }
                if (c62961SZe == null) {
                    this.A02 = null;
                    return;
                }
                QAV A00 = QAV.A00(c62961SZe);
                this.A02 = A00;
                A00.A09(this);
                abstractC63678Srl = this.A09;
                abstractC63308ShE2 = this.A02;
            } else if (obj == InterfaceC65609To0.A0B) {
                abstractC63308ShE = this.A01;
                if (abstractC63308ShE == null) {
                    QAV A002 = QAV.A00(c62961SZe);
                    this.A01 = A002;
                    A002.A09(this);
                    abstractC63678Srl = this.A09;
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

    @Override // X.InterfaceC65628Tpp
    public final void AQR(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (!this.A0C) {
            QAX qax = (QAX) this.A07;
            int A0B = qax.A0B(qax.A06.AuW(), qax.A04());
            Paint paint = this.A04;
            int i2 = 0;
            paint.setColor((AbstractC58322PtE.A03((int) ((((i / 255.0f) * AbstractC166987dD.A0H(this.A08.A06())) / 100.0f) * 255.0f)) << 24) | (A0B & 16777215));
            AbstractC58323PtF.A15(paint, this.A02);
            AbstractC63308ShE abstractC63308ShE = this.A01;
            if (abstractC63308ShE != null) {
                float A01 = AbstractC63308ShE.A01(abstractC63308ShE);
                if (A01 == 0.0f) {
                    blurMaskFilter = null;
                } else {
                    if (A01 != this.A00) {
                        AbstractC63678Srl abstractC63678Srl = this.A09;
                        if (abstractC63678Srl.A00 == A01) {
                            blurMaskFilter = abstractC63678Srl.A01;
                        } else {
                            blurMaskFilter = new BlurMaskFilter(A01 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                            abstractC63678Srl.A01 = blurMaskFilter;
                            abstractC63678Srl.A00 = A01;
                        }
                    }
                    this.A00 = A01;
                }
                paint.setMaskFilter(blurMaskFilter);
                this.A00 = A01;
            }
            C63674Srh c63674Srh = this.A03;
            if (c63674Srh != null) {
                c63674Srh.A00(paint);
            }
            Path path = this.A05;
            path.reset();
            while (true) {
                List list = this.A0B;
                if (i2 < list.size()) {
                    InterfaceC65629Tpq.A00(matrix, path, list, i2);
                    i2++;
                } else {
                    canvas.drawPath(path, paint);
                    return;
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
            List list = this.A0B;
            if (i < list.size()) {
                InterfaceC65629Tpq.A00(matrix, path, list, i);
                i++;
            } else {
                path.computeBounds(rectF, false);
                AbstractC58323PtF.A16(rectF, rectF.left, 1.0f);
                return;
            }
        }
    }

    @Override // X.InterfaceC65309Thl
    public final void Dya() {
        this.A06.invalidateSelf();
    }

    @Override // X.InterfaceC65466Tki
    public final String getName() {
        return this.A0A;
    }

    public C63676Srj(Q2O q2o, Ss4 ss4, AbstractC63678Srl abstractC63678Srl) {
        Integer num;
        Path A0T = AbstractC166987dD.A0T();
        this.A05 = A0T;
        Paint paint = new Paint(1);
        this.A04 = paint;
        this.A0B = AbstractC166987dD.A1E();
        this.A09 = abstractC63678Srl;
        this.A0A = ss4.A03;
        this.A0C = ss4.A04;
        this.A06 = q2o;
        SAK A08 = abstractC63678Srl.A08();
        if (A08 != null) {
            QAZ A00 = AbstractC63684Srr.A00(A08.A00);
            this.A01 = A00;
            A00.A09(this);
            abstractC63678Srl.A0C(this.A01);
        }
        SI6 A09 = abstractC63678Srl.A09();
        if (A09 != null) {
            this.A03 = new C63674Srh(this, abstractC63678Srl, A09);
        }
        QAf qAf = ss4.A01;
        if (qAf != null) {
            C58801QAi c58801QAi = ss4.A02;
            int intValue = abstractC63678Srl.A0L.A0G.intValue();
            if (intValue != 2) {
                if (intValue != 3) {
                    if (intValue != 4) {
                        if (intValue != 5) {
                            if (intValue != 16) {
                                num = null;
                            } else {
                                num = C05F.A04;
                            }
                        } else {
                            num = C05F.A09;
                        }
                    } else {
                        num = C05F.A08;
                    }
                } else {
                    num = C05F.A07;
                }
            } else {
                num = C05F.A06;
            }
            LD9.A00(paint, num);
            A0T.setFillType(ss4.A00);
            AbstractC63308ShE abstractC63308ShE = new AbstractC63308ShE(qAf.A00);
            this.A07 = abstractC63308ShE;
            abstractC63308ShE.A09(this);
            abstractC63678Srl.A0C(abstractC63308ShE);
            AbstractC63308ShE abstractC63308ShE2 = new AbstractC63308ShE(c58801QAi.A00);
            this.A08 = abstractC63308ShE2;
            abstractC63308ShE2.A09(this);
            abstractC63678Srl.A0C(abstractC63308ShE2);
            return;
        }
        this.A07 = null;
        this.A08 = null;
    }

    @Override // X.InterfaceC65467Tkj
    public final void EKH(C63221SfR c63221SfR, C63221SfR c63221SfR2, List list, int i) {
        AbstractC63251Sg7.A02(this, c63221SfR, c63221SfR2, list, i);
    }
}
