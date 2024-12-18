package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class GRU implements InterfaceC09250da, InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public GRU(C32324ELs c32324ELs, List list, int i, boolean z) {
        this.A00 = i;
        this.A01 = c32324ELs;
        this.A02 = list;
        this.A03 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final Object invoke(Object obj) {
        if (this.A00 != 0) {
            C32324ELs c32324ELs = (C32324ELs) this.A01;
            List list = (List) this.A02;
            boolean z = this.A03;
            C46h c46h = (C46h) obj;
            if (c46h instanceof C4JL) {
                C83693oE c83693oE = (C83693oE) c46h.A03();
                AbstractC31171DnF.A1L(c32324ELs);
                C7YF.A00(c32324ELs.A04).A02(c83693oE, AbstractC31172DnG.A18(AbstractC31172DnG.A0n(list, 0)), new GRU(c32324ELs, list, 0, z), true);
            } else {
                C32324ELs.A0B(c32324ELs, null, list, z);
            }
        } else {
            C32324ELs.A0B((C32324ELs) this.A01, (InterfaceC83713oG) obj, (List) this.A02, this.A03);
        }
        return C0eB.A00;
    }
}
