package X;

import java.util.List;

/* renamed from: X.SrY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63665SrY implements InterfaceC65466Tki, InterfaceC65309Thl {
    public final AbstractC63308ShE A00;
    public final AbstractC63308ShE A01;
    public final AbstractC63308ShE A02;
    public final Integer A03;
    public final List A04 = AbstractC166987dD.A1E();
    public final boolean A05;

    @Override // X.InterfaceC65309Thl
    public final void Dya() {
        int i = 0;
        while (true) {
            List list = this.A04;
            if (i < list.size()) {
                ((InterfaceC65309Thl) list.get(i)).Dya();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC65466Tki
    public final void ES5(List list, List list2) {
    }

    public C63665SrY(Ss3 ss3, AbstractC63678Srl abstractC63678Srl) {
        this.A05 = ss3.A04;
        this.A03 = ss3.A03;
        QAZ A00 = AbstractC63684Srr.A00(ss3.A02);
        this.A02 = A00;
        QAZ A002 = AbstractC63684Srr.A00(ss3.A00);
        this.A00 = A002;
        QAZ A003 = AbstractC63684Srr.A00(ss3.A01);
        this.A01 = A003;
        abstractC63678Srl.A0C(A00);
        abstractC63678Srl.A0C(A002);
        abstractC63678Srl.A0C(A003);
        A00.A09(this);
        A002.A09(this);
        A003.A09(this);
    }

    @Override // X.InterfaceC65466Tki
    public final String getName() {
        throw C00O.createAndThrow();
    }
}
