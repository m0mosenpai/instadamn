package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3YT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YT {
    public final InterfaceC19630xq A00;
    public final UserSession A01;

    public C3YT(InterfaceC19630xq interfaceC19630xq, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC19630xq, 2);
        this.A01 = userSession;
        this.A00 = interfaceC19630xq;
    }

    public final void A02(C38321qM c38321qM, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        A03(c38321qM, z, true);
    }

    public final void A04(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            InterfaceC19610xo ARD = this.A00.ARD();
            ARD.E77(str, true);
            ARD.apply();
            UserSession userSession = this.A01;
            C38321qM A02 = C1DW.A00(userSession).A02(str);
            if (A02 != null) {
                A02.AEH(userSession);
            }
        }
    }

    public final boolean A05(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        return this.A00.getBoolean(c38321qM.getId(), false);
    }

    public final int A00(C38321qM c38321qM) {
        return this.A00.getInt(AnonymousClass001.A0R("hideMediaReason", c38321qM.getId()), -1);
    }

    public final void A01(C38321qM c38321qM, int i) {
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E7D(AnonymousClass001.A0R("hideMediaReason", c38321qM.getId()), i);
        ARD.apply();
    }

    public final void A03(C38321qM c38321qM, boolean z, boolean z2) {
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E77(c38321qM.getId(), z);
        ARD.apply();
        if (z2) {
            c38321qM.AEH(this.A01);
        }
    }
}
