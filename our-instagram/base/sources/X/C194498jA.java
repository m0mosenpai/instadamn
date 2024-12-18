package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8jA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194498jA {
    public final UserSession A00;
    public final C55U A01;
    public final C194508jB A02;
    public final List A03;

    public C194498jA(UserSession userSession, C55U c55u) {
        C14360o3.A0B(c55u, 2);
        this.A00 = userSession;
        this.A01 = c55u;
        this.A03 = new ArrayList();
        this.A02 = new C194508jB(userSession);
    }

    public static final void A00(C194688jT c194688jT, C194498jA c194498jA, List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C9CO c9co = (C9CO) it.next();
                if (c9co.A02 == VFY.OPTED_IN) {
                    c194498jA.A03.add(c9co.A03);
                }
            }
            c194688jT.A00.A00();
        }
    }
}
