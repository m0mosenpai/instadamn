package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;

/* renamed from: X.Sre, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63671Sre implements InterfaceC65629Tpq, InterfaceC65309Thl, InterfaceC65630Tpr {
    public boolean A00;
    public final Q2O A04;
    public final AbstractC63308ShE A05;
    public final AbstractC63308ShE A06;
    public final AbstractC63308ShE A07;
    public final AbstractC63308ShE A08;
    public final AbstractC63308ShE A09;
    public final AbstractC63308ShE A0A;
    public final AbstractC63308ShE A0B;
    public final boolean A0C;
    public final Integer A0F;
    public final String A0G;
    public final boolean A0H;
    public final Path A02 = AbstractC166987dD.A0T();
    public final Path A01 = AbstractC166987dD.A0T();
    public final PathMeasure A03 = new PathMeasure();
    public final float[] A0D = new float[2];
    public final SK9 A0E = new SK9();

    @Override // X.InterfaceC65309Thl
    public final void Dya() {
        this.A00 = false;
        this.A04.invalidateSelf();
    }

    @Override // X.InterfaceC65466Tki
    public final void ES5(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC65466Tki interfaceC65466Tki = (InterfaceC65466Tki) list.get(i);
            if (interfaceC65466Tki instanceof C63665SrY) {
                C63665SrY c63665SrY = (C63665SrY) interfaceC65466Tki;
                if (c63665SrY.A03 == C05F.A00) {
                    this.A0E.A00.add(c63665SrY);
                    c63665SrY.A04.add(this);
                }
            }
        }
    }

    @Override // X.InterfaceC65467Tkj
    public final void AAj(C62961SZe c62961SZe, Object obj) {
        AbstractC63308ShE abstractC63308ShE;
        if (obj == InterfaceC65609To0.A0L) {
            abstractC63308ShE = this.A09;
        } else if (obj == InterfaceC65609To0.A0M) {
            abstractC63308ShE = this.A0B;
        } else if (obj == InterfaceC65609To0.A04) {
            abstractC63308ShE = this.A0A;
        } else if (obj != InterfaceC65609To0.A0H || (abstractC63308ShE = this.A05) == null) {
            if (obj == InterfaceC65609To0.A0J) {
                abstractC63308ShE = this.A07;
            } else if (obj != InterfaceC65609To0.A0I || (abstractC63308ShE = this.A06) == null) {
                if (obj != InterfaceC65609To0.A0K) {
                    return;
                } else {
                    abstractC63308ShE = this.A08;
                }
            }
        }
        abstractC63308ShE.A0A(c62961SZe);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e4, code lost:
    
        if (r4 != (r26 - 1.0d)) goto L51;
     */
    @Override // X.InterfaceC65629Tpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Path Bbd() {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63671Sre.Bbd():android.graphics.Path");
    }

    @Override // X.InterfaceC65466Tki
    public final String getName() {
        return this.A0G;
    }

    public C63671Sre(Q2O q2o, C63690Srx c63690Srx, AbstractC63678Srl abstractC63678Srl) {
        QAZ qaz;
        this.A04 = q2o;
        this.A0G = c63690Srx.A08;
        Integer num = c63690Srx.A07;
        this.A0F = num;
        this.A0H = c63690Srx.A09;
        this.A0C = c63690Srx.A0A;
        QAZ A00 = AbstractC63684Srr.A00(c63690Srx.A04);
        this.A09 = A00;
        AbstractC63308ShE ALc = c63690Srx.A06.ALc();
        this.A0A = ALc;
        QAZ A002 = AbstractC63684Srr.A00(c63690Srx.A05);
        this.A0B = A002;
        QAZ A003 = AbstractC63684Srr.A00(c63690Srx.A02);
        this.A07 = A003;
        QAZ A004 = AbstractC63684Srr.A00(c63690Srx.A03);
        this.A08 = A004;
        Integer num2 = C05F.A00;
        if (num == num2) {
            this.A05 = AbstractC63684Srr.A00(c63690Srx.A00);
            qaz = AbstractC63684Srr.A00(c63690Srx.A01);
        } else {
            qaz = null;
            this.A05 = null;
        }
        this.A06 = qaz;
        abstractC63678Srl.A0C(A00);
        abstractC63678Srl.A0C(ALc);
        abstractC63678Srl.A0C(A002);
        abstractC63678Srl.A0C(A003);
        abstractC63678Srl.A0C(A004);
        if (num == num2) {
            abstractC63678Srl.A0C(this.A05);
            abstractC63678Srl.A0C(this.A06);
        }
        A00.A09(this);
        ALc.A09(this);
        A002.A09(this);
        A003.A09(this);
        A004.A09(this);
        if (num == num2) {
            this.A05.A09(this);
            this.A06.A09(this);
        }
    }

    @Override // X.InterfaceC65467Tkj
    public final void EKH(C63221SfR c63221SfR, C63221SfR c63221SfR2, List list, int i) {
        AbstractC63251Sg7.A02(this, c63221SfR, c63221SfR2, list, i);
    }
}
