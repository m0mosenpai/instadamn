package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1vL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41121vL implements InterfaceC13000lm {
    public final Map A00 = new LinkedHashMap();
    public final UserSession A01;

    public final void A00(Reel reel) {
        C37771pE c37771pE;
        Boolean bool;
        if (reel.A1a && reel.A0n()) {
            UserSession userSession = this.A01;
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36331089702175901L) && (c37771pE = reel.A0N) != null && (bool = c37771pE.A0r) != null && bool.booleanValue()) {
                return;
            }
            this.A00.put(reel.getId(), reel);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
    }

    public C41121vL(UserSession userSession) {
        this.A01 = userSession;
    }
}
