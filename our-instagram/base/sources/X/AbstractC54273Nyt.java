package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Nyt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54273Nyt {
    public static final NRG A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        NRG nrg = NRG.A02;
        if (nrg == null) {
            NRG nrg2 = new NRG(userSession);
            NRG.A02 = nrg2;
            return nrg2;
        }
        return nrg;
    }
}
