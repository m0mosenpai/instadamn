package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.1Zn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28521Zn {
    public final void A00(UserSession userSession, DirectShareTarget directShareTarget, String str, boolean z, boolean z2) {
        if ((directShareTarget != null && str != null && (str.startsWith("reel") || str.startsWith("live_replay_reel"))) || z2) {
            AbstractC25651Mw.A00(userSession).E4s(new C142686cU(directShareTarget, this, z, z2));
        }
        C54765OIa A00 = AbstractC47088Krj.A00(userSession);
        A00.A01.flowEndSuccess(A00.A00);
    }
}
