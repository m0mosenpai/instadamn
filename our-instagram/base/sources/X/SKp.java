package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SKp {
    public final UserSession A00;

    public SKp(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(String str, Map map, String str2) {
        C19280xC A01 = C19280xC.A01(str, str2);
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            A01.A0C(AbstractC31172DnG.A17(A1K), AbstractC58318PtA.A0p(A1K));
        }
        AbstractC31173DnH.A1S(A01, this.A00);
    }
}
