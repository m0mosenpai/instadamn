package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.IdP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41696IdP {
    public final UserSession A00;
    public final java.util.Set A01;

    public C41696IdP(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC166987dD.A1H();
    }

    public static final synchronized void A00(C41696IdP c41696IdP, int i, boolean z) {
        String str;
        synchronized (c41696IdP) {
            java.util.Set set = c41696IdP.A01;
            Integer valueOf = Integer.valueOf(i);
            if (set.contains(valueOf)) {
                C006802i c006802i = C006802i.A0p;
                if (z) {
                    str = AbstractC111324zv.A00(2407);
                } else {
                    str = "from_network";
                }
                c006802i.markerAnnotate(i, "load_source", str);
                C006802i.A0p.markerEnd(i, (short) 2);
                set.remove(valueOf);
            }
        }
    }

    public static final synchronized void A01(C41696IdP c41696IdP, String str, String str2, int i) {
        synchronized (c41696IdP) {
            java.util.Set set = c41696IdP.A01;
            set.add(AbstractC37303Gc4.A0N(set, i));
            C006802i.A0p.markerAnnotate(i, "prior_module", str);
            C006802i.A0p.markerAnnotate(i, "container_module", str2);
            C006802i.A0p.markerStart(i);
        }
    }

    public final synchronized void A02() {
        java.util.Set set = this.A01;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A0o(AbstractC167007dF.A0B(it));
        }
        set.clear();
    }
}
