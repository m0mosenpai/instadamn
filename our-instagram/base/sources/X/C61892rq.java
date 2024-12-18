package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61892rq {
    public C3B9 A00;
    public boolean A01;
    public final UserSession A02;
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();
    public final boolean A05;

    public final void A00() {
        List list = this.A04;
        if (!list.isEmpty()) {
            list.clear();
            this.A03.clear();
            C3B9 c3b9 = this.A00;
            if (c3b9 != null) {
                C60662pp c60662pp = c3b9.A00;
                C3FY c3fy = c60662pp.A0B;
                if (c3fy != null) {
                    c3fy.A08();
                }
                c60662pp.A0R(4);
            }
        }
    }

    public C61892rq(UserSession userSession) {
        this.A02 = userSession;
        C17280tP A00 = C17280tP.A4E.A00();
        this.A05 = ((Boolean) A00.A1B.CES(A00, C17280tP.A4G[204])).booleanValue();
    }
}
