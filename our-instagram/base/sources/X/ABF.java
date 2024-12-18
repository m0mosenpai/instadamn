package X;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class ABF {
    public final C23031Ai A00;
    public final C13920nI A01;

    public final boolean A00(AlB alB) {
        if (alB == null) {
            return false;
        }
        HashSet A1H = AbstractC166987dD.A1H();
        InterfaceC19630xq interfaceC19630xq = this.A00.A01;
        String A00 = AbstractC111324zv.A00(2894);
        Iterator it = AbstractC001800i.A0X(interfaceC19630xq.C2v(A00)).iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            Long A0j = AbstractC166997dE.A0j(new C11L("^.*:").A00(A1B, ""));
            if (A0j != null && A0j.longValue() + 86400000 > System.currentTimeMillis()) {
                A1H.add(A1B);
            }
        }
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.EEj(A00);
        ARD.apply();
        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
        ARD2.E7L(A00, A1H);
        ARD2.apply();
        C189138Ze c189138Ze = alB.A00;
        String str = c189138Ze.A08;
        Iterator it2 = AbstractC001800i.A0X(interfaceC19630xq.C2v(A00)).iterator();
        while (it2.hasNext()) {
            if (C14360o3.A0K(new C11L(":.*$").A00(AbstractC166987dD.A1B(it2), ""), str)) {
                return true;
            }
        }
        Boolean BCy = c189138Ze.A01.BCy();
        if (BCy != null) {
            return BCy.booleanValue();
        }
        return false;
    }

    public ABF(C13920nI c13920nI, C23031Ai c23031Ai) {
        AbstractC167017dG.A1P(c23031Ai, c13920nI);
        this.A00 = c23031Ai;
        this.A01 = c13920nI;
    }
}
