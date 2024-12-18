package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Fz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70873Fz {
    public UserSession A00;
    public C3G0 A01 = new C3G0();

    public C70873Fz(UserSession userSession, List list) {
        C3G1 c3g1;
        this.A00 = userSession;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            UserSession userSession2 = this.A00;
            boolean equals = C17060sy.A01.A01(userSession2).equals(reel.A0D());
            boolean A16 = reel.A16(userSession2);
            if (reel.A0d()) {
                c3g1 = this.A01.A00;
                if (reel.A1Y) {
                    c3g1.A00++;
                } else {
                    c3g1.A01++;
                }
            } else {
                c3g1 = this.A01.A01;
                boolean z = reel.A1Y;
                if (equals) {
                    c3g1.A02 = 1;
                } else if (z) {
                    c3g1.A00++;
                } else if (A16) {
                    c3g1.A03++;
                } else {
                    c3g1.A01++;
                }
            }
        }
    }

    public C70873Fz() {
    }
}
