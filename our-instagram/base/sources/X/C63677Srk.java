package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.Srk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63677Srk implements InterfaceC65309Thl, InterfaceC65628Tpp, InterfaceC65630Tpr {
    public float A00;
    public AbstractC63308ShE A01;
    public AbstractC63308ShE A02;
    public C63674Srh A03;
    public QAV A04;
    public final C003501a A05 = new C003501a();
    public final C003501a A06 = new C003501a();
    public final AbstractC63308ShE A07;
    public final AbstractC63308ShE A08;
    public final AbstractC63308ShE A09;
    public final int A0A;
    public final Paint A0B;
    public final Path A0C;
    public final RectF A0D;
    public final Q2O A0E;
    public final AbstractC63308ShE A0F;
    public final AbstractC63678Srl A0G;
    public final Integer A0H;
    public final String A0I;
    public final List A0J;
    public final boolean A0K;

    @Override // X.InterfaceC65466Tki
    public final void ES5(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            Object obj = list2.get(i);
            if (obj instanceof InterfaceC65629Tpq) {
                this.A0J.add(obj);
            }
        }
    }

    private int A00() {
        float f = this.A09.A02;
        float f2 = this.A0A;
        int A0A = AbstractC166987dD.A0A(f, f2);
        int A0A2 = AbstractC166987dD.A0A(this.A08.A02, f2);
        int A0A3 = AbstractC166987dD.A0A(this.A07.A02, f2);
        int i = 17;
        if (A0A != 0) {
            i = 527 * A0A;
        }
        if (A0A2 != 0) {
            i = i * 31 * A0A2;
        }
        if (A0A3 != 0) {
            return i * 31 * A0A3;
        }
        return i;
    }

    private int[] A01(int[] iArr) {
        QAV qav = this.A04;
        if (qav != null) {
            Integer[] numArr = (Integer[]) qav.A06();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length != length2) {
                iArr = new int[length2];
                while (i < length2) {
                    iArr[i] = MSW.A07(numArr, i);
                    i++;
                }
            } else {
                while (i < length) {
                    iArr[i] = MSW.A07(numArr, i);
                    i++;
                }
            }
        }
        return iArr;
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
        if (obj == InterfaceC65609To0.A0c) {
            abstractC63308ShE = this.A0F;
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
                QAV qav = new QAV(c62961SZe, null);
                this.A02 = qav;
                qav.A09(this);
                abstractC63678Srl = this.A0G;
                abstractC63308ShE2 = this.A02;
            } else if (obj == InterfaceC65609To0.A0f) {
                QAV qav2 = this.A04;
                if (qav2 != null) {
                    this.A0G.A0M.remove(qav2);
                }
                if (c62961SZe == null) {
                    this.A04 = null;
                    return;
                }
                this.A05.A07();
                this.A06.A07();
                QAV qav3 = new QAV(c62961SZe, null);
                this.A04 = qav3;
                qav3.A09(this);
                abstractC63678Srl = this.A0G;
                abstractC63308ShE2 = this.A04;
            } else if (obj == InterfaceC65609To0.A0B) {
                abstractC63308ShE = this.A01;
                if (abstractC63308ShE == null) {
                    QAV qav4 = new QAV(c62961SZe, null);
                    this.A01 = qav4;
                    qav4.A09(this);
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    @Override // X.InterfaceC65628Tpp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQR(android.graphics.Canvas r19, android.graphics.Matrix r20, int r21) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63677Srk.AQR(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // X.InterfaceC65628Tpp
    public final void Aho(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A0C;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.A0J;
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
        this.A0E.invalidateSelf();
    }

    @Override // X.InterfaceC65466Tki
    public final String getName() {
        return this.A0I;
    }

    public C63677Srk(SQ2 sq2, Q2O q2o, C63688Srv c63688Srv, AbstractC63678Srl abstractC63678Srl) {
        Path A0T = AbstractC166987dD.A0T();
        this.A0C = A0T;
        this.A0B = new Paint(1);
        this.A0D = AbstractC166987dD.A0X();
        this.A0J = AbstractC166987dD.A1E();
        this.A00 = 0.0f;
        this.A0G = abstractC63678Srl;
        this.A0I = c63688Srv.A06;
        this.A0K = c63688Srv.A07;
        this.A0E = q2o;
        this.A0H = c63688Srv.A05;
        A0T.setFillType(c63688Srv.A00);
        this.A0A = (int) (sq2.A00() / 32.0f);
        QAa qAa = new QAa(c63688Srv.A01.A00);
        this.A07 = qAa;
        qAa.A09(this);
        abstractC63678Srl.A0C(qAa);
        AbstractC63308ShE abstractC63308ShE = new AbstractC63308ShE(c63688Srv.A02.A00);
        this.A0F = abstractC63308ShE;
        abstractC63308ShE.A09(this);
        abstractC63678Srl.A0C(abstractC63308ShE);
        QAd qAd = new QAd(c63688Srv.A04.A00);
        this.A09 = qAd;
        qAd.A09(this);
        abstractC63678Srl.A0C(qAd);
        QAd qAd2 = new QAd(c63688Srv.A03.A00);
        this.A08 = qAd2;
        qAd2.A09(this);
        abstractC63678Srl.A0C(qAd2);
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
    }

    @Override // X.InterfaceC65467Tkj
    public final void EKH(C63221SfR c63221SfR, C63221SfR c63221SfR2, List list, int i) {
        AbstractC63251Sg7.A02(this, c63221SfR, c63221SfR2, list, i);
    }
}
