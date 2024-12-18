package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.OIb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54766OIb {
    public final /* synthetic */ AbstractC81363k6 A00;
    public final /* synthetic */ C1121854m A01;
    public final /* synthetic */ C63972vI A02;

    public C54766OIb(AbstractC81363k6 abstractC81363k6, C1121854m c1121854m, C63972vI c63972vI) {
        this.A00 = abstractC81363k6;
        this.A02 = c63972vI;
        this.A01 = c1121854m;
    }

    public final void A00(Reel reel, C41181vS c41181vS) {
        C63972vI c63972vI = this.A02;
        C14360o3.A0B(c41181vS, 0);
        UserSession userSession = c63972vI.A04;
        reel.A0S(userSession, c41181vS.A03());
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            c63972vI.A08.A06(c41181vS.A0k, userSession, c38321qM);
        }
    }
}
