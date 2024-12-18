package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HKK extends AbstractC38087GpG implements JPS {
    public final J69 A00;
    public final C38U A01;
    public final List A02 = AbstractC166987dD.A1E();

    public final void A05(AbstractC127945qN abstractC127945qN) {
        C127915qK c127915qK = abstractC127945qN.A02;
        boolean z = true;
        if (c127915qK.A02 != 1 || c127915qK.A04 != 1) {
            z = false;
        }
        C18C.A0F(z);
        this.A02.add(0, abstractC127945qN);
        A03();
    }

    @Override // X.InterfaceC43401JFq
    public final /* bridge */ /* synthetic */ C5qT BAL(InterfaceC66482zP interfaceC66482zP) {
        int indexOf = this.A02.indexOf(interfaceC66482zP);
        return new C5qT(indexOf / 3, indexOf % 3);
    }

    @Override // X.InterfaceC57967PnD
    public final /* bridge */ /* synthetic */ C5qT BAM(Object obj) {
        int indexOf = this.A02.indexOf(obj);
        return new C5qT(indexOf / 3, indexOf % 3);
    }

    @Override // X.XLO
    public final void EWn(C07X c07x, MTQ mtq) {
        super.A00.add(new C42420IqN(this, mtq));
    }

    public HKK(J69 j69, C38U c38u) {
        this.A01 = c38u;
        this.A00 = j69;
    }

    public final void A06(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC127945qN abstractC127945qN = (AbstractC127945qN) it.next();
            List list2 = this.A02;
            int size = list2.size();
            C127915qK c127915qK = abstractC127945qN.A02;
            boolean z = true;
            if (c127915qK.A02 != 1 || c127915qK.A04 != 1) {
                z = false;
            }
            C18C.A0F(z);
            list2.add(size, abstractC127945qN);
        }
        A03();
    }
}
