package X;

import java.util.List;

/* renamed from: X.SrX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63664SrX implements InterfaceC65466Tki, InterfaceC65309Thl {
    public C62934SYc A00;
    public final AbstractC63308ShE A01;
    public final Q2O A02;

    @Override // X.InterfaceC65466Tki
    public final void ES5(List list, List list2) {
    }

    @Override // X.InterfaceC65309Thl
    public final void Dya() {
        this.A02.invalidateSelf();
    }

    public C63664SrX(Q2O q2o, C63685Srs c63685Srs, AbstractC63678Srl abstractC63678Srl) {
        this.A02 = q2o;
        AbstractC63308ShE ALc = c63685Srs.A00.ALc();
        this.A01 = ALc;
        abstractC63678Srl.A0C(ALc);
        ALc.A09(this);
    }

    @Override // X.InterfaceC65466Tki
    public final String getName() {
        throw C00O.createAndThrow();
    }
}
