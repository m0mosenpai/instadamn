package X;

import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class M4S implements Runnable {
    public final /* synthetic */ C2DU A00;
    public final /* synthetic */ C42281xI A01;

    public M4S(C2DU c2du, C42281xI c42281xI) {
        this.A00 = c2du;
        this.A01 = c42281xI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2EB c2eb;
        C2DU c2du = this.A00;
        C42281xI c42281xI = this.A01;
        synchronized (c2du) {
            List A1J = AbstractC166987dD.A1J(C2057498z.A00);
            C4I3 c4i3 = C4I3.A03;
            c2eb = C2EB.A04;
            Iterator it = c2du.A0Q(c2eb, c4i3, null, A1J).iterator();
            while (it.hasNext()) {
                C81663kb c81663kb = (C81663kb) it.next();
                User BJV = c81663kb.BJV();
                if (BJV != null && AbstractC43594JPz.A1Z(c42281xI.A00, BJV)) {
                    c2du.EGR(c81663kb.BKb(), true, false);
                    C46922Dg c46922Dg = c2du.A0C;
                    c46922Dg.A0I(1);
                    if (c81663kb.Cf8(c2du.A0A)) {
                        c46922Dg.A0N(C125575m3.A00, 1, c81663kb.CdS());
                    }
                }
            }
        }
        for (C81663kb c81663kb2 : c2du.Byz(c2eb)) {
            User BJV2 = c81663kb2.BJV();
            if (BJV2 != null && AbstractC43594JPz.A1Z(c42281xI.A00, BJV2)) {
                c2du.EGR(c81663kb2.BKb(), false, false);
                c2du.A0C.A0J(1);
            }
        }
    }
}
