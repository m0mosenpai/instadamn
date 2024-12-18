package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class BQ2 implements InterfaceC41501vz {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public BQ2(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        List AZh;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1013212167);
                C57452kK c57452kK = (C57452kK) obj;
                int A0N = AbstractC167017dG.A0N(c57452kK, 1618721592);
                C38321qM c38321qM = c57452kK.A00;
                InterfaceC107774tM BEB = c38321qM.A0C.BEB();
                if (BEB != null && (AZh = BEB.AZh()) != null) {
                    C6FQ c6fq = (C6FQ) this.A01;
                    InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A02;
                    if (!(AZh instanceof Collection) || !AZh.isEmpty()) {
                        Iterator it = AZh.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (C14360o3.A0K(((InterfaceC107754tK) it.next()).getTitle(), "Welcome")) {
                                    if (c38321qM.A00 == 1) {
                                        C6BQ.A0E(c6fq, interfaceC103384lE, "");
                                    }
                                }
                            }
                        }
                    }
                }
                C0f9.A0A(654218915, A0N);
                i = -994902200;
                break;
            case 1:
                A03 = C0f9.A03(2085239787);
                C29150CtH c29150CtH = (C29150CtH) obj;
                int A0N2 = AbstractC167017dG.A0N(c29150CtH, 1862436055);
                String str = c29150CtH.A00;
                C25523BQl c25523BQl = (C25523BQl) this.A02;
                if (C14360o3.A0K(str, c25523BQl.A05.A06) && c25523BQl.A0I) {
                    AbstractC166987dD.A1Y(this.A01);
                }
                C0f9.A0A(-837697427, A0N2);
                i = -64241698;
                break;
            default:
                A03 = C0f9.A03(923198875);
                C25571BSi c25571BSi = (C25571BSi) obj;
                int A0N3 = AbstractC167017dG.A0N(c25571BSi, 1930982659);
                if (C14360o3.A0K(c25571BSi.A01, ((BLI) this.A02).A06)) {
                    AbstractC25227BEk.A1L((C51762Yz) this.A01, c25571BSi.A02);
                }
                C0f9.A0A(438460815, A0N3);
                i = 378342858;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
