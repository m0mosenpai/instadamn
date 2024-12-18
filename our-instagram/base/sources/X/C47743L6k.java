package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.L6k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47743L6k {
    public final L9R A00;
    public final UserSession A01;

    public final void A00(C7OH c7oh, List list, InterfaceC16660sJ interfaceC16660sJ, long j) {
        C14360o3.A0B(list, 2);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(C4H6.A03(AbstractC166987dD.A1B(it)));
        }
        if (A0q.isEmpty()) {
            interfaceC16660sJ.invoke(AbstractC167007dF.A0o(C16930sl.A00, 10019));
        } else {
            JVD.A00(new DI8(1, j, A0q, this, c7oh, interfaceC16660sJ, list), this.A01);
        }
    }

    public C47743L6k(UserSession userSession) {
        this.A01 = userSession;
        C14360o3.A0B(userSession, 0);
        this.A00 = (L9R) userSession.A01(L9R.class, MHS.A00(userSession, 14));
        C47880LDa.A00();
    }
}
